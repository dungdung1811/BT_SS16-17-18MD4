package com.ra.model.dao;

import com.ra.dto.request.UserLoginDTO;
import com.ra.model.entity.User;
import com.ra.unti.ConnectionDatabase;
import org.mindrot.jbcrypt.BCrypt;
import org.springframework.stereotype.Repository;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
@Repository
public class UserDaoImpl implements  UserDao{
    @Override
    public User login(String email, String hashedPassword) {
        Connection connection = ConnectionDatabase.openconnection();
        User   userData = new User();

        try (CallableStatement cstm = connection.prepareCall("{CALL GetUserByEmail(?)}")) {
            cstm.setString(1, email);

            try (ResultSet resultSet = cstm.executeQuery()) {
                while (resultSet.next()) {

                    userData.setUserID(resultSet.getInt("UserID"));
                    userData.setUserName(resultSet.getString("Name"));
                    userData.setEmail(resultSet.getString("Email"));
                    userData.setPhone(resultSet.getString("Phone"));
                    userData.setAddress(resultSet.getString("Address"));
                    userData.setPassWord(resultSet.getString("Password"));
                    userData.setRole(resultSet.getString("Role"));
                }
            }

            if (userData != null && BCrypt.checkpw(hashedPassword, userData.getPassWord())) {
                return userData;
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionDatabase.closeConnection(connection);
        }

        return null;
    }


    @Override
    public Boolean register(User user) {
        Connection connection = ConnectionDatabase.openconnection();
        String salt = BCrypt.gensalt(12);
        String hashedPass = BCrypt.hashpw(user.getPassWord(), salt);

        try (CallableStatement cstm = connection.prepareCall("{CALL InsertUser(?, ?, ?, ?, ?)}")) {
            cstm.setString(1, user.getUserName());
            cstm.setString(2, user.getEmail());
            cstm.setString(3, user.getPhone());
            cstm.setString(4, user.getAddress());
            cstm.setString(5, hashedPass);

            int check = cstm.executeUpdate();

            return check > 0;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionDatabase.closeConnection(connection);
        }
    }

}

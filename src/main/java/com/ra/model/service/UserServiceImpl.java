package com.ra.model.service;

import com.ra.dto.request.UserLoginDTO;
import com.ra.dto.request.UserRegisterDTO;
import com.ra.model.dao.UserDao;
import com.ra.model.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserDao userDao;

//    @Override
//    public UserLoginDTO changerPassword(UserLoginDTO userLoginDTO) {
//        UserLoginDTO userLoginDTO1 = new UserLoginDTO();
//        User user =  userDao.checkPassWord(userLoginDTO);
//        userLoginDTO1.setPassword(user.getPassWord());
//        return userLoginDTO1;
//    }


    @Override
    public User login(UserLoginDTO userLoginDTO) {
        User user = userDao.login(userLoginDTO.getEmail(), userLoginDTO.getPassword());
        return user;
    }

    @Override
    public Boolean register(UserRegisterDTO user) {
        User user1 = new User();// taoj ra 1 Object kieu du lieu User
//        thuc hien gan lai gia tri
        user1.setUserName(user.getUserName());
        user1.setEmail(user.getEmail());
        user1.setPhone(user.getPhone());
        user1.setAddress(user.getAddress());
        user1.setPassWord(user.getPassWord());

        userDao.register(user1);// kiểu dữ liệu của userDao nhận vào là object User.
        return false;
    }

}

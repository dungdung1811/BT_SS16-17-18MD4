package com.ra.model.dao;

import com.ra.dto.request.UserLoginDTO;
import com.ra.model.entity.User;

public interface UserDao {
    User login(String email, String hashedPassword);
    Boolean register (User user);

}

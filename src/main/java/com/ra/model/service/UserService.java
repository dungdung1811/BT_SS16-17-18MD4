package com.ra.model.service;

import com.ra.dto.request.UserLoginDTO;
import com.ra.dto.request.UserRegisterDTO;
import com.ra.dto.response.ResUserDTO;
import com.ra.model.entity.User;

public interface UserService {
    User  login(UserLoginDTO userLoginDTO);

    Boolean register (UserRegisterDTO userRegisterDTO);
}

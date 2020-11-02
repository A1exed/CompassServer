package com.pashin.CompassServer.service;

import com.pashin.CompassServer.dto.LoginDTO;
import com.pashin.CompassServer.entity.User;
import com.pashin.CompassServer.service.impl.UserService;

public class LoginService {

    IService<User> userService = new UserService();

    public LoginDTO tryToLogin(String username, String password) {
        return new LoginDTO(userService.findUser(username, password));
    }
}

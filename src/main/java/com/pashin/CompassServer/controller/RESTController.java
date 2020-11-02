package com.pashin.CompassServer.controller;

import com.pashin.CompassServer.dto.LoginDTO;
import com.pashin.CompassServer.service.LoginService;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class RESTController {

    LoginService loginService = new LoginService();

    @GetMapping("/login")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody
    LoginDTO encryptResult(@RequestParam String username, @RequestParam String password) {
        return loginService.tryToLogin(username, password);
    }
}

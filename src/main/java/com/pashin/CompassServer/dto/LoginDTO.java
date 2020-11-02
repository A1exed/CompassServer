package com.pashin.CompassServer.dto;

import java.io.Serializable;

public class LoginDTO implements Serializable {
    private boolean loginResult;

    public LoginDTO(boolean loginResult) {
        this.loginResult = loginResult;
    }

    public boolean getLoginResult() {
        return loginResult;
    }

    public void setLoginResult(boolean loginResult) {
        this.loginResult = loginResult;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "loginResult=" + loginResult +
                '}';
    }
}

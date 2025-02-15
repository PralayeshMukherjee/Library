package com.raj.library.DTO;

public class SellerLoginRequest {
    private String username;
    private String password;

    public SellerLoginRequest() {
    }

    public String getUserName() {
        return username;
    }

    public void setUserName(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

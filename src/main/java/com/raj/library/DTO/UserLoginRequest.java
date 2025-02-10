package com.raj.library.DTO;

//it's like a data type for parameters that are come from clint side
//It is not a function it is a class means blue print contains two data username and password
public class UserLoginRequest {
    private String userName;
    private String password;
    public UserLoginRequest() {};//default constructor
//    I don't take parameterize constructor here because I send the data in the form of Json and if I take parameterize constructor then Json don't know how to deserialization that
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

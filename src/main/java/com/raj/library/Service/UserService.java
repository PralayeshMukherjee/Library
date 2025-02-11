package com.raj.library.Service;

import com.raj.library.entity.User;
import com.raj.library.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    public void addUser(User user){
        userRepo.save(user);
    }
    public boolean checkUserName(User user){
        if(userRepo.existsById(user.getUserName())){
            return true;
        }else {
            return false;
        }
//        return userRepo.existsById(username);
    }
    private String userUserName;
    public boolean checkPassword(User user){
        Optional<User> byId = userRepo.findById(user.getUserName());
        System.out.println(byId.get().getPassword());
        System.out.println(user.getPassword());
        if(byId.get().getPassword().equals(user.getPassword())){
            userUserName = byId.get().getUserName();
            return true;
        }else{
            return false;
        }
    }
    public User getUser(){
        Optional<User> byId = userRepo.findById(userUserName);
        return byId.get();
    }
    public boolean userCheckerService(String username, String password){
        try {
            System.out.println(username);
            Optional<User> temp = userRepo.findById(username);
            if(temp.isPresent()){
                User myUser = temp.get();
                return myUser.getPassword().equals(password);
            }else{
                return false;
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return false;
    }
    public boolean deleteUser(User user){
        try {
            userRepo.delete(user);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }
}

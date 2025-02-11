package com.raj.library.controller;

import com.raj.library.DTO.RegisterUser;
import com.raj.library.Service.AdminService;
import com.raj.library.Service.UserService;
import com.raj.library.entity.Admin;
import com.raj.library.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/registration")
public class RegistrationController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/addAdmin")
    public String  addAdmin(@ModelAttribute Admin admin){
        adminService.addAdmin(admin);
        return "SuccessAdmin";
    }
    @GetMapping("/add-Admin")
    public String getMethodForAddAdmin(Model model){
        model.addAttribute("admin",new Admin());
        return "addAdmin";
    }

    @Autowired
    private UserService userService;

    @GetMapping("/add-User")
    public String addUser(Model model){
        model.addAttribute("user",new User());
        return "addUser";
    }

    @PostMapping("/addUser")
    public Map<String,Boolean> postUser(@RequestBody RegisterUser registerUser){
        String username = registerUser.getUsername();
        String password = registerUser.getPassword();
        String name = registerUser.getName();
        int age = Integer.parseInt(registerUser.getAge());
        String phoneNumber = registerUser.getPhoneNumber();
        String emailId = registerUser.getEmailId();
        String gender = registerUser.getGender();
        boolean isSaved = userService.addUser(username,password,name,age,phoneNumber,emailId,gender);
        return Map.of("saved",isSaved);
    }
}

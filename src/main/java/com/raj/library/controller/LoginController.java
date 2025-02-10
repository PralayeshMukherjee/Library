package com.raj.library.controller;

import com.raj.library.DTO.UserLoginRequest;
import com.raj.library.Service.AdminService;
import com.raj.library.Service.UserService;
import com.raj.library.entity.Admin;
import com.raj.library.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    AdminService adminService;

    @GetMapping("/admin-Login")
    public String adminLogin(Model model){
        model.addAttribute("adminLogin",new Admin());
        return "adminLogin";
    }
    @PostMapping("/adminLogin")
    public String adminChecker(@ModelAttribute Admin admin){
        if(adminService.checkUserName(admin)){
            if(adminService.checkPassword(admin)){
                return "redirect:/login/AdminDetails";
            }{
                return "wrongPasswordAdmin";
            }
        }else{
            return "noAdmin";
        }
    }
    @GetMapping("/AdminDetails")
    public String adminPage(){
        return "home";
    }


    @Autowired
    private UserService userService;

    @GetMapping("/User-Login")
    public String userLogin(Model model){
        model.addAttribute("userLogin",new User());
        return "userLogin";
    }
    @PostMapping("userLogin")
    public Map<String, Boolean> userChecker(@RequestBody UserLoginRequest userLoginRequest){
        String username = userLoginRequest.getUserName();
        String password = userLoginRequest.getPassword();
//        if(userService.checkUserName(username)){
//            if(userService.checkPassword(password)){
//                return "redirect:/login/UserDetails";
//            }{
//                return "wrongPasswordUser";
//            }
//        }else{
//            return "noUser";
//        }
        boolean isValid = userService.userCheckerService(username,password);
        return Map.of("exists",isValid);
    }
    @GetMapping("/UserDetails")
    public String userDetailsShow(Model model){
        model.addAttribute("details",userService.getUser());
        return "home";
    }
}

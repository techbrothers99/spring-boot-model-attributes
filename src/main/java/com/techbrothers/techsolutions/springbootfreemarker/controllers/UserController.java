/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techbrothers.techsolutions.springbootfreemarker.controllers;

import com.techbrothers.techsolutions.springbootfreemarker.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author chiru
 */
@Controller
public class UserController {
    
    @GetMapping("/user")
    public String showUserInfo(Model model){
        model.addAttribute("user", new User());
        return "user";
    } 
    
    @PostMapping(value = "/user")
    public String createUser(User user){
        System.out.println("User inform" + user);
        System.out.println("Create User method called");
        return null;
    }
}

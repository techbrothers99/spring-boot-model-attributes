/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.techbrothers99.springbootfreemarker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.techbrothers99.springbootfreemarker.domain.User;

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
    
}

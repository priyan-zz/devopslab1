package com.reverve.reverve.reverve.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.reverve.reverve.reverve.domain.Login;
import com.reverve.reverve.reverve.service.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller

public class LoginCtrl {
    @Autowired
    private LoginService service;

    @GetMapping("/")
    public String showLoginPage() {
        return "Login" ;
    }

    @PostMapping("/login")
    public String processLogin(@RequestBody String username, @RequestParam String password, Model mod) {
        //TODO: process POST request
        Login user2=service.login(username, password);
        if(user2!=null){
            return "redirect:/welcome";
        }
        else{
            mod.addAttribute("error", "Invalid Creds");
            return "login";
        }
    }

    @GetMapping("/login")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    
    

}
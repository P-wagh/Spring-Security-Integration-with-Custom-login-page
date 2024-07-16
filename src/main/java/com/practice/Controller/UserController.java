package com.practice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String showLoginForm() {
        return "login"; // The custom login form view
    }

    @RequestMapping("/user/userhome")
	public String userhome(){
        return "userhome";
    }
}

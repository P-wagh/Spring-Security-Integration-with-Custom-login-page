package com.practice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user/userhome")
	public String userhome(){
        return "userhome";
    }
}

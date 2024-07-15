package com.practice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.practice.model.User;
import com.practice.service.UserService;


import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class HomeController {
    
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/home", method=RequestMethod.GET)
    public String requestMethodName() {
        return "home";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }
    
    
	@PostMapping("/do_register")
	public String doRegister(@ModelAttribute("User") User user, Model model) {
        try {
            User u = userService.savUser(user);
            model.addAttribute("user", u);

            return "redirect:/user/userhome"; //give the name of userhome page

        } catch (Exception e) {
            e.printStackTrace();
            
            return "register";
        }
		
		
	}
	
}

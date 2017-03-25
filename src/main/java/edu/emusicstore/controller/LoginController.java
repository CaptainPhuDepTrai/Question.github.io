package edu.emusicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

/**
 * Created by tuanp on 07-Mar-17.
 */

@Controller
public class LoginController {

    @RequestMapping("/login")
    public String login(@RequestParam (value = "error", required = false) String error,
                        @RequestParam (value = "logout", required = false) String logout, Model model

                         ){

        if(error != null){
            model.addAttribute("error", "Invalid username and password");
        }

        if(logout != null){
            model.addAttribute("msg","you have been logged out successfully");

        }

        return "login";


    }

}

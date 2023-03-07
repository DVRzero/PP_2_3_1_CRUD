package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import web.service.UserService;

@org.springframework.stereotype.Controller
public class Controller {

    @Autowired
    private UserService userService;


    @GetMapping("/")
    public String allUsers(Model model) {
        model.addAttribute("allUsers", userService.allUsers());
        return "allUsers";
    }
}

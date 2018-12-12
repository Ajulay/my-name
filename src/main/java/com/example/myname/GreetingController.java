package com.example.myname;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class GreetingController {

    @GetMapping("/greeting/{name}")
    public String greeting(@PathVariable(name="name") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting.html";
    }

}
package com.uuu.demo1;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RootController {
    @GetMapping("/")
    public String home123(Model model) {
        model.addAttribute("message","Hi, FET with Spring Boot");
        return "home"; // template filename
    }
}

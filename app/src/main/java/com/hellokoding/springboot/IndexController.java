package com.hellokoding.springboot;

import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    private final Logger logger = Logger.getLogger(this.getClass().getName());

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("time", System.currentTimeMillis());
        return "index";
    }
}

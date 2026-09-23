package com.daksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Router {
	@RequestMapping("/calculator")
    public String page() {
        return "calculator";
    }
}

package com.daksh.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AddController {
//	public AddController() {System.out.println("Controller Created");}
	@RequestMapping("/add")
	public String add() {
		System.out.println("Controller Created");
		return "display.jsp";
	}
}

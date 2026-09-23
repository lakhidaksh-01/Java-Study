package com.daksh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class CalculationController {
	
	@RequestMapping("/div")
    public ModelAndView div(HttpServletRequest req, HttpServletResponse res) {
        int a=Integer.parseInt(req.getParameter("t1"));
        int b=Integer.parseInt(req.getParameter("t2"));
        int k=a/b;
        ModelAndView mv=new ModelAndView();
        mv.setViewName("calculator");
        mv.addObject("result",k);
        return mv;
    }
	
	@RequestMapping("/mul")
    public ModelAndView mul(HttpServletRequest req, HttpServletResponse res) {
        int a=Integer.parseInt(req.getParameter("t1"));
        int b=Integer.parseInt(req.getParameter("t2"));
        int k=a*b;
        ModelAndView mv=new ModelAndView();
        mv.setViewName("calculator");
        mv.addObject("result",k);
        return mv;
    }
    
    
    @RequestMapping("/add")
    public ModelAndView add(HttpServletRequest req, HttpServletResponse res) {
        int a=Integer.parseInt(req.getParameter("t1"));
        int b=Integer.parseInt(req.getParameter("t2"));
        int k=a+b;
        ModelAndView mv=new ModelAndView();
        mv.setViewName("calculator");
        mv.addObject("result",k);
        return mv;
    }
    
    
	@RequestMapping("/sub")
    public ModelAndView sub(HttpServletRequest req, HttpServletResponse res) {
        int a=Integer.parseInt(req.getParameter("t1"));
        int b=Integer.parseInt(req.getParameter("t2"));
        int k=a-b;
        ModelAndView mv=new ModelAndView();
        mv.setViewName("calculator");
        mv.addObject("result",k);
        return mv;
    }
}

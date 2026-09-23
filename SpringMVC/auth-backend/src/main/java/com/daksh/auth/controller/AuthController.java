package com.daksh.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import com.daksh.auth.service.AuthService;
import com.daksh.auth.model.*;
@Controller
@RequestMapping("/api/auth")
public class AuthController {
	@Autowired
	private AuthService authservice;
	
	@PostMapping("/login")
	@ResponseBody
	public String login(@RequestBody LoginRequest request) {
		boolean result = authservice.login(request.getEmail(),request.getPassword());
        if (result) {return "Login successful";}
        return "Invalid email or password";
	}
	
	@PostMapping("/register")
	@ResponseBody
	public String register(@RequestBody User request) {
		return authservice.register(request);
	}
	
	@PostMapping("/forgot-password")
    @ResponseBody
    public String forgotPassword(
            @RequestBody ForgotPasswordRequest request) {

        return authservice.generateOtp(request.getEmail());
    }


	@PostMapping("/verify-otp")
	@ResponseBody
	public String verifyOtp(@RequestBody VerifyOtpRequest request) {

	    boolean result = authservice.verifyOtp( request.getEmail(), request.getOtp());

	    if (result) {
	        return "OTP verified";
	    }

	    return "Invalid OTP";
	}
	
	@PostMapping("/reset-password")
	@ResponseBody
	public String resetPassword(@RequestBody ResetPasswordRequest request) {
	    return authservice.resetPassword(request.getEmail(),request.getPassword());
	}
}

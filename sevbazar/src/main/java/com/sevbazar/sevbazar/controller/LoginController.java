package com.sevbazar.sevbazar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sevbazar.sevbazar.global.GlobalData;
import com.sevbazar.sevbazar.model.Product;
import com.sevbazar.sevbazar.repository.RoleRepository;
import com.sevbazar.sevbazar.repository.UserRepository;

@Controller
public class LoginController {

	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	RoleRepository roleRepository;
	
	
	@GetMapping("/login")
	public String login() {
		((List<Product>) GlobalData.cart).clear();
	    return "login";
	}

	
	@GetMapping({"/register"})
	public String registerGet() {
		return "register";
	}
	
}

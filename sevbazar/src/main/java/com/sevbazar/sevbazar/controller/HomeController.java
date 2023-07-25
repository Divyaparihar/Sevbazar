package com.sevbazar.sevbazar.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.sevbazar.sevbazar.global.GlobalData;
import com.sevbazar.sevbazar.model.Category;
import com.sevbazar.sevbazar.model.Role;
import com.sevbazar.sevbazar.model.User;
import com.sevbazar.sevbazar.repository.RoleRepository;
import com.sevbazar.sevbazar.repository.UserRepository;
import com.sevbazar.sevbazar.service.CategoryService;
import com.sevbazar.sevbazar.service.ProductService;

@Controller
public class HomeController {

	@Autowired
	CategoryService categoryService;
	
	@Autowired
	ProductService productService;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Autowired
	private RoleRepository roleRepository;

	@Autowired
	private UserRepository userRepository;

	
	@GetMapping({"/", "/home"})
	public String home(Model model) {
//		model.addAttribute("cartCount", GlobalData.cart.size());
		model.addAttribute("cartCount", ((List<Category>) GlobalData.cart1).size());
		return "index";
	}
	
	@GetMapping({"/shop"})
	public String shop(Model model) {
		model.addAttribute("categories", categoryService.getAllCategory());
		model.addAttribute("products", productService.getAllProduct());
//		model.addAttribute("cartCount", GlobalData.cart.size());
		model.addAttribute("cartCount", ((List<Category>) GlobalData.cart1).size());
		return "shop";
	}
	
	@GetMapping({"/shop/category/{id}"})
	public String shopByCategory(Model model, @PathVariable int id) {
		model.addAttribute("categories", categoryService.getAllCategory());
		model.addAttribute("products", productService.getAllProductByCategoryId(id));
//		model.addAttribute("cartCount", GlobalData.cart.size());
		model.addAttribute("cartCount", ((List<Category>) GlobalData.cart1).size());
		return "shop";
	}
	
	@GetMapping({"/shop/viewproduct/{id}"})
	public String viewProduct(Model model, @PathVariable int id) {
		model.addAttribute("product", productService.getProductById(id).get());
//		model.addAttribute("cartCount", GlobalData.cart.size());
		model.addAttribute("cartCount", ((List<Category>) GlobalData.cart1).size());
		return "viewProduct";
	}
	
	@PostMapping("/register")
	public String registerPost(@ModelAttribute("user") User user, HttpServletRequest request) throws ServletException {
		String password = user.getPassword();
		user.setPassword(bCryptPasswordEncoder.encode(password));
		List<Role> roles = new ArrayList<>();
	    roles.add(roleRepository.findById(2).get());
		user.setRoles(roles);
		userRepository.save(user);
		request.login(user.getEmail(), password);
		return "redirect:/";
	}
	
}

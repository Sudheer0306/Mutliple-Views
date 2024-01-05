package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String indexPage() {
		return "Index";
	}
	
	@RequestMapping("/aboutUrl")
	public String aboutPage() {
		return "About";
	}
	
	@RequestMapping("/contactUrl")
	public String contactPage() {
		return "Contact";
	}
	
	@RequestMapping("/login")
	public String loginPage() {
		return "Login";
	}
	
	@RequestMapping("/reg")
	public String regesterPage() {
		return "Regester";
	}
}

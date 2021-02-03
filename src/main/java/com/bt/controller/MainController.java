package com.bt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	
	@GetMapping("/home")
	public String showHomePage() {
		return "homePage";
	}
	@GetMapping("/welcome")
	public String loginPage() {
		return "loginPage";
	}
	@GetMapping("/admin")
	public String adminPage() {
		return "adminPage";
	}
	@GetMapping("/emp")
	public String empPage() {
		return "empPage";
	}
	@GetMapping("/std")
	public String stdPage() {
		return "stdPage";
	}

	/*
	 * @GetMapping("/logout") public String logoutPage() { return "logoutPage"; }
	 */
	@GetMapping("/denied")
	public String deniedPage() {
		return "deniedPage";
	}

}

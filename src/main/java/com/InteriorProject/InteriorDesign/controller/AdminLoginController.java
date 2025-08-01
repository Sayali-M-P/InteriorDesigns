package com.InteriorProject.InteriorDesign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.InteriorProject.InteriorDesign.model.AdminLogin;
import com.InteriorProject.InteriorDesign.services.AdminLoginService;

@RestController
@RequestMapping("/interiordesign/")
@CrossOrigin(origins="http://localhost:4200")
public class AdminLoginController {
	
	@Autowired
	private AdminLoginService adl;
	
	@GetMapping("/adminlogin/{emailid}/{password}")
	public List<AdminLogin> login(@PathVariable("emailid")String emailid,@PathVariable("password")String password)
	{
		return adl.login(emailid, password);
	}

}

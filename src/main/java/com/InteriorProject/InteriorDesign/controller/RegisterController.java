package com.InteriorProject.InteriorDesign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.InteriorProject.InteriorDesign.model.Register;
import com.InteriorProject.InteriorDesign.services.RegisterService;

@RestController
@RequestMapping("/interiordesign/")
@CrossOrigin(origins="http://localhost:4200")
public class RegisterController {
	@Autowired
	private RegisterService rs;
	
	@GetMapping("/register")
	public List<Register> getAll()
	{
		return rs.getAllRegisters();
	}
	
	@GetMapping("/register/{emailid}/{password}")
	public  List<Register> Login(@PathVariable("emailid")String e,@PathVariable("password")String ps)
	{
		return rs.Login(e,ps);
	}
	
	@PostMapping("/register")
	public Register insertrecord(@RequestBody Register r)
	{
		return rs.insert(r);
	}
}

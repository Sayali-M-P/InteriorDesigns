package com.InteriorProject.InteriorDesign.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.InteriorProject.InteriorDesign.model.AdminLogin;
import com.InteriorProject.InteriorDesign.repository.AdminLoginRepository;

@Service
public class AdminLoginImpl implements AdminLoginService{
	@Autowired
	@Qualifier("admRepo")
	private AdminLoginRepository admRepo;
	@Override
	public List<AdminLogin> login(String em, String ps) {
		// TODO Auto-generated method stub
		return admRepo.findByEmailidAndPassword(em, ps);
	}

}

package com.InteriorProject.InteriorDesign.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.InteriorProject.InteriorDesign.model.Register;
import com.InteriorProject.InteriorDesign.repository.RegisterRepository;

@Service
public class RegisterServiceImpl implements RegisterService{

	@Autowired
	@Qualifier("regRepo")
	private RegisterRepository regRepo;
	
	@Override
	public Register insert(Register r) {
		// TODO Auto-generated method stub
		return regRepo.save(r);
	}

	@Override
	public List<Register> getAllRegisters() {
		// TODO Auto-generated method stub
		return regRepo.findAll();
	}

	@Override
	public List<Register> Login(String em, String ps) {
		// TODO Auto-generated method stub
		return regRepo.findByEmailidAndPassword(em, ps);
	}

}

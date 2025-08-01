package com.InteriorProject.InteriorDesign.services;

import java.util.List;

import com.InteriorProject.InteriorDesign.model.Register;

public interface RegisterService {
Register insert(Register r);
List<Register> getAllRegisters();
List<Register> Login(String em,String ps);
}

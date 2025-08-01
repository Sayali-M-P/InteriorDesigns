package com.InteriorProject.InteriorDesign.services;

import java.util.List;

import com.InteriorProject.InteriorDesign.model.AdminLogin;

public interface AdminLoginService {
List<AdminLogin> login(String em,String ps);

}

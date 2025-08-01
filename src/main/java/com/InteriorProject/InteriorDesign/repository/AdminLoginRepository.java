package com.InteriorProject.InteriorDesign.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.InteriorProject.InteriorDesign.model.AdminLogin;

@Repository
@Qualifier("admRepo")
public interface AdminLoginRepository extends JpaRepository<AdminLogin,Integer>{
	
	List<AdminLogin> findByEmailidAndPassword(String emailid, String password);

}

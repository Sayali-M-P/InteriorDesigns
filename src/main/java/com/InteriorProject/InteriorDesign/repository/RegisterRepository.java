package com.InteriorProject.InteriorDesign.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.InteriorProject.InteriorDesign.model.Register;

@Repository
@Qualifier("regRepo")
public interface RegisterRepository extends JpaRepository<Register, Integer>{
	
	List<Register> findByEmailidAndPassword(String emailid,String password);

}

package com.InteriorProject.InteriorDesign.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.InteriorProject.InteriorDesign.model.Designs;

@Repository
@Qualifier("designRepo")
public interface DesignsRepository extends JpaRepository<Designs, Integer>{
	

}

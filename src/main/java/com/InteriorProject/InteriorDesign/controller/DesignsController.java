package com.InteriorProject.InteriorDesign.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.InteriorProject.InteriorDesign.model.Designs;
import com.InteriorProject.InteriorDesign.services.DesignsService;

@RestController
@RequestMapping("/interiordesign/")
@CrossOrigin(origins="http://localhost:4200")
public class DesignsController {
	@Autowired
	private DesignsService ds;
	
	@PostMapping("/designs")
	public Designs insert(@RequestBody Designs d)
	{
		return ds.insert(d);
	}
	
	@GetMapping("/designs")
	public List<Designs> getall()
	{
		return ds.getAll();
	}
	
	@DeleteMapping("/designs/{did}")
	public void delete(@PathVariable("did") int did)
	{
		ds.delete(did);
	}
	
	@PutMapping("/designs/{did}")
	public Designs update(@PathVariable("did") int did,@RequestBody Designs d)
	{
		return ds.update(did, d);
	}
	
	@GetMapping("/designs/{did}")
	public Designs search(@PathVariable("did") int did)
	{
		return ds.search(did);
	}

}

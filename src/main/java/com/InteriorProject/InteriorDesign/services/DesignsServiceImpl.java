package com.InteriorProject.InteriorDesign.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.InteriorProject.InteriorDesign.model.Designs;
import com.InteriorProject.InteriorDesign.repository.DesignsRepository;

@Service
public class DesignsServiceImpl implements DesignsService{
	
	@Autowired
	@Qualifier("designRepo")
	private DesignsRepository designRepo;
	
	@Override
	public Designs insert(Designs d) {
		// TODO Auto-generated method stub
		return designRepo.save(d);
	}

	@Override
	public List<Designs> getAll() {
		// TODO Auto-generated method stub
		return designRepo.findAll();
	}

	@Override
	public void delete(int did) {
		designRepo.deleteById(did);
		
	}

	@Override
	public Designs update(int did, Designs ndata) {
		Optional<Designs> opt=designRepo.findById(did);
		if(opt.isPresent())
		{
			Designs oldrec=opt.get();
			oldrec.setDesignname(ndata.getDesignname());
			oldrec.setImagepath(ndata.getImagepath());
			oldrec.setPrice(ndata.getPrice());
			return designRepo.save(oldrec);
		}
		return null;
	}

	@Override
	public Designs search(int did) {
		Optional<Designs> opt=designRepo.findById(did);
		if(opt.isPresent())
		{
			Designs oldrec=opt.get();
			return oldrec;
		}
		return null;
	}

}

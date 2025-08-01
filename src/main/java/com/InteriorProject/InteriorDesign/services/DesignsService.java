package com.InteriorProject.InteriorDesign.services;

import java.util.List;

import com.InteriorProject.InteriorDesign.model.Designs;

public interface DesignsService {
Designs insert(Designs d);
List<Designs> getAll();
void delete(int did);
Designs update(int did,Designs ndata);
Designs search(int did);
}

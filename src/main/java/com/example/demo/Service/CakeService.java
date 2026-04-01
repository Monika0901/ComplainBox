package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.CakeModel;
import com.example.demo.Model.RegisterModel;
import com.example.demo.repo.CakeRepo;

@Service 
public class CakeService {

	@Autowired
	public CakeRepo cakerepo;

	public CakeModel addCake(CakeModel cake) {
		return cakerepo.save(cake);
	}

	public List<CakeModel> listAll() {
		return cakerepo.findAll();
	}

	public CakeModel getCakeById(Long id) {
	 return cakerepo.findById(id).orElse(null);
	}

	public void deleteCakeById(Long id) {
		cakerepo.deleteById(id);
		
	}

	public CakeModel updateCake(Long id, CakeModel cakemodel) {
		 CakeModel existingCake = cakerepo.findById(id).orElse(null);

		    if (existingCake != null) {
		        existingCake.setCakename(cakemodel.getCakename());
		        existingCake.setCaketype(cakemodel.getCaketype());
		        existingCake.setCakeprice(cakemodel.getCakeprice());

		        return cakerepo.save(existingCake);
		    }

		    return null;
		}
	}

	

	
		
	

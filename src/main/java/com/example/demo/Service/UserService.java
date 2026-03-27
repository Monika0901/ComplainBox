package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.RegisterModel;
import com.example.demo.repo.RegisterRepo;

@Service
public class UserService {
	
	@Autowired
	private RegisterRepo registerrepo;


	public RegisterModel saveUser(RegisterModel registermodel) {
		return registerrepo.save(registermodel);
		
	}


	public List<RegisterModel> listAll() {
		return registerrepo.findAll();
	}

}

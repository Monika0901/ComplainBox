package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Model.CakeModel;
import com.example.demo.Service.CakeService;

@Controller
public class CakeController {
	
	    @Autowired
	    private CakeService cakeservice;

	    @GetMapping("/Home")
	    public String showPage() {
	        return "Home";
	    }

	    @PostMapping("/create")
	    @ResponseBody
	    public String createCake(@RequestBody CakeModel cake) {
	        cakeservice.addCake(cake);
	        return "Cake save Sucessfully";
	    }
	  
	    @GetMapping("/getAll")
	    @ResponseBody
	    public List<CakeModel> getAll() {
	        return cakeservice.listAll();
	    }
	    
	    @GetMapping("/getCake/{id}")
	    @ResponseBody
	    public CakeModel getCake(@PathVariable Long id){
	    	return cakeservice.getCakeById(id);
	    }
	    	
	    @DeleteMapping("/deleteCake/{id}")
	    @ResponseBody
	    public String deleteCake(@PathVariable Long id) {
	        cakeservice.deleteCakeById(id);
	        return "Cake Deleted Successfully";
	    }
	    
	    @PutMapping("/updateCake/{id}")
	    @ResponseBody
	    public CakeModel updateCake(@PathVariable Long id, @RequestBody CakeModel cakemodel) {
	        return cakeservice.updateCake(id, cakemodel);
	    }
    }

	


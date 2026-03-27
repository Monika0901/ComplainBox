package com.example.demo.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Model.RegisterModel;
import com.example.demo.Service.UserService;

@Controller
public class UserController {

	@Autowired
		private UserService userservice;
		
		@GetMapping("/")
		public String showPage() {
	
		return "index";
		}
		 
		@GetMapping("/registration")
		public String showRegistration() {
			return "registration";
		}
		
		@GetMapping("/index")
		public String showIndex() {
			return "index";
		}
		
		@ResponseBody
		@PostMapping("/SaveUser")
		public String SaveUser(@RequestBody RegisterModel registermodel) {
			userservice.saveUser(registermodel);
			return"User Register Sucessfully";
		}
		
		@ResponseBody
		@PostMapping("/login")
		public String loginUser(@RequestBody RegisterModel registermodel) {

		    List<RegisterModel> alluser= userservice.listAll();
              for(RegisterModel rm : alluser) {
            	  if (rm.getEmail().equals(registermodel.getEmail()) && rm.getPassword().equals(registermodel.getPassword())) {
            		  return "login Sucessfully";
            		  
            	  }
		    }
		    return "invalid username & password";
		}	
}


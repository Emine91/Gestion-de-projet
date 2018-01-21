package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class UserController {
	@Autowired
	private UserRepository repository;
	
	@GetMapping(path="/alluser")
	public @ResponseBody Iterable<User> getAllUsers() {
		// This returns a JSON or XML with the users
		return repository.findAll();
	}
	@GetMapping(path="/alluser/{id}")
	public @ResponseBody Iterable<User>getById(@PathVariable int id) {
	    return repository.findByIduser(id);
	}
	
	@GetMapping(path="/usercheck/{nomuser}/{pwuser}")
	public @ResponseBody String getByNompw(@PathVariable String nomuser,@PathVariable String pwuser) throws JsonProcessingException {
	User us=new User();
	String res="";

	us=repository.findByNomuserAndPwuserAllIgnoreCase(nomuser, pwuser);
	if(us==null) {
		return res="-1";
	}else {
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = mapper.writeValueAsString(us);

return jsonInString;
	}


	
	}
	
	
	
	@GetMapping(path="/adduser") // Map ONLY GET Requests
	public @ResponseBody String adduser (@RequestParam String nomuser
			,@RequestParam String pwuser
			, @RequestParam String role) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		User us = new User();
	
		us.setNomuser(nomuser);
		us.setPwuser(pwuser);
		us.setRole(role);
		
		repository.save(us);
		return "Saved";
	}
	

	@RequestMapping("/lookuser")
	public String getUsr(){
		String result = "hello from code";
		
		return result;
	}

}

package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjetController {
	@Autowired
	private ProjetRepository repository;
	
	
	@GetMapping(path="/allprojet")
	public @ResponseBody Iterable<Projet> getAllUsers() {
		// This returns a JSON or XML with the users
		return repository.findAll();
	}
	


	
	@GetMapping(path="/allprojet/{id}")
	public @ResponseBody Iterable<Projet>getById(@PathVariable int id) {
	
	    return repository.findByIdprojet(id);
	}
	
	@GetMapping(path="/addprojet") // Map ONLY GET Requests
	public @ResponseBody String addprojet (@RequestParam String nom_projet
			,@RequestParam int nbr_hrs
			) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Projet pj = new Projet();
	
		pj.setNom_projet(nom_projet);
		pj.setEtatprojet("e");
		pj.setNbr_hrs(nbr_hrs);

		
		repository.save(pj);
		return "Saved";
	}
	@GetMapping(path="/updateprojet/{id}/{etatprojet}") // Map ONLY GET Requests
	public @ResponseBody String updateprojet(@PathVariable int id
			,@PathVariable String etatprojet) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

	repository.updateEtatprojet(id, etatprojet);
		return "Modified";
	}

	@RequestMapping("/lookprojet")
	public String getUsr(){
		String result = "hello from code";
		
		return result;
	}

}

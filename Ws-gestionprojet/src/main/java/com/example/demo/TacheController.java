package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TacheController {
	@Autowired
	private TacheRepository repository;
	
	@GetMapping(path="/alltache")
	public @ResponseBody Iterable<Tache> getAllUsers() {
		// This returns a JSON or XML with the users
		return repository.findAll();
	}
	@GetMapping(path="/alltache/{id}")
	public @ResponseBody Iterable<Tache>getById(@PathVariable int id) {
	
	    return repository.findByIdtache(id);
	}
	@GetMapping(path="/addtache") // Map ONLY GET Requests
	public @ResponseBody String addtache (@RequestParam String deb_tache
			,@RequestParam String desciption_tache
			, @RequestParam String etattache,
			@RequestParam String fin_tache,
			@RequestParam int idprojet,
			@RequestParam int iduser,
			@RequestParam String nom_tache,
			@RequestParam String nbr_hrs_tache) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		Tache tc = new Tache();
		tc.setDeb_tache(deb_tache);
		tc.setDesciption_tache(desciption_tache);
		tc.setEtattache("e");
		tc.setFin_tache(fin_tache);
		tc.setIdprojet(idprojet);
		tc.setIduser(iduser);
		tc.setNom_tache(nom_tache);
		tc.setNbr_hrs_tache(nbr_hrs_tache);

		
		
		repository.save(tc);
	
		return "Saved";
	}
	
	@GetMapping(path="/updatetache/{id}/{etattache}") // Map ONLY GET Requests
	public @ResponseBody String updatetache(@PathVariable int id
			,@PathVariable String etattache) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
	repository.updateEtat_tache(id, etattache);
	
		return "Modified";
	}
		
	@RequestMapping("/looktache")
	public String getUsr(){
		String result = "hello from code";
		
		return result;
	}
}

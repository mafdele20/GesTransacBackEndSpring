package com.spring.angular.AngularTransfert.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.angular.AngularTransfert.dao.IEnvoieRest;
import com.spring.angular.AngularTransfert.entities.Envoie;

@CrossOrigin("*")
@RestController
public class EnvoieService {
	
	    @Autowired
	    private IEnvoieRest envoiedao;

	    @RequestMapping(value="/envoie/api/liste", method= RequestMethod.GET)
	    public List<Envoie> listeEnvoie(){
	        List<Envoie> envoies = envoiedao.findAll();
	        return envoies;
	    }
	    @PostMapping(value = "/envoie/api/add")
	    public String ajouterEnvoie(@RequestBody Envoie envoie) {
	      
	        try {
	        	envoiedao.save(envoie);
	            return "Ajout reuisit";


	        }catch (Exception e){

	            return "Erreur d'insertion";

	        }
	    }

	  

	


}

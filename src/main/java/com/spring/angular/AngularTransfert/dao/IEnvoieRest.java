package com.spring.angular.AngularTransfert.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.angular.AngularTransfert.entities.Envoie;



public interface IEnvoieRest extends JpaRepository<Envoie, Long> {
	
	

}

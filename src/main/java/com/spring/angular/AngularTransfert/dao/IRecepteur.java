package com.spring.angular.AngularTransfert.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.spring.angular.AngularTransfert.entities.Emetteur;
import com.spring.angular.AngularTransfert.entities.Recepteur;

@RepositoryRestResource
public interface IRecepteur extends JpaRepository<Recepteur, Long>{
	
	 @RestResource(path="/emmeteurByCin")
	 public List<Emetteur> findByNomR(@Param("nomR") String ci);
}

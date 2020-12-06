package com.spring.angular.AngularTransfert.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.spring.angular.AngularTransfert.entities.Emetteur;

@RepositoryRestResource
public interface IEmetteur extends JpaRepository<Emetteur, Long>{
	
	 @RestResource(path="/emmeteurByCin")
	 public List<Emetteur> findByCinE(@Param("cinE") String ci);
}

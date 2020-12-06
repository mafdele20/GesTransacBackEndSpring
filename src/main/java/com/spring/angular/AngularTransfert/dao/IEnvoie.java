package com.spring.angular.AngularTransfert.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.repository.query.Param;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.spring.angular.AngularTransfert.entities.Envoie;

@RepositoryRestResource
@CrossOrigin("*")
public interface IEnvoie extends JpaRepository<Envoie, Long>{
	
	 @RestResource(path="/byDate")
	 public List<Envoie> findByDate(@Param("date") String date);
}

//http://localhost:8088/envoies/search/byDate?date=01-01-2020
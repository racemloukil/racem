package com.HRPlus.space.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.HRPlus.space.entities.Conge;



public interface ICongeRepo extends JpaRepository<Conge, Long> {
	
	@Query("select c from Conge c where c.statusOfDemand like 'Waiting'")
	public List<Conge> getCongeByStatus();
	
	@Query("select count(duree) from Conge c where c.user.idUser = :id")
	public int countDuree(Long id );

}

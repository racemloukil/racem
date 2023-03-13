package com.HRPlus.space.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HRPlus.space.entities.Administrateur;

public interface IAdminRepo extends JpaRepository<Administrateur, Long> {

}

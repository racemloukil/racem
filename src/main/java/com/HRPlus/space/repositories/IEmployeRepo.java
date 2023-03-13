package com.HRPlus.space.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HRPlus.space.entities.Employe;

public interface IEmployeRepo extends JpaRepository<Employe, Long> {

}

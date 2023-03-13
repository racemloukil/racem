package com.HRPlus.space.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HRPlus.space.entities.Archive;

public interface IArchiveRepo extends JpaRepository<Archive, Long> {

}

package com.HRPlus.space.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HRPlus.space.entities.ERole;
import com.HRPlus.space.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

	Optional<Role> findByName(ERole name);
}

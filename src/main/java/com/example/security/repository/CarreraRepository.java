package com.example.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.security.entity.Carrera;


@Repository
public interface CarreraRepository extends JpaRepository<Carrera, Long> {
	

}

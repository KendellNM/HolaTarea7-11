package com.example.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.security.entity.Alumno;


@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
	

}

package com.example.security.dao;

import java.util.List;
import java.util.Optional;

import com.example.security.entity.Carrera;



public interface CarreraDao {
	Carrera create(Carrera a);
	Carrera update(Carrera a);
	void delete(Long id);
	Optional<Carrera> read(Long id);
	List<Carrera> readAll();

}

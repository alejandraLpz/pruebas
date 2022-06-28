package com.example.actividad.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.actividad.categoria;

public interface CategoriaRepository extends CrudRepository<categoria, Integer>{

	Optional<categoria> findAllById(String idc);

	void deleteById(String idc);

}

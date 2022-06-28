package com.example.actividad.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.actividad.producto;

public interface ProductoRepository extends CrudRepository<producto, Integer>{

	Optional<producto> findById(String idp);

	void deleteById(String idp);

}

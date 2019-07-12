package com.ifpi.ted2019.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifpi.ted2019.domain.Cachorro;
import com.ifpi.ted2019.repositories.CachorroRepository;
@Service
public class CachorroService {
	
	private CachorroRepository repository;
	@Autowired
	public Cachorro buscar(Integer id) {
		Optional<Cachorro> object = repository.findById(id);
		return object.orElse(null);
	}

}

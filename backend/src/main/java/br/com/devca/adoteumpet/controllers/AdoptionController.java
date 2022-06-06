package br.com.devca.adoteumpet.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.devca.adoteumpet.dtos.AdoptionDTO;
import br.com.devca.adoteumpet.mappers.AdoptionMapper;
import br.com.devca.adoteumpet.repositories.AdoptionRepository;
import br.com.devca.adoteumpet.requests.AdoptionRequest;

@RestController
public class AdoptionController {
	
	@Autowired
	private AdoptionRepository repository;
	
	@Autowired
	private AdoptionMapper mapper;
	
	@PostMapping("/api/adoption")
	@ResponseStatus(code = HttpStatus.CREATED)
	public AdoptionDTO create(@RequestBody AdoptionRequest adoptionRequest) {
		var adoption = mapper.toAdoption(adoptionRequest);
		var createdAdoption = repository.save(adoption);
		return mapper.toDTO(createdAdoption);
	}

}



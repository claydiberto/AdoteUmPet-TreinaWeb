package br.com.devca.adoteumpet.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.devca.adoteumpet.dtos.PetDTO;
import br.com.devca.adoteumpet.entities.Pet;
import br.com.devca.adoteumpet.mappers.PetMapper;
import br.com.devca.adoteumpet.repositories.PetRepository;

@RestController
public class PetController {
    
    @Autowired
    private PetRepository repository;
    
    @Autowired
    private PetMapper mapper;

    @GetMapping("/api/pets")
    public List<PetDTO> findAll() {
    	var pets = repository.findAll();
    	var petResponses = new ArrayList<PetDTO>();
    	for (Pet pet : pets) {
    		petResponses.add(mapper.toDTO(pet));
    	}
    	return petResponses;
    }

    @GetMapping("s")
    public Optional<Pet> getById() {
        return repository.findById((long) 1);
    }


}

package br.com.devca.adoteumpet.mappers;

import org.springframework.stereotype.Component;

import br.com.devca.adoteumpet.dtos.PetDTO;
import br.com.devca.adoteumpet.entities.Pet;

@Component
public class PetMapper {

    public PetDTO toDTO(Pet pet) {
        var petDTO = new PetDTO();
        petDTO.setId(pet.getId());
        petDTO.setName(pet.getName());
        petDTO.setDescription(pet.getDescription());
        petDTO.setPhoto(pet.getPhoto());
        return petDTO;
    }
    
}

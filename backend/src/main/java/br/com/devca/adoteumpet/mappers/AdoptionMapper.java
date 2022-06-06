package br.com.devca.adoteumpet.mappers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.devca.adoteumpet.dtos.AdoptionDTO;
import br.com.devca.adoteumpet.entities.Adoption;
import br.com.devca.adoteumpet.repositories.PetRepository;
import br.com.devca.adoteumpet.requests.AdoptionRequest;

@Component
public class AdoptionMapper {
	
	@Autowired
	private PetRepository petRepository;
	
	@Autowired
	private PetMapper petMapper;
	
	public Adoption toAdoption(AdoptionRequest adoptionRequest) {
		var adoption = new Adoption();
		adoption.setEmail(adoptionRequest.getEmail());
		adoption.setAmount(adoptionRequest.getAmount());
		adoption.setPet(petRepository.findByIdOrElseThrow(adoptionRequest.getPetId()));
		return adoption;
	}
	
	public AdoptionDTO toDTO(Adoption adoption) {
		var adoptionDTO = new AdoptionDTO();
		adoptionDTO.setId(adoption.getId());
		adoptionDTO.setAmount(adoption.getAmount());
		adoptionDTO.setEmail(adoption.getEmail());
		adoptionDTO.setPetDTO(petMapper.toDTO(adoption.getPet()));
		return adoptionDTO;
	}

}

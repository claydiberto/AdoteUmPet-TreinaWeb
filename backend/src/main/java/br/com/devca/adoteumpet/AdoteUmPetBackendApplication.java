package br.com.devca.adoteumpet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.devca.adoteumpet.entities.Pet;
import br.com.devca.adoteumpet.repositories.PetRepository;

@SpringBootApplication
public class AdoteUmPetBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AdoteUmPetBackendApplication.class, args);
	}

	@Autowired
	private PetRepository petRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Pet pet = new Pet();
		pet.setName("Bidu");
		pet.setDescription("História do Bidu");
		pet.setPhoto("https://media.istockphoto.com/photos/playful-happy-smiling-pet-dog-running-in-the-grass-picture-id1320018473?b=1&k=20&m=1320018473&s=170667a&w=0&h=Q-U9yI4JjCJYSAzXZwpnM4HuaXPzo4K-vBsgO7lanyo=");
		petRepository.save(pet);
		
		
	
	}


}

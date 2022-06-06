package br.com.devca.adoteumpet.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.devca.adoteumpet.entities.Adoption;

public interface AdoptionRepository extends JpaRepository<Adoption, Long>{

}

package br.com.devca.adoteumpet.dtos;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdoptionDTO {

	private Long id;
    private String email;
    private BigDecimal amount;
    private PetDTO petDTO;
}

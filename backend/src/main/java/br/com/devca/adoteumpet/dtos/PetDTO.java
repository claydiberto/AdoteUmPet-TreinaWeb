package br.com.devca.adoteumpet.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PetDTO {
    
    private Long id;
    private String name;
    private String description;
    private String photo;

}

package com.condominio.API.Condominio.Domain.Entity.Endereco;

import jakarta.persistence.*;
import lombok.*;

@Embeddable
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Endereco {

    private String rua;
    private String cidade;
    private String estado;
    private String cep;
    private String pais;

}

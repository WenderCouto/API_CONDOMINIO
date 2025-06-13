package com.condominio.app.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Property class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Property extends BaseModel {
    //Id providenciado por BaseModel
    private String title;        // Nome de referência (Ex: "Apto 302 - Ed. Solar")
    private String description;  // Descrição detalhada
    private String address;      // Endereço completo
    private String complement;   // Ex: "Bloco B, Ap. 101"
    private String postalCode;   // CEP
    private String neighborhood; // Bairro
    private String city;
    private String state;
    private String country;

    private BigDecimal area;       // Área útil (m²)
    private Integer bedrooms;      // Quartos - Podemos adicionar suites etc…
    private Integer bathrooms;     // Banheiros
    private Integer parkingSpaces; // Vagas de garagem

    private boolean furnished;     // Se é mobiliado
    private boolean hasElevator;   // Se tem elevador
    private boolean isCondominium; // Está em condomínio?

    private String registrationNumber; // Número do registro no cartório (opcional) acho que não precisa
    private String notes;              // Observações gerais além da descrição
}
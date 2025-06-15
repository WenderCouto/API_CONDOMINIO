package com.condominio.app.persistence.entity;

import com.condominio.app.core.model.PersonType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * PersonEntity class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Entity
@Table(name = "people") // Pessoas
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity extends BaseEntity {

    private String name;

    @Enumerated(EnumType.STRING)
    private PersonType personType;

    private String document; // CPF/CNPJ mais interessante identificar com função que por enum
    private String email;
    private String phone;
}
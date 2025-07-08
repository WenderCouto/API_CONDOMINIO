package com.condominio.app.persistence.entity;

import com.condominio.app.core.model.PersonType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

/**
 * PersonEntity class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Setter
@Getter
@Entity
@Table(name = "people") // Pessoas
public class PersonEntity extends BaseEntity {

    private String name;

    @Enumerated(EnumType.STRING)
    private PersonType personType;

    private String document; // CPF/CNPJ mais interessante identificar com função que por enum
    private String email;
    private String phone;
}
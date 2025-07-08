package com.condominio.app.core.model;

import lombok.Getter;
import lombok.Setter;

/**
 * Person class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Setter
@Getter
public class Person extends BaseModel {
    //Id providenciado por BaseModel
    private String name;
    private PersonType personType; // Tipo de pessoa
    private String document;       // CPF/CNPJ mais interessante identificar com função que por enum
    private String email;
    private String phone;
}
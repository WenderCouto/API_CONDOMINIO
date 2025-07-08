package com.condominio.app.web.dto.request;

import com.condominio.app.core.model.PersonType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * CreatePersonRequest class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public class CreatePersonRequest {
    @NotBlank
    private String name;

    @NotNull
    private PersonType personType;

    @NotBlank
    private String document;

    @NotBlank
    @Email
    private String email;

    private String phone;

    public @NotBlank String getName() {
        return name;
    }

    public void setName(@NotBlank String name) {
        this.name = name;
    }

    public @NotNull PersonType getPersonType() {
        return personType;
    }

    public void setPersonType(@NotNull PersonType personType) {
        this.personType = personType;
    }

    public @NotBlank String getDocument() {
        return document;
    }

    public void setDocument(@NotBlank String document) {
        this.document = document;
    }

    public @NotBlank @Email String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank @Email String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

//Etc… Outros dtos, isso aqui é só para o github já criar o pacote unto
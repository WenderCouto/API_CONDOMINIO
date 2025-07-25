package com.condominio.app.web.dto.response;

import com.condominio.app.core.model.PersonType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/**
 * CreatePersonResponse class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public class CreatePersonResponse {
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
}

//Etc… Outros dtos, isso aqui é só para o github já criar o pacote unto
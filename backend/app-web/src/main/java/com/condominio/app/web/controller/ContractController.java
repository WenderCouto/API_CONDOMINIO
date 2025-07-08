package com.condominio.app.web.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ContractController class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Tag(name = "Endpoint de Contratos", description = "Rotas que dizem respeito a operações contratuais")
@RestController
@RequestMapping("/api/contract")
public class ContractController {


    public ContractController() {
    }

    @Operation(
            summary = "Retorna \"Hello World\"",
            description = "Não recebe nada e retorna uma String"
//            security = @SecurityRequirement(name = "bearerAuth") // Não precisa de autenticação
    )
    @RequestMapping(value = "/hello", method = { RequestMethod.GET })
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok("Hello world!");
    }
}
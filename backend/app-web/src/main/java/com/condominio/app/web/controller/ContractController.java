package com.condominio.app.web.controller;

import com.condominio.app.infra.services.ServiceOrOrchestrator;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
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

@RestController
@RequestMapping("/api/contract")
public class ContractController {

    private final ServiceOrOrchestrator serviceOrOrchestratorExemplo;

    public ContractController(ServiceOrOrchestrator serviceOrOrchestratorExemplo) {
        this.serviceOrOrchestratorExemplo = serviceOrOrchestratorExemplo;
    }

    @RequestMapping(value = "/hello", method = { RequestMethod.GET })
    public ResponseEntity<String> helloWorld() {
        return ResponseEntity.ok(this.serviceOrOrchestratorExemplo.getHello());
    }
}
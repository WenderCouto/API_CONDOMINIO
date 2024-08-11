package com.condominio.API.Condominio.Controller;

import com.condominio.API.Condominio.Domain.Entity.Condominio.Condominio;
import com.condominio.API.Condominio.Domain.Entity.Condominio.DadosCadastroCondominio;
import com.condominio.API.Condominio.Domain.Repository.CondominioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("Condominio")
public class CondominioController {

    @Autowired
    private CondominioRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody DadosCadastroCondominio dados, UriComponentsBuilder uriBuilder){
        var condominio = new Condominio(dados);
        repository.save(condominio);

        var uri = uriBuilder.path("/condominios/{id}").buildAndExpand(condominio.getId()).toUri();
        return ResponseEntity.created(uri).build();

    }

}

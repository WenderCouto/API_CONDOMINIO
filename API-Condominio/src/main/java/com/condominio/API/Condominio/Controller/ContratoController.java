package com.condominio.API.Condominio.Controller;

import com.condominio.API.Condominio.Domain.Entity.Apartamento.Apartamento;
import com.condominio.API.Condominio.Domain.Entity.Contrato.Contrato;
import com.condominio.API.Condominio.Domain.Entity.Contrato.DadosCadastroContrato;
import com.condominio.API.Condominio.Domain.Entity.Pessoa.Pessoa;
import com.condominio.API.Condominio.Domain.Repository.ApartamentoRepository;
import com.condominio.API.Condominio.Domain.Repository.ContratoRepository;
import com.condominio.API.Condominio.Domain.Repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("contratos")
public class ContratoController {

    @Lazy
    @Autowired
    private ContratoRepository repository;

    @Lazy
    @Autowired
    private ApartamentoRepository apartamentoRepository;

    @Lazy
    @Autowired
    private PessoaRepository pessoaRepository;

    @PostMapping
    @Transactional
    public ResponseEntity criaContrato(@RequestBody DadosCadastroContrato dados, UriComponentsBuilder uriComponentsBuilder ){
         List<Pessoa> pessoas = pessoaRepository.findAllById(dados.idPessoas());

        var apartamento = apartamentoRepository.getReferenceById(dados.idapartamento());

        var contrato = new Contrato(dados, pessoas, apartamento);

        pessoas.forEach(pessoa -> pessoa.setContrato(contrato));
        apartamento.setContrato(contrato);

        System.out.println(contrato.toString());

         repository.save(contrato);
         var uri = uriComponentsBuilder.path("/contratos/{id}").buildAndExpand(contrato.getId()).toUri();
         return ResponseEntity.created(uri).build();
    }


}

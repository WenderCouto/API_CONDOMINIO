package com.condominio.API.Condominio.Controller;

import com.condominio.API.Condominio.Domain.Entity.Apartamento.Apartamento;
import com.condominio.API.Condominio.Domain.Entity.Apartamento.DadosCadastroApartamento;
import com.condominio.API.Condominio.Domain.Entity.Apartamento.DadosListagemApartamento;
import com.condominio.API.Condominio.Domain.Repository.ApartamentoRepository;
import com.condominio.API.Condominio.Domain.Repository.CondominioRepository;
import org.hibernate.query.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
@RequestMapping("apartamentos")
public class ApartamentoController {

    @Autowired //lazyinitializon
    private ApartamentoRepository repository;

    @Autowired
    private CondominioRepository condominioRepository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody DadosCadastroApartamento dados, UriComponentsBuilder uriComponentsBuilder){
        var apartamento = new Apartamento(dados);

        var condominio = condominioRepository.getReferenceById(dados.idCondominio());

        apartamento.setCondominio(condominio);

        repository.save(apartamento);
        var uri = uriComponentsBuilder.path("/apartamentos/{id}").buildAndExpand(apartamento.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }

    @GetMapping
    public List<DadosListagemApartamento> buscarTodos( ){
        List<Apartamento> apartamentos = repository.findAll();
        List<DadosListagemApartamento> listagemDto = apartamentos.stream().map(apartamento ->
                new DadosListagemApartamento(apartamento.getId(),
                        apartamento.getNumero(),
                        apartamento.getUnidadeConsumidora(),
                        apartamento.getDescrição(),
                        apartamento.getValor(),
                        apartamento.isDisponivel())).toList();

        return listagemDto;
    }

}

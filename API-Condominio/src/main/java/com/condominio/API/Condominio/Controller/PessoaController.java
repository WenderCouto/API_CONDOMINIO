package com.condominio.API.Condominio.Controller;

import com.condominio.API.Condominio.Domain.Entity.Pessoa.DadosCadastroPessoa;
import com.condominio.API.Condominio.Domain.Entity.Pessoa.Pessoa;
import com.condominio.API.Condominio.Domain.Repository.ApartamentoRepository;
import com.condominio.API.Condominio.Domain.Repository.CondominioRepository;
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

@RestController
@RequestMapping("pessoas")
public class PessoaController {

    @Lazy
    @Autowired
    private PessoaRepository repository;

    @Autowired
    private ApartamentoRepository apartamentoRepository;

    @Autowired
    private CondominioRepository condominioRepository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody DadosCadastroPessoa dados, UriComponentsBuilder uriComponentsBuilder){
        var apartamento = apartamentoRepository.getReferenceById(dados.idApartamento());
        var condominio = condominioRepository.getReferenceById(dados.idCondominio());
        var pessoa = new Pessoa(dados, apartamento, condominio);
        repository.save(pessoa);

        var uri = uriComponentsBuilder.path("/pessoas/{id}").buildAndExpand(pessoa.getId()).toUri();
        return ResponseEntity.created(uri).build();

    }

}

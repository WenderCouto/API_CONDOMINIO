package com.condominio.API.Condominio.Domain.Entity.Condominio;

import com.condominio.API.Condominio.Domain.Entity.Endereco.Endereco;

public record DadosListagemCondominioSemApartamentos(Long id, String nome, Endereco endereco) {

    public DadosListagemCondominioSemApartamentos(Condominio condominio){
        this(condominio.getId(), condominio.getNome(), condominio.getEndereco());
    }

}

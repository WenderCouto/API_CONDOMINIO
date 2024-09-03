package com.condominio.API.Condominio.Domain.Entity.Condominio;

import com.condominio.API.Condominio.Domain.Entity.Apartamento.DadosListagemApartamento;
import com.condominio.API.Condominio.Domain.Entity.Endereco.Endereco;

import java.util.List;

public record DadosListagemCondominio(Long id, String nome, Endereco endereco, List<DadosListagemApartamento> apartamentos) {
}

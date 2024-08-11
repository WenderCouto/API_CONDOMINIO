package com.condominio.API.Condominio.Domain.Entity.Condominio;

import com.condominio.API.Condominio.Domain.Entity.Endereco.DadosCadastroEndereco;
import com.condominio.API.Condominio.Domain.Entity.Endereco.Endereco;

public record DadosCadastroCondominio(String nome, DadosCadastroEndereco endereco) {
}

package com.condominio.API.Condominio.Domain.Entity.Pessoa;

import com.condominio.API.Condominio.Domain.Entity.Endereco.Endereco;

import java.time.LocalDate;

public record DadosCadastroPessoa(
        String nome,
        String cpf,
        String telefone,
        String localDeTrabalho,
        String filiacao,
        LocalDate dataNascimento,
        Endereco endereco,
        TipoPessoa tipoPessoa,
        Long idApartamento,
        Long idCondominio) {
}

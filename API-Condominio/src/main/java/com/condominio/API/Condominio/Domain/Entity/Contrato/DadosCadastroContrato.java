package com.condominio.API.Condominio.Domain.Entity.Contrato;

import com.condominio.API.Condominio.Domain.Entity.Apartamento.Apartamento;
import com.condominio.API.Condominio.Domain.Entity.Pessoa.Pessoa;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public record DadosCadastroContrato(
        LocalDate dataPagamento,
        Integer tempoContrato,
        BigDecimal aluguel,
        ParcelaCaucao calcao,
        List<Long> idPessoas,
        Long idapartamento
        ) {
}

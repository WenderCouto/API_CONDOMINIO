package com.condominio.API.Condominio.Domain.Entity.Apartamento;

import java.math.BigDecimal;

public record DadosListagemApartamento(
        Long id,
        Integer numero,
        Integer unidadeConsumidora,
        String descricao,
        BigDecimal valor,
        Boolean disponivel) {
}

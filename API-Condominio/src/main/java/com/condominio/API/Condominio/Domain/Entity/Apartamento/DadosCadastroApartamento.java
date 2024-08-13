package com.condominio.API.Condominio.Domain.Entity.Apartamento;

import java.math.BigDecimal;
import java.time.LocalDate;


public record DadosCadastroApartamento(
        Integer numero,
        Integer unidadeConsumidora,
        String descricao,
        BigDecimal valor,
        Long idCondominio) {
}

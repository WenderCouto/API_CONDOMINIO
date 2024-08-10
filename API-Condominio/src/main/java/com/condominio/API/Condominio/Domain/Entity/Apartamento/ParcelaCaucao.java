package com.condominio.API.Condominio.Domain.Entity.Apartamento;

import jakarta.persistence.Embeddable;

import java.math.BigDecimal;
import java.time.LocalDate;

@Embeddable
public class ParcelaCaucao {

    private BigDecimal valorParcela;
    private LocalDate dataVencimento;
    private boolean pago;

}

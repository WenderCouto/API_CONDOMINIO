package com.condominio.API.Condominio.Domain.Entity.Contrato;

import jakarta.persistence.Embeddable;

import java.math.BigDecimal;
import java.time.LocalDate;

@Embeddable
public class ParcelaCaucao {

    private BigDecimal valorParcela;
    private LocalDate dataVencimento;
    private boolean pago;

}

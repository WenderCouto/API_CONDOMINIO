package com.condominio.app.persistence.entity;

import com.condominio.app.core.model.InstallmentStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * InstallmentEntity class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Setter
@Getter
@Entity
@Table(name = "installments")
public class InstallmentEntity extends BaseEntity {

    private int number;
    private LocalDate dueDate;
    private LocalDate paymentDate;
    private BigDecimal amount;
    private BigDecimal paidAmount;
    private BigDecimal penaltyRate;
    private BigDecimal interestRate;

    @ManyToOne
    @JoinColumn(name = "charge_responsible_id")
    private PersonEntity chargeResponsible;

    @Enumerated(EnumType.STRING)
    private InstallmentStatus status;

    @ManyToOne
    @JoinColumn(name = "contract_id")
    private ContractEntity contract;

    private String paymentReference;
    private String notes;
}
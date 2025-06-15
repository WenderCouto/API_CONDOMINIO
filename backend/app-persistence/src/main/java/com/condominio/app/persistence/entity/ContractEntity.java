package com.condominio.app.persistence.entity;

import com.condominio.app.core.model.ContractStatus;
import com.condominio.app.core.model.Frequency;
import com.condominio.app.core.model.GuaranteeType;
import com.condominio.app.core.model.PaymentMethod;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

/**
 * ContractEntity class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Entity
@Table(name = "contracts")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContractEntity extends BaseEntity {

    private Instant startDate;
    private Instant endDate;
    private Instant terminationDate;

    @ManyToOne
    @JoinColumn(name = "landlord_id")
    private PersonEntity landlord;

    @ManyToOne
    @JoinColumn(name = "tenant_id")
    private PersonEntity tenant;

    @ManyToOne //Pode ser um edifício, apartamento, kitnet etc…
    @JoinColumn(name = "property_id")
    private PropertyEntity property;

    private BigDecimal rentAmount;
    private BigDecimal depositAmount;

    @Enumerated(EnumType.STRING)
    private GuaranteeType guaranteeType;

    private String guaranteeDetails;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;

    @Enumerated(EnumType.STRING)
    private Frequency paymentFrequency;

    @OneToMany(mappedBy = "contract", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<InstallmentEntity> installments;

    private boolean allowsPets;
    private boolean includesCondominiumFees;
    private boolean includesUtilities;
    private boolean autoRenewal;

    @Enumerated(EnumType.STRING)
    private ContractStatus status;

    private String contractNumber;
    private String registryNumber;
    private String signatureHash;
    private String notes;
}
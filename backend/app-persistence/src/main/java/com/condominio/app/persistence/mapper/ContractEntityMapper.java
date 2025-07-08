package com.condominio.app.persistence.mapper;

import com.condominio.app.core.model.Contract;
import com.condominio.app.persistence.entity.ContractEntity;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * ContractEntityMapper class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Component
public class ContractEntityMapper {

    private final PersonEntityMapper personMapper;
    private final PropertyEntityMapper propertyMapper;
    private final InstallmentEntityMapper installmentMapper;

    public ContractEntityMapper(
            PersonEntityMapper personMapper,
            PropertyEntityMapper propertyMapper,
            InstallmentEntityMapper installmentMapper
    ) {
        this.personMapper = personMapper;
        this.propertyMapper = propertyMapper;
        this.installmentMapper = installmentMapper;
    }

    public ContractEntity toEntity(Contract model) {
        ContractEntity entity = new ContractEntity();

        entity.setId(model.getId());
        entity.setCreatedAt(model.getCreatedAt());
        entity.setCreatedBy(model.getCreatedBy());
        entity.setUpdatedAt(model.getUpdatedAt());
        entity.setUpdatedBy(model.getUpdatedBy());
        entity.setDeletedAt(model.getDeletedAt());
        entity.setDeletedBy(model.getDeletedBy());
        entity.setActive(model.isActive());

        entity.setStartDate(model.getStartDate());
        entity.setEndDate(model.getEndDate());
        entity.setTerminationDate(model.getTerminationDate());

        entity.setLandlord(this.personMapper.toEntity(model.getLandlord()));
        entity.setTenant(this.personMapper.toEntity(model.getTenant()));
        entity.setProperty(this.propertyMapper.toEntity(model.getProperty()));

        entity.setInstallments(
                model.getInstallments().stream()
                        .map(this.installmentMapper::toEntity)
                        .toList()
        );

        entity.setRentAmount(model.getRentAmount());
        entity.setDepositAmount(model.getDepositAmount());
        entity.setGuaranteeType(model.getGuaranteeType());
        entity.setGuaranteeDetails(model.getGuaranteeDetails());
        entity.setPaymentMethod(model.getPaymentMethod());
        entity.setPaymentFrequency(model.getPaymentFrequency());

        entity.setAllowsPets(model.isAllowsPets());
        entity.setIncludesCondominiumFees(model.isIncludesCondominiumFees());
        entity.setIncludesUtilities(model.isIncludesUtilities());
        entity.setAutoRenewal(model.isAutoRenewal());

        entity.setStatus(model.getStatus());
        entity.setContractNumber(model.getContractNumber());
        entity.setRegistryNumber(model.getRegistryNumber());
        entity.setSignatureHash(model.getSignatureHash());
        entity.setNotes(model.getNotes());

        return entity;
    }

    public Contract toModel(ContractEntity entity) {
        Contract model = new Contract();

        model.setId(entity.getId());
        model.setCreatedAt(entity.getCreatedAt());
        model.setCreatedBy(entity.getCreatedBy());
        model.setUpdatedAt(entity.getUpdatedAt());
        model.setUpdatedBy(entity.getUpdatedBy());
        model.setDeletedAt(entity.getDeletedAt());
        model.setDeletedBy(entity.getDeletedBy());
        model.setActive(entity.isActive());

        model.setStartDate(entity.getStartDate());
        model.setEndDate(entity.getEndDate());
        model.setTerminationDate(entity.getTerminationDate());

        model.setLandlord(this.personMapper.toModel(entity.getLandlord()));
        model.setTenant(this.personMapper.toModel(entity.getTenant()));
        model.setProperty(this.propertyMapper.toModel(entity.getProperty()));

        model.setInstallments(
                entity.getInstallments() != null ?
                        entity.getInstallments().stream()
                                .map(this.installmentMapper::toModel)
                                .toList() : Collections.emptyList()
        );

        model.setRentAmount(entity.getRentAmount());
        model.setDepositAmount(entity.getDepositAmount());
        model.setGuaranteeType(entity.getGuaranteeType());
        model.setGuaranteeDetails(entity.getGuaranteeDetails());
        model.setPaymentMethod(entity.getPaymentMethod());
        model.setPaymentFrequency(entity.getPaymentFrequency());

        model.setAllowsPets(entity.isAllowsPets());
        model.setIncludesCondominiumFees(entity.isIncludesCondominiumFees());
        model.setIncludesUtilities(entity.isIncludesUtilities());
        model.setAutoRenewal(entity.isAutoRenewal());

        model.setStatus(entity.getStatus());
        model.setContractNumber(entity.getContractNumber());
        model.setRegistryNumber(entity.getRegistryNumber());
        model.setSignatureHash(entity.getSignatureHash());
        model.setNotes(entity.getNotes());

        return model;
    }
}
package com.condominio.app.persistence.mapper;

import com.condominio.app.core.model.Installment;
import com.condominio.app.persistence.entity.ContractEntity;
import com.condominio.app.persistence.entity.InstallmentEntity;
import org.springframework.stereotype.Component;

/**
 * InstallmentEntityMapper class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Component
public class InstallmentEntityMapper {

    private final PersonEntityMapper personMapper;

    public InstallmentEntityMapper(PersonEntityMapper personMapper) {
        this.personMapper = personMapper;
    }

    public InstallmentEntity toEntity(Installment model) {
        InstallmentEntity entity = new InstallmentEntity();

        entity.setId(model.getId());
        entity.setCreatedAt(model.getCreatedAt());
        entity.setCreatedBy(model.getCreatedBy());
        entity.setUpdatedAt(model.getUpdatedAt());
        entity.setUpdatedBy(model.getUpdatedBy());
        entity.setDeletedAt(model.getDeletedAt());
        entity.setDeletedBy(model.getDeletedBy());
        entity.setActive(model.isActive());

        entity.setNumber(model.getNumber());
        entity.setDueDate(model.getDueDate());
        entity.setPaymentDate(model.getPaymentDate());
        entity.setAmount(model.getAmount());
        entity.setPaidAmount(model.getPaidAmount());
        entity.setPenaltyRate(model.getPenaltyRate());
        entity.setInterestRate(model.getInterestRate());
        entity.setStatus(model.getStatus());
        entity.setPaymentReference(model.getPaymentReference());
        entity.setNotes(model.getNotes());

        entity.setChargeResponsible(this.personMapper.toEntity(model.getChargeResponsible()));

        ContractEntity contract = new ContractEntity();
        contract.setId(model.getContractId());
        entity.setContract(contract);

        return entity;
    }

    public Installment toModel(InstallmentEntity entity) {
        Installment model = new Installment();

        model.setId(entity.getId());
        model.setCreatedAt(entity.getCreatedAt());
        model.setCreatedBy(entity.getCreatedBy());
        model.setUpdatedAt(entity.getUpdatedAt());
        model.setUpdatedBy(entity.getUpdatedBy());
        model.setDeletedAt(entity.getDeletedAt());
        model.setDeletedBy(entity.getDeletedBy());
        model.setActive(entity.isActive());

        model.setNumber(entity.getNumber());
        model.setDueDate(entity.getDueDate());
        model.setPaymentDate(entity.getPaymentDate());
        model.setAmount(entity.getAmount());
        model.setPaidAmount(entity.getPaidAmount());
        model.setPenaltyRate(entity.getPenaltyRate());
        model.setInterestRate(entity.getInterestRate());
        model.setStatus(entity.getStatus());
        model.setPaymentReference(entity.getPaymentReference());
        model.setNotes(entity.getNotes());

        model.setChargeResponsible(this.personMapper.toModel(entity.getChargeResponsible()));
        model.setContractId(entity.getContract() != null ? entity.getContract().getId() : null);

        return model;
    }
}
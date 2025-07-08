package com.condominio.app.persistence.adapter;

import com.condominio.app.core.model.Contract;
import com.condominio.app.core.model.ContractStatus;
import com.condominio.app.core.port.ContractRepository;
import com.condominio.app.persistence.entity.ContractEntity;
import com.condominio.app.persistence.mapper.ContractEntityMapper;
import com.condominio.app.persistence.repository.ContractJpaRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * ContractRepositoryAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Component
public class ContractRepositoryAdapter implements ContractRepository {

    private final ContractJpaRepository jpaRepository;
    private final ContractEntityMapper mapper;

    public ContractRepositoryAdapter(ContractJpaRepository jpaRepository, ContractEntityMapper mapper) {
        this.jpaRepository = jpaRepository;
        this.mapper = mapper;
    }

    @Override
    @Transactional
    public Contract save(Contract contract) {
        ContractEntity entity = this.mapper.toEntity(contract);
        ContractEntity savedEntity = this.jpaRepository.save(entity);
        return this.mapper.toModel(savedEntity);
    }

    @Override
    public Optional<Contract> findById(UUID id) {
        return this.jpaRepository.findById(id)
                .map(this.mapper::toModel);
    }

    @Override
    public List<Contract> findAll() {
        List<ContractEntity> entities = this.jpaRepository.findAll();
        return entities.stream()
                .map(this.mapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void deleteById(UUID id) {
        this.jpaRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Contract update(Contract contract) {
        ContractEntity entity = this.mapper.toEntity(contract);
        ContractEntity updatedEntity = this.jpaRepository.save(entity);
        return this.mapper.toModel(updatedEntity);
    }

    @Override
    @Transactional
    public Contract cancel(UUID id, String reason) {
        ContractEntity entity = this.jpaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Contrato com ID " + id + " não encontrado"));

        entity.setStatus(ContractStatus.CANCELLED);
        entity.setNotes(reason);

        ContractEntity updatedEntity = this.jpaRepository.save(entity);
        return this.mapper.toModel(updatedEntity);
    }

    @Override
    @Transactional
    public Contract finish(UUID id) {
        ContractEntity entity = this.jpaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Contrato com ID " + id + " não encontrado"));

        entity.setStatus(ContractStatus.FINISHED);
        entity.setTerminationDate(Instant.now());

        ContractEntity updatedEntity = this.jpaRepository.save(entity);
        return this.mapper.toModel(updatedEntity);
    }
}
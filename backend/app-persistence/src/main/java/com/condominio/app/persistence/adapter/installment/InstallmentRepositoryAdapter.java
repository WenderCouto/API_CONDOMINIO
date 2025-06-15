package com.condominio.app.persistence.adapter.installment;

import com.condominio.app.core.model.Installment;
import com.condominio.app.core.port.InstallmentRepository;
import com.condominio.app.persistence.entity.InstallmentEntity;
import com.condominio.app.persistence.mapper.InstallmentEntityMapper;
import com.condominio.app.persistence.repository.InstallmentJpaRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * InstallmentRepositoryAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Component
@RequiredArgsConstructor
public class InstallmentRepositoryAdapter implements InstallmentRepository {

    private final InstallmentJpaRepository jpaRepository;
    private final InstallmentEntityMapper mapper;

    @Override
    @Transactional
    public Installment save(Installment installment) {
        InstallmentEntity entity = this.mapper.toEntity(installment);
        InstallmentEntity savedEntity = this.jpaRepository.save(entity);
        return this.mapper.toModel(savedEntity);
    }

    @Override
    @Transactional
    public Installment update(Installment installment) {
        InstallmentEntity entity = this.mapper.toEntity(installment);
        InstallmentEntity updatedEntity = this.jpaRepository.save(entity);
        return this.mapper.toModel(updatedEntity);
    }

    @Override
    public Optional<Installment> findById(UUID id) {
        return this.jpaRepository.findById(id)
                .map(this.mapper::toModel);
    }

    @Override
    public List<Installment> findAll() {
        List<InstallmentEntity> entities = this.jpaRepository.findAll();
        return entities.stream()
                .map(this.mapper::toModel)
                .collect(Collectors.toList());
    }

    @Override
    @Transactional
    public void deleteById(UUID id) {
        this.jpaRepository.deleteById(id);
    }
}
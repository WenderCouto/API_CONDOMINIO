package com.condominio.app.persistence.adapter.property;

import com.condominio.app.core.model.Property;
import com.condominio.app.core.port.PropertyRepository;
import com.condominio.app.persistence.entity.PropertyEntity;
import com.condominio.app.persistence.mapper.PropertyEntityMapper;
import com.condominio.app.persistence.repository.PropertyJpaRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * PropertyRepositoryAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Component
@RequiredArgsConstructor
public class PropertyRepositoryAdapter implements PropertyRepository {

    private final PropertyJpaRepository jpaRepository;
    private final PropertyEntityMapper mapper;

    @Override
    @Transactional
    public Property save(Property property) {
        PropertyEntity entity = this.mapper.toEntity(property);
        PropertyEntity savedEntity = this.jpaRepository.save(entity);
        return this.mapper.toModel(savedEntity);
    }

    @Override
    @Transactional
    public Property update(Property property) {
        PropertyEntity entity = this.mapper.toEntity(property);
        PropertyEntity updatedEntity = this.jpaRepository.save(entity);
        return this.mapper.toModel(updatedEntity);
    }

    @Override
    public Optional<Property> findById(UUID id) {
        return this.jpaRepository.findById(id)
                .map(this.mapper::toModel);
    }

    @Override
    public List<Property> findAll() {
        List<PropertyEntity> entities = this.jpaRepository.findAll();
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
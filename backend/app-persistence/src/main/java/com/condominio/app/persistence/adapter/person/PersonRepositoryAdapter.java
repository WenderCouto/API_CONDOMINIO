package com.condominio.app.persistence.adapter.person;

import com.condominio.app.core.model.Person;
import com.condominio.app.core.port.PersonRepository;
import com.condominio.app.persistence.entity.PersonEntity;
import com.condominio.app.persistence.mapper.PersonEntityMapper;
import com.condominio.app.persistence.repository.PersonJpaRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * PersonRepositoryAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Component
@RequiredArgsConstructor
public class PersonRepositoryAdapter implements PersonRepository {

    private final PersonJpaRepository jpaRepository;
    private final PersonEntityMapper mapper;

    @Override
    @Transactional
    public Person save(Person person) {
        PersonEntity entity = this.mapper.toEntity(person);
        PersonEntity savedEntity = this.jpaRepository.save(entity);
        return this.mapper.toModel(savedEntity);
    }

    @Override
    @Transactional
    public Person update(Person person) {
        PersonEntity entity = this.mapper.toEntity(person);
        PersonEntity updatedEntity = this.jpaRepository.save(entity);
        return this.mapper.toModel(updatedEntity);
    }

    @Override
    public Optional<Person> findById(UUID id) {
        return this.jpaRepository.findById(id)
                .map(this.mapper::toModel);
    }

    @Override
    public List<Person> findAll() {
        List<PersonEntity> entities = this.jpaRepository.findAll();
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
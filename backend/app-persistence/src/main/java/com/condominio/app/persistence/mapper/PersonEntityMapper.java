package com.condominio.app.persistence.mapper;

import com.condominio.app.core.model.Person;
import com.condominio.app.persistence.entity.PersonEntity;
import org.springframework.stereotype.Component;

/**
 * PersonEntityMapper class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Component
public class PersonEntityMapper {
    public PersonEntity toEntity(Person model) {
        PersonEntity entity = new PersonEntity();

        entity.setId(model.getId());
        entity.setCreatedAt(model.getCreatedAt());
        entity.setCreatedBy(model.getCreatedBy());
        entity.setUpdatedAt(model.getUpdatedAt());
        entity.setUpdatedBy(model.getUpdatedBy());
        entity.setDeletedAt(model.getDeletedAt());
        entity.setDeletedBy(model.getDeletedBy());
        entity.setActive(model.isActive());

        entity.setName(model.getName());
        entity.setPersonType(model.getPersonType());
        entity.setDocument(model.getDocument());
        entity.setEmail(model.getEmail());
        entity.setPhone(model.getPhone());

        return entity;
    }

    public Person toModel(PersonEntity entity) {
        Person model = new Person();

        model.setId(entity.getId());
        model.setCreatedAt(entity.getCreatedAt());
        model.setCreatedBy(entity.getCreatedBy());
        model.setUpdatedAt(entity.getUpdatedAt());
        model.setUpdatedBy(entity.getUpdatedBy());
        model.setDeletedAt(entity.getDeletedAt());
        model.setDeletedBy(entity.getDeletedBy());
        model.setActive(entity.isActive());

        model.setName(entity.getName());
        model.setPersonType(entity.getPersonType());
        model.setDocument(entity.getDocument());
        model.setEmail(entity.getEmail());
        model.setPhone(entity.getPhone());

        return model;
    }
}
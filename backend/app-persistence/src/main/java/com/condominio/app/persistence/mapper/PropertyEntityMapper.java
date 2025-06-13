package com.condominio.app.persistence.mapper;

import com.condominio.app.core.model.Property;
import com.condominio.app.persistence.entity.PropertyEntity;
import org.springframework.stereotype.Component;

/**
 * PropertyEntityMapper class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Component
public class PropertyEntityMapper {

    public PropertyEntity toEntity(Property model) {
        PropertyEntity entity = new PropertyEntity();

        entity.setId(model.getId());
        entity.setCreatedAt(model.getCreatedAt());
        entity.setCreatedBy(model.getCreatedBy());
        entity.setUpdatedAt(model.getUpdatedAt());
        entity.setUpdatedBy(model.getUpdatedBy());
        entity.setDeletedAt(model.getDeletedAt());
        entity.setDeletedBy(model.getDeletedBy());
        entity.setActive(model.isActive());

        entity.setTitle(model.getTitle());
        entity.setDescription(model.getDescription());
        entity.setAddress(model.getAddress());
        entity.setComplement(model.getComplement());
        entity.setPostalCode(model.getPostalCode());
        entity.setNeighborhood(model.getNeighborhood());
        entity.setCity(model.getCity());
        entity.setState(model.getState());
        entity.setCountry(model.getCountry());

        entity.setArea(model.getArea());
        entity.setBedrooms(model.getBedrooms());
        entity.setBathrooms(model.getBathrooms());
        entity.setParkingSpaces(model.getParkingSpaces());

        entity.setFurnished(model.isFurnished());
        entity.setHasElevator(model.isHasElevator());
        entity.setCondominium(model.isCondominium());

        entity.setRegistrationNumber(model.getRegistrationNumber());
        entity.setNotes(model.getNotes());

        return entity;
    }


    public Property toModel(PropertyEntity entity) {
        Property model = new Property();

        model.setId(entity.getId());
        model.setCreatedAt(entity.getCreatedAt());
        model.setCreatedBy(entity.getCreatedBy());
        model.setUpdatedAt(entity.getUpdatedAt());
        model.setUpdatedBy(entity.getUpdatedBy());
        model.setDeletedAt(entity.getDeletedAt());
        model.setDeletedBy(entity.getDeletedBy());
        model.setActive(entity.isActive());

        model.setTitle(entity.getTitle());
        model.setDescription(entity.getDescription());
        model.setAddress(entity.getAddress());
        model.setComplement(entity.getComplement());
        model.setPostalCode(entity.getPostalCode());
        model.setNeighborhood(entity.getNeighborhood());
        model.setCity(entity.getCity());
        model.setState(entity.getState());
        model.setCountry(entity.getCountry());

        model.setArea(entity.getArea());
        model.setBedrooms(entity.getBedrooms());
        model.setBathrooms(entity.getBathrooms());
        model.setParkingSpaces(entity.getParkingSpaces());

        model.setFurnished(entity.isFurnished());
        model.setHasElevator(entity.isHasElevator());
        model.setCondominium(entity.isCondominium());

        model.setRegistrationNumber(entity.getRegistrationNumber());
        model.setNotes(entity.getNotes());

        return model;
    }
}
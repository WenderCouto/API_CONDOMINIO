package com.condominio.app.core.port;

import com.condominio.app.core.model.Property;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * PropertyRepository class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface PropertyRepository {
    Property save(Property property);
    Property update(Property property);
    Optional<Property> findById(UUID id);
    List<Property> findAll();
    void deleteById(UUID id);
}
package com.condominio.app.core.usecase.property;

import com.condominio.app.core.model.Property;

import java.util.Optional;
import java.util.UUID;

/**
 * GetPropertyByIdUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface GetPropertyByIdUseCase {
    Optional<Property> execute(UUID propertyId);
}
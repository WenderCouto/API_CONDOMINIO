package com.condominio.app.core.usecase.property;

import com.condominio.app.core.model.Property;

import java.util.UUID;

/**
 * UpdatePropertyUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface UpdatePropertyUseCase {
    Property execute(UUID id, Property property);
}

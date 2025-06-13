package com.condominio.app.core.usecase.property;

import com.condominio.app.core.model.Property;

/**
 * CreatePropertyUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface CreatePropertyUseCase {
    Property execute(Property property);
}
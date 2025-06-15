package com.condominio.app.core.usecase.property;

import com.condominio.app.core.model.Property;

import java.util.List;

/**
 * ListPropertiesUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface ListPropertiesUseCase {
    List<Property> execute();
}
package com.condominio.app.core.usecase.property;

import java.util.UUID;

/**
 * DeletePropertyUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface DeletePropertyUseCase {
    void execute(UUID propertyId);
}
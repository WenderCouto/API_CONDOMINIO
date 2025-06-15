package com.condominio.app.core.usecase.person;

import java.util.UUID;

/**
 * DeletePersonUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface DeletePersonUseCase {
    void execute(UUID personId);
}
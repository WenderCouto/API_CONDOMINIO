package com.condominio.app.core.usecase.person;

import com.condominio.app.core.model.Person;

import java.util.Optional;
import java.util.UUID;

/**
 * GetPersonByIdUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface GetPersonUseCase {
    Optional<Person> execute(UUID personId);
}
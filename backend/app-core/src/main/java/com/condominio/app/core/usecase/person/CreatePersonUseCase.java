package com.condominio.app.core.usecase.person;

import com.condominio.app.core.model.Person;

/**
 * CreatePersonUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface CreatePersonUseCase {
    Person execute(Person person);
}
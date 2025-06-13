package com.condominio.app.core.usecase.person;

import com.condominio.app.core.model.Person;

import java.util.List;

/**
 * ListPeopleUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface ListPeopleUseCase {
    List<Person> execute();
}
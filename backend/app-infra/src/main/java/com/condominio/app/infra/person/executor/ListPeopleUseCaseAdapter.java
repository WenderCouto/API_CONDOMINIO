package com.condominio.app.infra.person.executor;

import com.condominio.app.core.model.Person;
import com.condominio.app.core.port.PersonRepository;
import com.condominio.app.core.usecase.person.ListPeopleUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ListPeopleUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class ListPeopleUseCaseAdapter implements ListPeopleUseCase {

    private final PersonRepository personRepository;

    public ListPeopleUseCaseAdapter(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public List<Person> execute() {
        return this.personRepository.findAll();
    }
}
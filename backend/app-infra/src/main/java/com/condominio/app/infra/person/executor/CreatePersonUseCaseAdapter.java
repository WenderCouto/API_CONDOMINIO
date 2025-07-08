package com.condominio.app.infra.person.executor;

import com.condominio.app.core.model.Person;
import com.condominio.app.core.port.PersonRepository;
import com.condominio.app.core.usecase.person.CreatePersonUseCase;
import org.springframework.stereotype.Service;

/**
 * CreatePersonUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class CreatePersonUseCaseAdapter implements CreatePersonUseCase {

    private final PersonRepository personRepository;

    public CreatePersonUseCaseAdapter(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Person execute(Person person) {
        return this.personRepository.save(person);
    }
}
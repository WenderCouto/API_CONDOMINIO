package com.condominio.app.infra.person.executor;

import com.condominio.app.core.model.Person;
import com.condominio.app.core.port.PersonRepository;
import com.condominio.app.core.usecase.person.GetPersonUseCase;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 * GetPersonByIdUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class GetPersonUseCaseAdapter implements GetPersonUseCase {

    private final PersonRepository personRepository;

    public GetPersonUseCaseAdapter(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public Optional<Person> execute(UUID id) {
        return this.personRepository.findById(id);
    }
}
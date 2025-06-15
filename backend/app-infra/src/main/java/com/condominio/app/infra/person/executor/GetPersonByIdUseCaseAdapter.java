package com.condominio.app.infra.person.executor;

import com.condominio.app.core.model.Person;
import com.condominio.app.core.port.PersonRepository;
import com.condominio.app.core.usecase.person.GetPersonByIdUseCase;
import lombok.RequiredArgsConstructor;
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
@RequiredArgsConstructor
public class GetPersonByIdUseCaseAdapter implements GetPersonByIdUseCase {

    private final PersonRepository personRepository;

    @Override
    public Optional<Person> execute(UUID id) {
        return this.personRepository.findById(id);
    }
}
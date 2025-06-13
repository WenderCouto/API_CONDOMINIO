package com.condominio.app.infra.person.executor;

import com.condominio.app.core.model.Person;
import com.condominio.app.core.port.PersonRepository;
import com.condominio.app.core.usecase.person.UpdatePersonUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * UpdatePersonUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
@RequiredArgsConstructor
public class UpdatePersonUseCaseAdapter implements UpdatePersonUseCase {

    private final PersonRepository personRepository;

    @Override
    public Person execute(UUID id, Person person) {
        this.personRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Pessoa com ID " + id + " não encontrada"));

        person.setId(id);
        return this.personRepository.update(person);
    }
}
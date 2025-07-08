package com.condominio.app.infra.person.executor;

import com.condominio.app.core.port.PersonRepository;
import com.condominio.app.core.usecase.person.DeletePersonUseCase;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * DeletePersonUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class DeletePersonUseCaseAdapter implements DeletePersonUseCase {

    private final PersonRepository personRepository;

    public DeletePersonUseCaseAdapter(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public void execute(UUID id) {
        this.personRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Pessoa com ID " + id + " não encontrada"));
        this.personRepository.deleteById(id);
    }
}
package com.condominio.app.infra.property.executor;

import com.condominio.app.core.port.PropertyRepository;
import com.condominio.app.core.usecase.property.DeletePropertyUseCase;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * DeletePropertyUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class DeletePropertyUseCaseAdapter implements DeletePropertyUseCase {

    private final PropertyRepository propertyRepository;

    public DeletePropertyUseCaseAdapter(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public void execute(UUID id) {
        this.propertyRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Imóvel com ID " + id + " não encontrado"));
        this.propertyRepository.deleteById(id);
    }
}
package com.condominio.app.infra.property.executor;

import com.condominio.app.core.model.Property;
import com.condominio.app.core.port.PropertyRepository;
import com.condominio.app.core.usecase.property.UpdatePropertyUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * UpdatePropertyUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
@RequiredArgsConstructor
public class UpdatePropertyUseCaseAdapter implements UpdatePropertyUseCase {

    private final PropertyRepository propertyRepository;

    @Override
    public Property execute(UUID id, Property property) {
        this.propertyRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Imóvel com ID " + id + " não encontrado"));

        property.setId(id);
        return this.propertyRepository.update(property);
    }
}
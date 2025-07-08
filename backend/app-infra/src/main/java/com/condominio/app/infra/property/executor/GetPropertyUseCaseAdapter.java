package com.condominio.app.infra.property.executor;

import com.condominio.app.core.model.Property;
import com.condominio.app.core.port.PropertyRepository;
import com.condominio.app.core.usecase.property.GetPropertyUseCase;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 * GetPropertyByIdUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class GetPropertyUseCaseAdapter implements GetPropertyUseCase {

    private final PropertyRepository propertyRepository;

    public GetPropertyUseCaseAdapter(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public Optional<Property> execute(UUID id) {
        return this.propertyRepository.findById(id);
    }
}
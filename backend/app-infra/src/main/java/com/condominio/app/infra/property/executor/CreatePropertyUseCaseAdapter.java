package com.condominio.app.infra.property.executor;

import com.condominio.app.core.model.Property;
import com.condominio.app.core.port.PropertyRepository;
import com.condominio.app.core.usecase.property.CreatePropertyUseCase;
import org.springframework.stereotype.Service;

/**
 * CreatePropertyUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class CreatePropertyUseCaseAdapter implements CreatePropertyUseCase {

    private final PropertyRepository propertyRepository;

    public CreatePropertyUseCaseAdapter(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public Property execute(Property property) {
        return this.propertyRepository.save(property);
    }
}
package com.condominio.app.infra.property.executor;

import com.condominio.app.core.model.Property;
import com.condominio.app.core.port.PropertyRepository;
import com.condominio.app.core.usecase.property.ListPropertiesUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ListPropertiesUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class ListPropertiesUseCaseAdapter implements ListPropertiesUseCase {

    private final PropertyRepository propertyRepository;

    public ListPropertiesUseCaseAdapter(PropertyRepository propertyRepository) {
        this.propertyRepository = propertyRepository;
    }

    @Override
    public List<Property> execute() {
        return this.propertyRepository.findAll();
    }
}
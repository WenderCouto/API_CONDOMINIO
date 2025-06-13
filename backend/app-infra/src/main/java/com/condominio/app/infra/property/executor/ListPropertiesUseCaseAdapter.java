package com.condominio.app.infra.property.executor;

import com.condominio.app.core.model.Property;
import com.condominio.app.core.port.PropertyRepository;
import com.condominio.app.core.usecase.property.ListPropertiesUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ListPropertiesUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
@RequiredArgsConstructor
public class ListPropertiesUseCaseAdapter implements ListPropertiesUseCase {

    private final PropertyRepository propertyRepository;

    @Override
    public List<Property> execute() {
        return this.propertyRepository.findAll();
    }
}
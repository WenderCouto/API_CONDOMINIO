package com.condominio.app.infra.installment.executor;

import com.condominio.app.core.model.Installment;
import com.condominio.app.core.port.InstallmentRepository;
import com.condominio.app.core.usecase.installment.GetInstallmentByIdUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

/**
 * GetInstallmentByIdUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
@RequiredArgsConstructor
public class GetInstallmentByIdUseCaseAdapter implements GetInstallmentByIdUseCase {

    private final InstallmentRepository installmentRepository;

    @Override
    public Optional<Installment> execute(UUID id) {
        return this.installmentRepository.findById(id);
    }
}
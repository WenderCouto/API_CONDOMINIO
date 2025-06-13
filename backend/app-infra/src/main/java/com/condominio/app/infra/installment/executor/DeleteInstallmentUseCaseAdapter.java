package com.condominio.app.infra.installment.executor;

import com.condominio.app.core.port.InstallmentRepository;
import com.condominio.app.core.usecase.installment.DeleteInstallmentUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * DeleteInstallmentUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
@RequiredArgsConstructor
public class DeleteInstallmentUseCaseAdapter implements DeleteInstallmentUseCase {

    private final InstallmentRepository installmentRepository;

    @Override
    public void execute(UUID id) {
        this.installmentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Parcela com ID " + id + " não encontrada"));
        this.installmentRepository.deleteById(id);
    }
}
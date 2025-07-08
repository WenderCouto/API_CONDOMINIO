package com.condominio.app.infra.installment.executor;

import com.condominio.app.core.model.Installment;
import com.condominio.app.core.port.InstallmentRepository;
import com.condominio.app.core.usecase.installment.UpdateInstallmentUseCase;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * UpdateInstallmentUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class UpdateInstallmentUseCaseAdapter implements UpdateInstallmentUseCase {

    private final InstallmentRepository installmentRepository;

    public UpdateInstallmentUseCaseAdapter(InstallmentRepository installmentRepository) {
        this.installmentRepository = installmentRepository;
    }

    @Override
    public Installment execute(UUID id, Installment installment) {
        this.installmentRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Parcela com ID " + id + " não encontrada"));

        installment.setId(id);
        return this.installmentRepository.update(installment);
    }
}
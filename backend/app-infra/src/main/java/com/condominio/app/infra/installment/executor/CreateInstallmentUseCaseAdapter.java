package com.condominio.app.infra.installment.executor;

import com.condominio.app.core.model.Installment;
import com.condominio.app.core.port.InstallmentRepository;
import com.condominio.app.core.usecase.installment.CreateInstallmentUseCase;
import org.springframework.stereotype.Service;

/**
 * CreateInstallmentUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class CreateInstallmentUseCaseAdapter implements CreateInstallmentUseCase {

    private final InstallmentRepository installmentRepository;

    public CreateInstallmentUseCaseAdapter(InstallmentRepository installmentRepository) {
        this.installmentRepository = installmentRepository;
    }

    @Override
    public Installment execute(Installment installment) {
        return this.installmentRepository.save(installment);
    }
}
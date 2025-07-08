package com.condominio.app.infra.installment.executor;

import com.condominio.app.core.model.Installment;
import com.condominio.app.core.port.InstallmentRepository;
import com.condominio.app.core.usecase.installment.ListInstallmentsUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ListInstallmentsUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class ListInstallmentsUseCaseAdapter implements ListInstallmentsUseCase {

    private final InstallmentRepository installmentRepository;

    public ListInstallmentsUseCaseAdapter(InstallmentRepository installmentRepository) {
        this.installmentRepository = installmentRepository;
    }

    @Override
    public List<Installment> execute() {
        return this.installmentRepository.findAll();
    }
}
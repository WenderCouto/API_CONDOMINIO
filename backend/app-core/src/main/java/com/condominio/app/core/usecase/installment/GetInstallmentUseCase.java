package com.condominio.app.core.usecase.installment;

import com.condominio.app.core.model.Installment;

import java.util.Optional;
import java.util.UUID;

/**
 * GetInstallmentByIdUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */


public interface GetInstallmentUseCase {
    Optional<Installment> execute(UUID installmentId);
}
package com.condominio.app.core.usecase.installment;

import com.condominio.app.core.model.Installment;

import java.util.UUID;

/**
 * UpdateInstallmentUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface UpdateInstallmentUseCase {
    Installment execute(UUID id, Installment installment);
}
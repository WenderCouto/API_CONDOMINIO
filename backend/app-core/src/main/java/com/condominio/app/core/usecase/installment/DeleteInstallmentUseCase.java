package com.condominio.app.core.usecase.installment;

import java.util.UUID;

/**
 * DeleteInstallmentUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface DeleteInstallmentUseCase {
    void execute(UUID installmentId);
}
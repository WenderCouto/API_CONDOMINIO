package com.condominio.app.core.usecase.installment;

import com.condominio.app.core.model.Installment;

/**
 * CreateInstallmentUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface CreateInstallmentUseCase {
    Installment execute(Installment installment);
}
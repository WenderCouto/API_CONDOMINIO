package com.condominio.app.core.usecase.installment;

import com.condominio.app.core.model.Installment;

import java.util.List;

/**
 * ListInstallmentsUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface ListInstallmentsUseCase {
    List<Installment> execute();
}
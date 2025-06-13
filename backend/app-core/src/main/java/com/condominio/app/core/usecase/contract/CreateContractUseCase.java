package com.condominio.app.core.usecase.contract;

import com.condominio.app.core.model.Contract;

/**
 * CreateContractUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface CreateContractUseCase {
    Contract execute(Contract contract);
}
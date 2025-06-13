package com.condominio.app.core.usecase.contract;

import com.condominio.app.core.model.Contract;

import java.util.UUID;

/**
 * UpdateContractUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface UpdateContractUseCase {
    Contract execute(UUID id, Contract contract);
}
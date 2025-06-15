package com.condominio.app.core.usecase.contract;

import com.condominio.app.core.model.Contract;

import java.util.UUID;

/**
 * FinishContractUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface FinishContractUseCase {
    Contract execute(UUID contractId);
}
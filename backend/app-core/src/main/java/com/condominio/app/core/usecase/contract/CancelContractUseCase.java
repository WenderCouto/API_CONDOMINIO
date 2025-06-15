package com.condominio.app.core.usecase.contract;

import com.condominio.app.core.model.Contract;

import java.util.UUID;

/**
 * CancelContractUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface CancelContractUseCase {
    Contract execute(UUID id, String reason);
}
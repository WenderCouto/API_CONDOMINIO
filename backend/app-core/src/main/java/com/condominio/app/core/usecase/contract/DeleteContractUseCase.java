package com.condominio.app.core.usecase.contract;

import java.util.UUID;

/**
 * DeleteContractUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface DeleteContractUseCase {
    void execute(UUID contractId);
}
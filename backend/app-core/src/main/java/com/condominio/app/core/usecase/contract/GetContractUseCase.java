package com.condominio.app.core.usecase.contract;

import com.condominio.app.core.model.Contract;

import java.util.Optional;
import java.util.UUID;

/**
 * GetContractByIdUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface GetContractUseCase {
    Optional<Contract> execute(UUID contractId);
}
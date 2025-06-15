package com.condominio.app.infra.contract.executor;

import com.condominio.app.core.model.Contract;
import com.condominio.app.core.port.ContractRepository;
import com.condominio.app.core.usecase.contract.CancelContractUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * CancelContractUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
@RequiredArgsConstructor
public class CancelContractUseCaseAdapter implements CancelContractUseCase {

    private final ContractRepository contractRepository;

    @Override
    public Contract execute(UUID id, String reason) {
        return this.contractRepository.cancel(id, reason);
    }
}
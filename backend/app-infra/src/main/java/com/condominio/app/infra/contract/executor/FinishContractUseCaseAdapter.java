package com.condominio.app.infra.contract.executor;

import com.condominio.app.core.model.Contract;
import com.condominio.app.core.port.ContractRepository;
import com.condominio.app.core.usecase.contract.FinishContractUseCase;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * FinishContractUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class FinishContractUseCaseAdapter implements FinishContractUseCase {

    private final ContractRepository contractRepository;

    public FinishContractUseCaseAdapter(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public Contract execute(UUID id) {
        return this.contractRepository.finish(id);
    }
}
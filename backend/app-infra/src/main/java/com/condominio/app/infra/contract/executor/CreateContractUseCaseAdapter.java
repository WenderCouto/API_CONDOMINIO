package com.condominio.app.infra.contract.executor;

import com.condominio.app.core.model.Contract;
import com.condominio.app.core.port.ContractRepository;
import com.condominio.app.core.usecase.contract.CreateContractUseCase;
import org.springframework.stereotype.Service;

/**
 * CreateContractUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class CreateContractUseCaseAdapter implements CreateContractUseCase {

    private final ContractRepository contractRepository;

    public CreateContractUseCaseAdapter(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public Contract execute(Contract contract) {
        return this.contractRepository.save(contract);
    }
}
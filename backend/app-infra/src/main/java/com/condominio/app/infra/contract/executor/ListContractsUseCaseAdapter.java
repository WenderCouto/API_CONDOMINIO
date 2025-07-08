package com.condominio.app.infra.contract.executor;

import com.condominio.app.core.model.Contract;
import com.condominio.app.core.port.ContractRepository;
import com.condominio.app.core.usecase.contract.ListContractsUseCase;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ListContractsUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class ListContractsUseCaseAdapter implements ListContractsUseCase {

    private final ContractRepository contractRepository;

    public ListContractsUseCaseAdapter(ContractRepository contractRepository) {

        this.contractRepository = contractRepository;
    }

    @Override
    public List<Contract> execute() {
        return this.contractRepository.findAll();
    }
}
package com.condominio.app.infra.contract.executor;

import com.condominio.app.core.port.ContractRepository;
import com.condominio.app.core.usecase.contract.DeleteContractUseCase;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * DeleteContractUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
public class DeleteContractUseCaseAdapter implements DeleteContractUseCase {

    private final ContractRepository contractRepository;

    public DeleteContractUseCaseAdapter(ContractRepository contractRepository) {
        this.contractRepository = contractRepository;
    }

    @Override
    public void execute(UUID id) {
        this.contractRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Contrato com ID " + id + " não encontrado"));
        this.contractRepository.deleteById(id);
    }
}
package com.condominio.app.infra.contract.executor;

import com.condominio.app.core.model.Contract;
import com.condominio.app.core.port.ContractRepository;
import com.condominio.app.core.usecase.contract.UpdateContractUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * UpdateContractUseCaseAdapter class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Service
@RequiredArgsConstructor
public class UpdateContractUseCaseAdapter implements UpdateContractUseCase {

    private final ContractRepository contractRepository;

    @Override
    public Contract execute(UUID id, Contract contract) {
        this.contractRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Contrato com ID " + id + " não encontrado"));

        contract.setId(id);

        return this.contractRepository.update(contract);
    }
}
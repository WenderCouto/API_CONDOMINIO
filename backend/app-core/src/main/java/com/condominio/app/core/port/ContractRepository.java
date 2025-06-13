package com.condominio.app.core.port;

import com.condominio.app.core.model.Contract;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * ContractRepository class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface ContractRepository {
    Contract save(Contract contract);
    Optional<Contract> findById(UUID id);
    List<Contract> findAll();
    Contract update(Contract contract);
    void deleteById(UUID id);
    Contract cancel(UUID id, String reason);
    Contract finish(UUID id);
}
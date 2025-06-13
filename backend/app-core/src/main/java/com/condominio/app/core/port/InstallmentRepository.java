package com.condominio.app.core.port;

import com.condominio.app.core.model.Installment;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * InstallmentRepository class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface InstallmentRepository {
    Installment save(Installment installment);
    Installment update(Installment installment);
    Optional<Installment> findById(UUID id);
    List<Installment> findAll();
    void deleteById(UUID id);
}
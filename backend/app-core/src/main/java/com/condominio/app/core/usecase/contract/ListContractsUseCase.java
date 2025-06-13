package com.condominio.app.core.usecase.contract;

import com.condominio.app.core.model.Contract;

import java.util.List;

/**
 * ListContractsUseCase class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface ListContractsUseCase {
    List<Contract> execute();
}
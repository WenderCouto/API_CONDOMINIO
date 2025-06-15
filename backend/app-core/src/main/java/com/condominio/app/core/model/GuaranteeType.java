package com.condominio.app.core.model;

/**
 * GuaranteeType class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public enum GuaranteeType {
    GUARANTEE,            // O caução
    GUARANTOR,            // FIADOR
    INSURANCE_GUARANTEE,  // SEGURO FIANÇA
    CAPITALIZATION_TITLE, // Título de capitalização
    UNKNOWN,              // Caso de erro
}
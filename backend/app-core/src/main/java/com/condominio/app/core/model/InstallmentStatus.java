package com.condominio.app.core.model;

/**
 * InstallmentStatus class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public enum InstallmentStatus {
    PAID,        // QUITADA
    PENDING,     // PENDENTE
    OVERDUE,     // VENCIDA
    CANCELED,    // Auto explicativo
    UNKNOWN,     // Caso de erro
}
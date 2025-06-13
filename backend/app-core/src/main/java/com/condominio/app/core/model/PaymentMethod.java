package com.condominio.app.core.model;

/**
 * PaymentMethod class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public enum PaymentMethod {
    PIX,             // Auto explicativo
    PAYPAL,          // Auto explicativo
    TRANSFER,        // TRANSFERENCIA
    BANK_SLIP,       // BOLETO
    CREDIT_CARD,     // CARTAO DE CREDITO
    AUTOMATIC_DEBIT, // DEBITO AUTOMATICO
    UNKNOWN,         // Caso de erro
}
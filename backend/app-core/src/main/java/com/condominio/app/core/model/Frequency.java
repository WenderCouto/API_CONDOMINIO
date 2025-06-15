package com.condominio.app.core.model;

/**
 * Frequency class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public enum Frequency { //Talvez vale mudar o nome da classe para algo menos genérico
    MONTHLY,     // MENSAL
    BIMONTHLY,   // BIMESTRAL
    QUARTERLY,   // TRIMESTRAL
    HALF_YEARLY, // SEMESTRAL
    ANNUALLY,    // ANUAL
    UNKNOWN,     // Caso de erro
}
package com.condominio.app.core.model;

/**
 * PersonType class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public enum PersonType {
    LEGAL_ENTITY,      // Pessoa juridica
    INDIVIDUAL_ENTITY, // Pessoa fisica
    // Nota: Aposentado não lembro se é incluso
    UNKNOWN,           // Caso de erro
}
package com.condominio.app.core.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.Instant;
import java.util.UUID;

/**
 * BaseModel class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public abstract class BaseModel {

    private UUID id;

    // Controle de estados
    private Instant createdAt = Instant.now();
    private UUID createdBy;                    // Criado por quem

    private Instant updatedAt;                 // Modificado quando
    private UUID updatedBy;                    // Modificado por quem

    private UUID deletedBy;                    // Deletado ou desativado por quem
    private Instant deletedAt;                 // Deletado ou desativado quando

    private boolean isActive = true;           // Se ativo ou não
}
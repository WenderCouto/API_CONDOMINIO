package com.condominio.app.persistence.repository;

import com.condominio.app.persistence.entity.InstallmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * InstallmentJpaRepository class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Repository
public interface InstallmentJpaRepository extends JpaRepository<InstallmentEntity, UUID> {
}
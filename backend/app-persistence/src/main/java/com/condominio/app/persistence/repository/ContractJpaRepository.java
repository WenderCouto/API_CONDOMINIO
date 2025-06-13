package com.condominio.app.persistence.repository;

import com.condominio.app.persistence.entity.ContractEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * ContractJpaRepository class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Repository
public interface ContractJpaRepository extends JpaRepository<ContractEntity, UUID> {
}
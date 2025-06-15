package com.condominio.app.persistence.repository;

import com.condominio.app.persistence.entity.PropertyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * PropertyJpaRepository class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Repository
public interface PropertyJpaRepository extends JpaRepository<PropertyEntity, UUID> {
}
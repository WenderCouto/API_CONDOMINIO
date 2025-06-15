package com.condominio.app.persistence.repository;

import com.condominio.app.persistence.entity.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * PersonJpaRepository class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

@Repository
public interface PersonJpaRepository extends JpaRepository<PersonEntity, UUID> {
}
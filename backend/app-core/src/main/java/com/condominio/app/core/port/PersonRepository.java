package com.condominio.app.core.port;

import com.condominio.app.core.model.Person;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * PersonRepository class.
 *
 * @author Wender Couto
 * @since 0.0.0.1-SNAPSHOT
 */

public interface PersonRepository {
    Person save(Person person);
    Person update(Person person);
    Optional<Person> findById(UUID id);
    List<Person> findAll();
    void deleteById(UUID id);
}
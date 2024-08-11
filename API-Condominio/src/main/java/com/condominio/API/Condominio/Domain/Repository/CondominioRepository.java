package com.condominio.API.Condominio.Domain.Repository;

import com.condominio.API.Condominio.Domain.Entity.Condominio.Condominio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CondominioRepository extends JpaRepository<Condominio, Long> {
}

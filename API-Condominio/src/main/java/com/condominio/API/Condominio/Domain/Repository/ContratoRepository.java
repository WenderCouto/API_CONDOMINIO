package com.condominio.API.Condominio.Domain.Repository;

import com.condominio.API.Condominio.Domain.Entity.Contrato.Contrato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContratoRepository extends JpaRepository<Contrato, Long> {
}

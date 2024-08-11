package com.condominio.API.Condominio.Domain.Repository;

import com.condominio.API.Condominio.Domain.Entity.Apartamento.Apartamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApartamentoRepository extends JpaRepository<Apartamento, Long> {
}

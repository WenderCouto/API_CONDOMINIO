package com.condominio.API.Condominio.Domain.Repository;

import com.condominio.API.Condominio.Domain.Entity.Pessoa.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}

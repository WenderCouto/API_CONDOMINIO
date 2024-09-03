package com.condominio.API.Condominio.Domain.Repository;

import com.condominio.API.Condominio.Domain.Entity.Apartamento.Apartamento;
import com.condominio.API.Condominio.Domain.Entity.Apartamento.DadosListagemApartamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ApartamentoRepository extends JpaRepository<Apartamento, Long> {


    @Query(value = "select a from Apartamento a where a.condominio.id = :id")
    List<Apartamento> findWhereIdCondominio(@Param("id") Long id);

}

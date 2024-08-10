package com.condominio.API.Condominio.Domain.Entity.Apartamento;

import com.condominio.API.Condominio.Domain.Entity.Condominio.Condominio;
import com.condominio.API.Condominio.Domain.Entity.Pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Table(name = "Apartamentos")
@Entity(name = "Apartamento")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Apartamento {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numero;
    private Integer unidadeConsumidora;
    private String descrição;
    private BigDecimal valor;
    private LocalDate dataPagamento;

    @ElementCollection
    private List<ParcelaCaucao> calcaoParcelado;

    private Integer tempoContrato;

    @OneToMany(mappedBy = "apartamento", fetch = FetchType.LAZY)
    private List<Pessoa> inquilinos;

    @ManyToOne
    @JoinColumn(name = "condominio_id")
    private Condominio condominio;




}

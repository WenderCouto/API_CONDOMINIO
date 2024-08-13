package com.condominio.API.Condominio.Domain.Entity.Contrato;

import com.condominio.API.Condominio.Domain.Entity.Apartamento.Apartamento;
import com.condominio.API.Condominio.Domain.Entity.Pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Table(name = "Contratos")
@Entity(name = "Contrato")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Contrato {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate dataPagamento;
    private Integer tempoContrato;
    private BigDecimal aluguel;

    @ElementCollection
    private List<ParcelaCaucao> calcaoParcelado;

    @OneToMany(mappedBy = "contrato")
    private List<Pessoa> pessoas;

    @OneToOne
    @JoinColumn(name = "apartamento_id")
    private Apartamento apartamento;


}

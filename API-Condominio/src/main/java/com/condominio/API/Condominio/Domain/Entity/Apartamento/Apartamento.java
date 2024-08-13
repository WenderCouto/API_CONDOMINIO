package com.condominio.API.Condominio.Domain.Entity.Apartamento;

import com.condominio.API.Condominio.Domain.Entity.Condominio.Condominio;
import com.condominio.API.Condominio.Domain.Entity.Contrato.Contrato;
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

    private boolean disponivel; // Nova variável para controlar a disponibilidade

    @OneToMany(mappedBy = "apartamento", fetch = FetchType.LAZY)
    private List<Pessoa> inquilinos;

    @ManyToOne
    @JoinColumn(name = "condominio_id")
    private Condominio condominio;

    @OneToOne
    @JoinColumn(name ="contrato_id")
    private Contrato contrato;

    public Apartamento(DadosCadastroApartamento dados  ){
        this.disponivel = true;
        this.numero = dados.numero();
        this.unidadeConsumidora = dados.unidadeConsumidora();
        this.descrição = dados.descricao();
        this.valor = dados.valor();


    }


}

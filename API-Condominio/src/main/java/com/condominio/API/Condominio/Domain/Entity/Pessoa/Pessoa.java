package com.condominio.API.Condominio.Domain.Entity.Pessoa;

import com.condominio.API.Condominio.Domain.Entity.Apartamento.Apartamento;
import com.condominio.API.Condominio.Domain.Entity.Condominio.Condominio;
import com.condominio.API.Condominio.Domain.Entity.Contrato.Contrato;
import com.condominio.API.Condominio.Domain.Entity.Endereco.Endereco;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Table(name = "Pessoas")
@Entity(name = "Pessoa")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Pessoa {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private TipoPessoa tipo;

    private String nome;
    private String cpf;
    private String telefone;
    private String localDeTrabalho;
    private String filiação;
    private LocalDate dataNascimento;

    @Embedded
    private Endereco endereco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "apartamento_id")
    private Apartamento apartamento;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "condominio_id")
    private Condominio condominio;

    @ManyToOne
    @JoinColumn(name = "contrato_id")
    private Contrato contrato;

    public Pessoa(DadosCadastroPessoa dados) {
        this.nome = dados.nome();
        this.endereco = dados.endereco();
        this.cpf = dados.cpf();
        this.telefone = dados.telefone();
        this.localDeTrabalho = dados.localDeTrabalho();
        this.filiação = dados.filiacao();
        this.dataNascimento = dados.dataNascimento();
        this.tipo = dados.tipoPessoa();
    }


}

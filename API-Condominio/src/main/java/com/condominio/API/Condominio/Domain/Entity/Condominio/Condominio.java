package com.condominio.API.Condominio.Domain.Entity.Condominio;

import com.condominio.API.Condominio.Domain.Entity.Apartamento.Apartamento;
import com.condominio.API.Condominio.Domain.Entity.Endereco.Endereco;
import com.condominio.API.Condominio.Domain.Entity.Pessoa.Pessoa;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Table(name = "Condominios")
@Entity(name = "Condominio")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
public class Condominio {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Embedded
    private Endereco endereco;

    @OneToMany(mappedBy = "condominio")
    private List<Pessoa> pessoas;

    @OneToMany(mappedBy = "condominio")
    private List<Apartamento> apartamentos;

    public Condominio(DadosCadastroCondominio dados){
        this.nome = dados.nome();
        this.endereco = new Endereco(dados.endereco());
    }

}

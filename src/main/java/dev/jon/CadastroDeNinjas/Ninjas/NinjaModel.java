package dev.jon.CadastroDeNinjas.Ninjas;

import dev.jon.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_-cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    // um ninjan por missao
    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissoesModel missoes;

}

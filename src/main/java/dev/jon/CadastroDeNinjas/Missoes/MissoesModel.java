package dev.jon.CadastroDeNinjas.Missoes;

import dev.jon.CadastroDeNinjas.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeMissao;
    private String dificuldadeMissao;
    private NinjaModel ninja;

    @OneToMany(mappedBy = "missoes")
    private List<NinjaModel> ninjas;


}

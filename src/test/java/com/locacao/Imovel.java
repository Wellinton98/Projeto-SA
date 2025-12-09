package com.locacao;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer idImovel;

    public Boolean disponivel;

    public String descricao; // adicionado para o teste funcionar

    public void setIdImovel(Integer idImovel) {
        this.idImovel = idImovel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}






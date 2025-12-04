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


}






package com.locacao.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_imovel;

    @Column(nullable = false, length = 150)
    private String endereco;

    @Column(nullable = false, length = 15)
    private String tipo;

    private Short quartos;
    private Short banheiros;
    private short vagas;
    private Boolean mobilia;
    
    public void setId_imovel(Integer id_imovel) {
        this.id_imovel = id_imovel;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setQuartos(Short quartos) {
        this.quartos = quartos;
    }
    public void setBanheiros(Short banheiros) {
        this.banheiros = banheiros;
    }
    public void setVagas(short vagas) {
        this.vagas = vagas;
    }
    public void setMobilia(Boolean mobilia) {
        this.mobilia = mobilia;
    }
    

}

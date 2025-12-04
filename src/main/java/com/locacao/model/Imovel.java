package com.locacao.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idImovel;

    private String endereco;
    private String tipo;
    private Short quartos;
    private Short banheiros;
    private Short vagas;
    private Boolean mobilia;
    private Boolean disponivel;
    private String descricao;
    private String valorAluguel;
   

    // GETTERS
    public Integer getIdImovel() { return idImovel; }
    public String getEndereco() { return endereco; }
    public String getTipo() { return tipo; }
    public Boolean getDisponivel() { return disponivel; }
    public String getDescricao() { return descricao; }

    // SETTERS
    public void setId_imovel(Integer id) { this.idImovel = id; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public void setQuartos(Short quartos) { this.quartos = quartos; }
    public void setBanheiros(Short banheiros) { this.banheiros = banheiros; }
    public void setVagas(short vagas) { this.vagas = vagas; }
    public void setMobilia(Boolean mobilia) { this.mobilia = mobilia; }
    public void setDisponivel(Boolean disponivel) { this.disponivel = disponivel; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}

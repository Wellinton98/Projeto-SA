package com.locacao.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

    @Entity
    public class Aluguel {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer id_aluguel;

    private Integer data_inicio;
    private Integer data_fim;

    @Column(precision = 10, scale = 2)
    private BigDecimal valor_mensal;

    private Boolean seguro_incendio;

    @Column(length = 500)
    private String contrato_aluguel;

    @Column(length = 150)
    private String nome_fiador;

    @Column(length = 150)
    private String cpf_fiador;

    @Column(precision = 10, scale = 2)
    private BigDecimal valor_seguro_incedio;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "imovel_idImovel", nullable = false)
    private Imovel imovel;

    public void setId_aluguel(Integer id_aluguel) {
        this.id_aluguel = id_aluguel;
    }

    public void setData_inicio(Integer data_inicio) {
        this.data_inicio = data_inicio;
    }

    public void setData_fim(Integer data_fim) {
        this.data_fim = data_fim;
    }

    public void setValor_mensal(BigDecimal valor_mensal) {
        this.valor_mensal = valor_mensal;
    }

    public void setSeguro_incendio(Boolean seguro_incendio) {
        this.seguro_incendio = seguro_incendio;
    }

    public void setContrato_aluguel(String contrato_aluguel) {
        this.contrato_aluguel = contrato_aluguel;
    }

    public void setNome_fiador(String nome_fiador) {
        this.nome_fiador = nome_fiador;
    }

    public void setCpf_fiador(String cpf_fiador) {
        this.cpf_fiador = cpf_fiador;
    }

    public void setValor_seguro_incedio(BigDecimal valor_seguro_incedio) {
        this.valor_seguro_incedio = valor_seguro_incedio;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
    
}

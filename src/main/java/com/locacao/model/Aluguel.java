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
    private Integer idAluguel;

    private Integer dataInicio;
    private Integer dataFim;

    @Column(precision = 10, scale = 2)
    private BigDecimal valorMensal;

    private Boolean seguroIncendio;

    @Column(length = 500)
    private String contratoAluguel;

    @Column(length = 150)
    private String nomeFiador;

    @Column(length = 150)
    private String cpfFiador;

    @Column(precision = 10, scale = 2)
    private BigDecimal valorSeguroIncedio;

    @ManyToOne
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "imovelIdImovel", nullable = false)
    private Imovel imovel;

    public void setId_aluguel(Integer id_aluguel) {
        this.idAluguel = idAluguel;
    }

    public void setData_inicio(Integer data_inicio) {
        this.dataInicio = dataInicio;
    }

    public void setData_fim(Integer data_fim) {
        this.dataFim = dataFim;
    }

    public void setValor_mensal(BigDecimal valor_mensal) {
        this.valorMensal = valorMensal;
    }

    public void setSeguro_incendio(Boolean seguro_incendio) {
        this.seguroIncendio = seguroIncendio;
    }

    public void setContrato_aluguel(String contrato_aluguel) {
        this.contratoAluguel = contratoAluguel;
    }

    public void setNome_fiador(String nome_fiador) {
        this.nomeFiador = nomeFiador;
    }

    public void setCpf_fiador(String cpf_fiador) {
        this.cpfFiador = cpfFiador;
    }

    public void setValor_seguro_incedio(BigDecimal valor_seguro_incedio) {
        this.valorSeguroIncedio = valorSeguroIncedio;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setImovel(Imovel imovel) {
        this.imovel = imovel;
    }
    
}

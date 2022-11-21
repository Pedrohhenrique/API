package com.example.demo.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotNull(message = "O nome é obrigatorio!")
    private String cep;
    private String endereco;
    private Integer formaPagamento;
    private Integer parcelas;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;

    public Cliente(String cep, String endereco, List<Produto> produtos) {
        this.cep = cep;
        this.endereco = endereco;
        this.produtos = produtos;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
    }

    public Cliente() {
    }

    public Integer getFormaPagamento() {
        return formaPagamento;
    }

    public Integer getParcelas() {
        return parcelas;
    }

    public void setFormaPagamento(Integer formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public Long getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
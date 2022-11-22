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
    private String formaPagamento;
    private Integer parcelas;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Produto> produtos;

    public Cliente(String cep, String endereco, String formaPagamento, Integer parcelas, List<Produto> produtos) {
        this.cep = cep;
        this.endereco = endereco;
        this.produtos = produtos;
        this.formaPagamento = formaPagamento;
        this.parcelas = parcelas;
    }

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public String getCep() {
        return cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public Integer getParcelas() {
        return parcelas;
    }


    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public void setParcelas(Integer parcelas) {
        this.parcelas = parcelas;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }


}
package com.cadastro.veiculos.dto;
import java.io.Serializable;
import java.time.Instant;

import com.cadastro.veiculos.entities.Veiculo;

public class VeiculoDto implements Serializable {
	private static final long serialVersionUID = 1L;

    private Integer id;
    private String veiculo;
    private String marca;
    private Integer ano;
    private String descricao;
    private boolean vendido;

    public VeiculoDto(Integer id, String veiculo, String marca, Integer ano, String descricao, boolean vendido) {
        this.id = id;
        this.veiculo = veiculo;
        this.marca = marca;
        this.ano = ano;
        this.descricao = descricao;
        this.vendido = vendido;
    }

    public VeiculoDto(Veiculo entity){
        this.id = entity.getId();
        this.veiculo = entity.getVeiculo();
        this.marca = entity.getMarca();
        this.ano = entity.getAno();
        this.descricao = entity.getDescricao();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    } 
}

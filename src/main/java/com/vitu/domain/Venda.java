package com.vitu.domain;


import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.serde.annotation.Serdeable;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

@Serdeable
@MappedEntity
public class Venda {

    @Id
    @GeneratedValue
    private String id;
    private String cliente;
    private Veiculo veiculo;
    private BigDecimal valor;
    private List<Parcela> parcelas;

    public Venda() {
    }

    public Venda(String id, String cliente, Veiculo veiculo, BigDecimal valor, List<Parcela> parcelas) {
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.valor = valor;
        this.parcelas = parcelas;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public List<Parcela> getParcelas() {
        return parcelas;
    }

    public void setParcelas(List<Parcela> parcelas) {
        this.parcelas = parcelas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return Objects.equals(cliente, venda.cliente) && Objects.equals(veiculo, venda.veiculo) && Objects.equals(valor, venda.valor) && Objects.equals(parcelas, venda.parcelas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cliente, veiculo, valor, parcelas);
    }

    @Override
    public String toString() {
        return "Venda[" +
                "cliente=" + cliente + ", " +
                "veiculo=" + veiculo + ", " +
                "valor=" + valor + ", " +
                "parcelas=" + parcelas + ']';
    }
}

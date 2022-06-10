package com.vitu.domain;

import io.micronaut.serde.annotation.Serdeable;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

@Serdeable
public class Parcela {

    private BigDecimal valor;
    private LocalDateTime dataVencimento;

    public Parcela() {
    }

    public Parcela(BigDecimal valor, LocalDateTime dataVencimento) {
        this.valor = valor;
        this.dataVencimento = dataVencimento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDateTime dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parcela parcela = (Parcela) o;
        return Objects.equals(valor, parcela.valor) && Objects.equals(dataVencimento, parcela.dataVencimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor, dataVencimento);
    }

    @Override
    public String toString() {
        return "Parcela{" +
                "valor=" + valor +
                ", dataVencimento=" + dataVencimento +
                '}';
    }
}

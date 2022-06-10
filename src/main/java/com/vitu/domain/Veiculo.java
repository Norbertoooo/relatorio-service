package com.vitu.domain;

import io.micronaut.serde.annotation.Serdeable;

import java.util.Objects;

@Serdeable
public class Veiculo {

    private Long id;
    private String marca;
    private String placa;
    private String modelo;

    public Veiculo() {
    }

    public Veiculo(Long id, String marca, String placa, String modelo) {
        this.id = id;
        this.marca = marca;
        this.placa = placa;
        this.modelo = modelo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Objects.equals(id, veiculo.id) && Objects.equals(marca, veiculo.marca) && Objects.equals(placa, veiculo.placa) && Objects.equals(modelo, veiculo.modelo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, marca, placa, modelo);
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}

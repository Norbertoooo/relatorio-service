package com.vitu.model;


import java.math.BigDecimal;
import java.util.List;

public record Venda(String cliente, Veiculo veiculo, BigDecimal valor, List<Parcela> parcelas) {
}

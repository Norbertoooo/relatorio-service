package com.vitu.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record Parcela(BigDecimal valor, LocalDateTime dataVencimento) {
}

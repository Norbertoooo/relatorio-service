package com.vitu.consumer;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.vitu.model.Venda;
import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaListener(offsetReset = OffsetReset.EARLIEST)
public class VendaConsumer {

    private final ObjectMapper objectMapper;

    public VendaConsumer(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    @Topic("vendas")
    public void consumirVenda(@KafkaKey String id, String vendaJson) throws JsonProcessingException {
        Venda venda = objectMapper.readValue(vendaJson, Venda.class);
        System.out.println(venda);
    }
}

package com.vitu.service;

import com.vitu.domain.Venda;
import com.vitu.repository.VendaRepository;
import jakarta.inject.Singleton;

@Singleton
public class VendaServiceImpl {

    private final VendaRepository vendaRepository;

    public VendaServiceImpl(VendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    public Venda salvar(Venda venda) {
        return vendaRepository.save(venda);
    }

}

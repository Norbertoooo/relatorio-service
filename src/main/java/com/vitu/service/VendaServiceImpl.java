package com.vitu.service;

import com.vitu.domain.Venda;
import com.vitu.repository.VendaRepository;
import jakarta.inject.Singleton;

import java.util.ArrayList;
import java.util.List;

@Singleton
public class VendaServiceImpl {

    private final VendaRepository vendaRepository;

    public VendaServiceImpl(VendaRepository vendaRepository) {
        this.vendaRepository = vendaRepository;
    }

    public Venda salvar(Venda venda) {
        return vendaRepository.save(venda);
    }

    public List<Venda> listar() {
        Iterable<Venda> vendaIterable = vendaRepository.findAll();
        List<Venda> vendas = new ArrayList<>();
        vendaIterable.forEach(vendas::add);
        return vendas;
    }

}

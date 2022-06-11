package com.vitu.controller;

import com.vitu.domain.Venda;
import com.vitu.service.VendaServiceImpl;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller("/vendas")
public class VendaController {

    private final VendaServiceImpl vendaService;

    public VendaController(VendaServiceImpl vendaService) {
        this.vendaService = vendaService;
    }

    @Get
    public HttpResponse<List<Venda>> listar() {
        return HttpResponse.ok(vendaService.listar());
    }
}

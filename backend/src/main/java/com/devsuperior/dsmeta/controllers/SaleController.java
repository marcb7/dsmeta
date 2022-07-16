package com.devsuperior.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Sale;
import com.devsuperior.dsmeta.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	// @Autowired está injetando aqui uma intância do SaleService.
	@Autowired
	private SaleService service;

	// O método findSales() vai disponibilizar as vendas para o frontend.
	// @GetMapping configura este método para ele responder via web usando o protocolo http.
	@GetMapping
	public List<Sale> findSales() {
		return service.findSales();
	}
}

package me.gabreuw.dsvendas.controllers;

import me.gabreuw.dsvendas.dto.SaleDTO;
import me.gabreuw.dsvendas.dto.SaleSuccessDTO;
import me.gabreuw.dsvendas.dto.SaleSumDTO;
import me.gabreuw.dsvendas.services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable) {
        return ResponseEntity
                .ok()
                .body(service.findAll(pageable));
    }

    @GetMapping(path = "/amount-by-seller")
    public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller() {
        return ResponseEntity
                .ok()
                .body(service.amountGroupedBySeller());
    }

    @GetMapping(path = "/success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller() {
        return ResponseEntity
                .ok()
                .body(service.successGroupedBySeller());
    }

}

package me.gabreuw.dsvendas.services;

import me.gabreuw.dsvendas.dto.SaleDTO;
import me.gabreuw.dsvendas.dto.SaleSuccessDTO;
import me.gabreuw.dsvendas.dto.SaleSumDTO;
import me.gabreuw.dsvendas.repositories.SaleRepository;
import me.gabreuw.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;
    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        // Armazenar os vendedores na memória (CACHE)
        sellerRepository.findAll();

        return saleRepository.findAll(pageable)
                .map(SaleDTO::new);
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller() {
        return saleRepository.amountGroupedBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller() {
        return saleRepository.successGroupedBySeller();
    }

}
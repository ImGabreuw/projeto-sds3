package me.gabreuw.dsvendas.repositories;

import me.gabreuw.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {}
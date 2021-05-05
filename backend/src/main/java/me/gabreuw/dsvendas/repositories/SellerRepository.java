package me.gabreuw.dsvendas.repositories;

import me.gabreuw.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller, Long> {}
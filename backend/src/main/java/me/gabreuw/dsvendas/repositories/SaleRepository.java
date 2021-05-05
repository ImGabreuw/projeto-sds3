package me.gabreuw.dsvendas.repositories;

import me.gabreuw.dsvendas.dto.SaleSuccessDTO;
import me.gabreuw.dsvendas.dto.SaleSumDTO;
import me.gabreuw.dsvendas.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query(
            "SELECT new me.gabreuw.dsvendas.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) " +
                    "FROM Sale AS obj " +
                    "GROUP BY obj.seller"
    )
    List<SaleSumDTO> amountGroupedBySeller();

    @Query(
            "SELECT new me.gabreuw.dsvendas.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) " +
                    "FROM Sale AS obj " +
                    "GROUP BY obj.seller"
    )
    List<SaleSuccessDTO> successGroupedBySeller();

}
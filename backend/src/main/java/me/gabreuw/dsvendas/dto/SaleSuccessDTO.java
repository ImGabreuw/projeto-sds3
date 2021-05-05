package me.gabreuw.dsvendas.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import me.gabreuw.dsvendas.entities.Seller;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class SaleSuccessDTO implements Serializable {

    private String sellerName;
    private Long visited;
    private Long deals;

    public SaleSuccessDTO(Seller seller, Long visited, Long deals) {
        this.sellerName = seller.getName();
        this.visited = visited;
        this.deals = deals;
    }

}

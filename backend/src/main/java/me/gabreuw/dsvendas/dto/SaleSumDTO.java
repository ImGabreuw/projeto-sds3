package me.gabreuw.dsvendas.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import me.gabreuw.dsvendas.entities.Seller;

import java.io.Serializable;

@NoArgsConstructor
@Data
public class SaleSumDTO implements Serializable {

    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }

}

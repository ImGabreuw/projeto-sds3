package me.gabreuw.dsvendas.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.gabreuw.dsvendas.entities.Seller;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SellerDTO implements Serializable {

    private Long id;
    private String name;

    public SellerDTO(Seller entity) {
        id = entity.getId();
        name = entity.getName();
    }
}

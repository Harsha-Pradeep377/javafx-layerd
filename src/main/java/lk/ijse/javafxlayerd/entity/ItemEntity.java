package lk.ijse.javafxlayerd.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemEntity {
    private String itemCode;
    private String description;
    private Double unitPrice;
    private Integer qtyOnHand;
}

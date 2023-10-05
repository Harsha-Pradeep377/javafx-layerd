package lk.ijse.javafxlayerd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ItemDto {
    private String itemCode;
    private String description;
    private Double unitPrice;
    private Integer qtyOnHand;
}

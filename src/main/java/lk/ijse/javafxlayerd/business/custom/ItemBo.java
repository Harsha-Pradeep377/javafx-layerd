package lk.ijse.javafxlayerd.business.custom;

import lk.ijse.javafxlayerd.dto.ItemDto;

import java.sql.SQLException;

public interface ItemBo{
    boolean saveItem(ItemDto itemDto) throws Exception;
}

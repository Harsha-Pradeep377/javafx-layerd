package lk.ijse.javafxlayerd.business.custom.impl;

import lk.ijse.javafxlayerd.business.custom.ItemBo;
import lk.ijse.javafxlayerd.dao.DaoFactory;
import lk.ijse.javafxlayerd.dao.DaoType;
import lk.ijse.javafxlayerd.dao.custom.ItemDao;
import lk.ijse.javafxlayerd.dao.custom.impl.ItemDaoImpl;
import lk.ijse.javafxlayerd.dto.ItemDto;
import lk.ijse.javafxlayerd.entity.ItemEntity;

import java.sql.SQLException;

public class ItemBoImpl implements ItemBo {
    private ItemDao itemDao = DaoFactory.getDao(DaoType.ITEM);

    @Override
    public boolean saveItem(ItemDto dto) throws Exception {
        var itemEntity = new ItemEntity(dto.getItemCode(), dto.getDescription(), dto.getUnitPrice(), dto.getQtyOnHand());

        boolean result = itemDao.save(itemEntity);

        return result;
    }
}

package lk.ijse.javafxlayerd.dao;

import lk.ijse.javafxlayerd.business.custom.BoType;
import lk.ijse.javafxlayerd.business.custom.impl.ItemBoImpl;
import lk.ijse.javafxlayerd.dao.custom.impl.ItemDaoImpl;

public class DaoFactory {
    public static <T> T getDao(DaoType type){
        switch (type){
            case ITEM:
                return (T) new ItemDaoImpl();
            default:
                return null;
        }
    }

}

package lk.ijse.javafxlayerd.business.custom;

import lk.ijse.javafxlayerd.business.custom.impl.ItemBoImpl;

public class BoFactory {
    public static <T> T getBo(BoType type){
        switch (type){
            case ITEM:
                return (T) new ItemBoImpl();
            default:
                return null;
        }
    }
}

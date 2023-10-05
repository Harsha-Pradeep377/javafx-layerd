package lk.ijse.javafxlayerd.dao.custom.impl;

import lk.ijse.javafxlayerd.dao.custom.ItemDao;
import lk.ijse.javafxlayerd.db.DBConnection;
import lk.ijse.javafxlayerd.entity.ItemEntity;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class ItemDaoImpl implements ItemDao {
    @Override
    public boolean save(ItemEntity entity) throws SQLException {
        Connection connection = DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO item VALUES(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,entity.getItemCode());
        preparedStatement.setString(2,entity.getDescription());
        preparedStatement.setDouble(3,entity.getUnitPrice());
        preparedStatement.setInt(4,entity.getQtyOnHand());

        return preparedStatement.executeUpdate()>0;
    }

    @Override
    public boolean update(ItemEntity entity) throws Exception {
        return false;
    }

    @Override
    public ItemEntity search(String s) throws Exception {
        return null;
    }

    @Override
    public boolean delete(String s) throws Exception {
        return false;
    }

    @Override
    public List<ItemEntity> getAll() throws Exception {
        return null;
    }

}

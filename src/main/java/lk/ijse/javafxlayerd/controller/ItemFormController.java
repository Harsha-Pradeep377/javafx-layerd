package lk.ijse.javafxlayerd.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import lk.ijse.javafxlayerd.business.custom.impl.ItemBoImpl;
import lk.ijse.javafxlayerd.dto.ItemDto;

import java.io.IOException;
import java.sql.SQLException;

public class ItemFormController {
    public AnchorPane itemNode;
    @FXML
    private TextField txtDescription;

    @FXML
    private TextField txtItemCode;

    @FXML
    private TextField txtUnitPrice;
    @FXML
    private TextField txtQty;
    public ComboBox cmbSupId;
    public TextField txtSupName;
    public TextField txtSupShop;
    public TextField txtSupTel;
    @FXML
    private TableColumn<?, ?> colDescription;

    @FXML
    private TableColumn<?, ?> colItemCode;

    @FXML
    private TableColumn<?, ?> colUnitPrice;

    @FXML
    private TableColumn<?, ?> colQtyOnHand;
    @FXML
    private TableView<?> itemTable;

    public void initialize() throws SQLException {
        System.out.println("Item form just loaded");


    }
    @FXML
    void btnSaveOnAction(ActionEvent event) {
        String itemCode = txtItemCode.getText();
        String descrition = txtDescription.getText();
        Double unitPrice = Double.parseDouble(txtUnitPrice.getText());
        Integer qtyOnHand = Integer.parseInt(txtQty.getText());

        var itemDto = new ItemDto(itemCode,descrition,unitPrice,qtyOnHand);
        ItemBoImpl itemBoImpl = new ItemBoImpl();
        boolean isSaved = itemBoImpl.saveItem(itemDto);

    }

    public void btnDachboardOnAction(ActionEvent actionEvent) throws IOException {

    }

    public void btnClearOnAction(ActionEvent actionEvent) {


    }
    public void txtItemCodeOnAction(ActionEvent actionEvent) {

    }


    public void btnUpdateOnAction(ActionEvent actionEvent) {

    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {

    }
    public void cmbOnAction(ActionEvent actionEvent) {

    }

}

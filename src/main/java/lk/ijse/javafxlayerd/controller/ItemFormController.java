package lk.ijse.javafxlayerd.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lk.ijse.javafxlayerd.business.ItemBo;
import lk.ijse.javafxlayerd.dto.ItemDto;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
        boolean isSaved = ItemBo.saveItem(itemDto);

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

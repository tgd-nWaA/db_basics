package vdb.dev.Controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DialogEvent;
import javafx.scene.control.TextField;

public class AddCatalogController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField catalogNameField;

    @FXML
    private Button createCatalog;

    @FXML
    void initialize() {

    }

    //todo create method for creating new catalog

    public void createNewCatalog(DialogEvent event){
        String newCatalogName = catalogNameField.getText();


    }

}

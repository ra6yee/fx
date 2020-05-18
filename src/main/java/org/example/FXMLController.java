package org.example;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FXMLController implements Initializable {

//    @FXML
//    private TableColumn tblName;
//    @FXML
//    private TableColumn tblnum;
    @FXML
    private Label lblquantiti;
//    @FXML
//    private TableView tablecontent;
    @FXML
    private Button btnfind;
    @FXML
    private TextField fieldfind;
    @FXML
    private Button btndel;
    @FXML
    private Button btnchange;
    @FXML
    private Button btnadd;
    @FXML
    private Label label;
    @FXML
    private TableColumn<Person,String> tblName;
    private TableColumn<Person,String> tblNum;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    public void add_Conts(ActionEvent actionEvent) {
        // создаем новый стейдж
        Stage stage=new Stage();
        //Загружаем родительские контейнеры типа того, вернее загружаем окно
        //из файла fxsml
        try {
            Parent root= FXMLLoader.load(getClass().getResource("/fxml/add_contact.fxml"));
        // next describe our new window
            stage.setTitle("Добавление контакта");
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            // делаем это окно модальным
            stage.initModality(Modality.WINDOW_MODAL);
            //получаем родительское окно, относительно которого и будет модальность
stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void change_cont(ActionEvent actionEvent) {
        // создаем новый стейдж
        Stage stage=new Stage();
        //Загружаем родительские контейнеры типа того, вернее загружаем окно
        //из файла fxsml
        try {
            Parent root= FXMLLoader.load(getClass().getResource("/fxml/add_contact.fxml"));
            // next describe our new window
            stage.setTitle("Изменить  контакт");
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            // делаем это окно модальным
            stage.initModality(Modality.WINDOW_MODAL);
            //получаем родительское окно, относительно которого и будет модальность
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void del_cont(ActionEvent actionEvent) {
        // создаем новый стейдж
        Stage stage=new Stage();
        //Загружаем родительские контейнеры типа того, вернее загружаем окно
        //из файла fxsml
        try {
            Parent root= FXMLLoader.load(getClass().getResource("/fxml/add_contact.fxml"));
            // next describe our new window
            stage.setTitle("Удалить контакт");
            stage.setResizable(false);
            stage.setScene(new Scene(root));
            // делаем это окно модальным
            stage.initModality(Modality.WINDOW_MODAL);
            //получаем родительское окно, относительно которого и будет модальность
            stage.initOwner(((Node)actionEvent.getSource()).getScene().getWindow());
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void find_cont(ActionEvent actionEvent) {
    }
}

package org.example;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/fxml/Scene.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add("/styles/Styles.css");
stage.setMinHeight(550);
stage.setMinWidth(450);
        stage.setTitle("телефонный справочник");
        stage.setScene(scene);
       stage.setResizable(false);//запрет на изменение размеров окна
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
storeOfContacts storeOfContacts = new storeOfContacts();
Person Ivan=new Person("89529804680","Ivan");
Person Oleg=new Person("89034497707","Oleg");
Person Alexander=new Person("89225234531","Alexander");
storeOfContacts.add(Ivan);
storeOfContacts.add(Oleg);
storeOfContacts.add(Alexander);

         //   storeOfContacts.print();


        launch(args);
    }



    
}

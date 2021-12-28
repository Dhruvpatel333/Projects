/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextfinal;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author dhruv
 */
public class NameFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    public void changeSceneButtonEntered(ActionEvent event) throws IOException{
        Parent nameSceneParent = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Scene nameScene = new Scene(nameSceneParent);   
        
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        window.setScene(nameScene);
        window.show();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

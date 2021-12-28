/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nextfinal;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author dhruv
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Label label;
    @FXML private Button choice1;
    @FXML private Button choice2;
    @FXML private Button choice3;
    @FXML private Button choice4;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    @FXML 
    public void answerSelected(ActionEvent event) throws IOException{ // Method for selecting a choice
        
        int i = 0;
        
        
        try {
            FileReader readFile = new FileReader("C:\\input.txt");
            BufferedReader br = new BufferedReader(readFile);
            int numberLines = 0;
            String line = "";
            
            while((line = br.readLine()) != null ){
                numberLines ++;
            }
            System.out.println(line);
            br.readLine();
            
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        
    }
    //Method for the First Scene
    @FXML
    public void changeSceneButtonEntered(ActionEvent event) throws IOException{
        Parent nameSceneParent = FXMLLoader.load(getClass().getResource("NameFXML.fxml"));
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

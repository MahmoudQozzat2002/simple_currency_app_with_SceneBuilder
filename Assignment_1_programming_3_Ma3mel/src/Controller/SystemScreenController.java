/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.RunStage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jit
 */
public class SystemScreenController implements Initializable {

    @FXML
    private Button logOutbtn;
    @FXML
    private TextField usdtxt;
    @FXML
    private TextField nistxt;
    @FXML
    private Button convertbtn;
    @FXML
    private Label massage;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void logOutbtnAction(ActionEvent event) throws IOException {
        RunStage.getInstance().loginStage();
    }

    @FXML
    private void convertbtnAction(ActionEvent event) {
        if(!usdtxt.getText().isEmpty()&& nistxt.getText().isEmpty()){
        double r = Double.parseDouble( usdtxt.getText());
        r = r * 3.65;
        nistxt.setText(r+"");    
        }else if(usdtxt.getText().isEmpty()&& !nistxt.getText().isEmpty()){
            double r = Double.parseDouble( nistxt.getText());
        r = r * 0.274;
        usdtxt.setText(r+"");
        }else{
            massage.setText("Erorr : PLZ select one box ...");
        }
        
    }
    
}

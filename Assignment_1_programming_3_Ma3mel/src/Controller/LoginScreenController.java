/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Modal.User;
import View.RunStage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author jit
 */
public class LoginScreenController implements Initializable {

    @FXML
    private Label userNameTxt;
    @FXML
    private TextField userNameBtn;
    @FXML
    private Label passwordTxt;
    @FXML
    private PasswordField passwordtxt;
    @FXML
    private Button loginbtn;
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
    private void loginbtnAction(ActionEvent event) throws IOException {
        User s = new User("Admin","admin");
        if(userNameBtn.getText().equals(s.getUserName())&& passwordtxt.getText().equals(s.getPassword())){
          RunStage.getInstance().SystemStage();
        }else if(userNameBtn.getText().isEmpty()&& passwordtxt.getText().isEmpty()){
            massage.setText("PLZ enter data **");
        }else {
            
            massage.setText("Erorr in userName or Password");
        }
    }
    
}

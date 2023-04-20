
package View;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class RunStage {
  private static RunStage instance;
  private Stage s = new Stage();

    
    private RunStage() {
       
    }

    public static synchronized RunStage getInstance(){
        if(instance == null){
            instance = new RunStage();
        }
        return instance;
    }
    
    public void loginStage() throws IOException{
        FXMLLoader l= new FXMLLoader(getClass().getResource("LoginScreen.fxml"));
        Parent p = l.load();
        Scene ss = new Scene(p);
        s.setScene(ss);
        s.setTitle("Login");
        s.show();
    }
    public void SystemStage() throws IOException{
        FXMLLoader l= new FXMLLoader(getClass().getResource("SystemScreen.fxml"));
        Parent p = l.load();
        Scene ss = new Scene(p);
        s.setScene(ss);
        s.setTitle("System");
        s.show();
    }
    

    
    
   
    
    
}


package amediaplayer;

import java.awt.Image;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author nessa
 */
public class AMediaPlayer extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        stage.setTitle("Nessa's Media");
        scene.setOnMouseClicked(new EventHandler<MouseEvent>(){
        @Override
                public void handle(MouseEvent doubleClicked) {
                 if(doubleClicked.getClickCount()== 2){
                     stage.setFullScreen(true);
                 }   
                }
        });
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}

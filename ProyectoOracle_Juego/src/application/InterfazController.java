/**
 * Sample Skeleton for 'interfaz.fxml' Controller Class
 */
package application;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class InterfazController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="rectangulo"
    private Rectangle rectangulo; // Value injected by FXMLLoader

    @FXML // fx:id="boton"
    private Button boton; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert rectangulo != null : "fx:id=\"rectangulo\" was not injected: check your FXML file 'interfaz.fxml'.";
        assert boton != null : "fx:id=\"boton\" was not injected: check your FXML file 'interfaz.fxml'.";
        rectangulo.setFill(Color.rgb(67, 110, 98));
        rectangulo.setStrokeWidth(20);
        rectangulo.setStroke(Color.ORANGERED);

    }
}

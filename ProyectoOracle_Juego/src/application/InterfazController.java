/**
 * Sample Skeleton for 'interfaz.fxml' Controller Class
 */

package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.image.Image;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class InterfazController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="boton"
    private Button boton; // Value injected by FXMLLoader

    @FXML // fx:id="cuadroImagen"
    private ImageView cuadroImagen; // Value injected by FXMLLoader



    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert boton != null : "fx:id=\"boton\" was not injected: check your FXML file 'interfaz.fxml'.";
        assert cuadroImagen != null : "fx:id=\"cuadroImagen\" was not injected: check your FXML file 'interfaz.fxml'.";
    }

    private Dado dado = new Dado();
    private int contadorLetras = 0;
    @FXML
    void cambiarLetra(ActionEvent event) {
    	if (contadorLetras < dado.getCantidadLetras()) {
			String letra = String.format("/res/%c.png", dado.siguienteLetra());
			Image imagen1 = new Image(letra);
			cuadroImagen.setImage(imagen1);
			contadorLetras++;
		} else {
			Alert errorAlert = new Alert(AlertType.WARNING);
			errorAlert.setHeaderText("Fin del juego");
			errorAlert.setContentText("Ya se han jugado todas las letras, pero puedes jugar una nueva partida.");
			errorAlert.showAndWait();
		}
    }

}


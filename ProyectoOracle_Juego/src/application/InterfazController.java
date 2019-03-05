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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;

public class InterfazController {

	//Objetos y variables para usar en todo el programa
    private Dado dado = new Dado();
    Tableros tableros = new Tableros();
    private int contadorLetras = 0;
    
    @FXML
    private ResourceBundle resources;

    @FXML 
    private URL location;

    @FXML
    private Button cambiarLetra;
    
    @FXML
    private TextArea jugadaPC;
    
    @FXML 
    private ImageView cuadroImagen;

    @FXML
    private ComboBox<String> tablero;


    @FXML 
    void initialize() {
    	assert cambiarLetra != null : "fx:id=\"cambiarLetra\" was not injected: check your FXML file 'interfaz.fxml'.";
        assert cuadroImagen != null : "fx:id=\"cuadroImagen\" was not injected: check your FXML file 'interfaz.fxml'.";
        assert tablero != null : "fx:id=\"tablero\" was not injected: check your FXML file 'interfaz.fxml'.";
        assert jugadaPC != null : "fx:id=\"jugadaPC\" was not injected: check your FXML file 'interfaz.fxml'.";
        
        //Selección de tablero. Se cargan las opciones en el combobox  
        tablero.getItems().addAll(tableros.cargarTablerosDisponibles());
    }
    
    
    
    @FXML
    void cambiarLetra(ActionEvent event) {
    	//Si quedan letras se carga una nueva
    	if (contadorLetras < dado.getCantidadLetras()) {
			String letra = String.format("/res/%c.png", dado.siguienteLetra());
			Image imagen1 = new Image(letra);
			cuadroImagen.setImage(imagen1);
			contadorLetras++;
		} else {
			//Mensaje de que ya se han acabado las letras.
			Alert errorAlert = new Alert(AlertType.WARNING);
			errorAlert.setHeaderText("Fin del juego");
			errorAlert.setContentText("Ya se han jugado todas las letras, pero puedes jugar una nueva partida.");
			errorAlert.showAndWait();
		}
    }
    
    @FXML
    void cargarTablero(ActionEvent event) {
    	//Carga el tablero seleccionado desde el combobox en el area de juego
    	int seleccion = tablero.getSelectionModel().getSelectedIndex();
    	Tableros tableros = new Tableros();
    	tableros.cargarTablero(seleccion, jugadaPC);
    	
    }


}


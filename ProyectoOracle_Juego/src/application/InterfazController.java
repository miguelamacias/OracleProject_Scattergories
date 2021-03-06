package application;

import java.io.IOException;
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
import javafx.stage.Stage;

public class InterfazController {

	//Objetos y variables para usar en todo el programa
    private Dado dado;
    private Tablero tableros;
    
    @FXML
    private ResourceBundle resources;
    
    @FXML
    private Button reiniciar;
    
    @FXML
    private Button jugarPC;
    
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
    void initialize() throws IOException {
    	assert cambiarLetra != null : "fx:id=\"cambiarLetra\" was not injected: check your FXML file 'interfaz.fxml'.";
        assert cuadroImagen != null : "fx:id=\"cuadroImagen\" was not injected: check your FXML file 'interfaz.fxml'.";
        assert tablero != null : "fx:id=\"tablero\" was not injected: check your FXML file 'interfaz.fxml'.";
        assert jugadaPC != null : "fx:id=\"jugadaPC\" was not injected: check your FXML file 'interfaz.fxml'.";
        
        //Inicialización de objetos
        dado = new Dado();
        tableros = new Tablero();
        
        //Selección de tablero. Se cargan las opciones en el combobox        
        tablero.getItems().addAll(tableros.getTablerosDisponibles());
        
        //Mensaje de bienvenida
        jugadaPC.setText("Bienvenidos!\n");
    }    
    
    @FXML
    void cambiarLetra(ActionEvent event) {
    	//Si quedan letras se carga una nueva
    	if (dado.getCantidadLetrasJugadas() < dado.getCantidadLetrasTotal()) {
    		//Obtiene una letra y carga la imagen correspondiente
			String letraImagen = String.format("/res/%c.png", dado.siguienteLetra());
			Image imagen1 = new Image(letraImagen);
			cuadroImagen.setImage(imagen1);
			
			//Borrar el texto de la solución dejando el encabezado
			String textoContenido = jugadaPC.getText();
			textoContenido = textoContenido.substring(0, textoContenido.indexOf("\n"));
			jugadaPC.setText(textoContenido + "\n");
			
			//Enciende el botón de resolver
			jugarPC.setDisable(false);
			
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
    	//Tablero tableros = new Tablero();
    	tableros.cargarTablero(seleccion, jugadaPC);    	
    }
    
    @FXML
    void jugadaPC(ActionEvent event) {
    	int tableroSeleccionado = tablero.getSelectionModel().getSelectedIndex();
    	int letra = dado.getLetraInt();
    	tableros.SolucionarTableros(jugadaPC, tableroSeleccionado, letra);
    }
    
    @FXML
    void mostrarReglas() {
    	Alert normas = new Alert(AlertType.INFORMATION);
    	normas.setTitle("Información sobre el juego");
    	Stage stage = (Stage) normas.getDialogPane().getScene().getWindow();
    	stage.getIcons().add(new Image("/res/ABC.png"));
		normas.setHeaderText("Reglas");
		normas.setContentText("Primero escoge un tablero y lanza el dado. El juego es para jugarlo con más amigos. Tenéis que buscar palabras"
				+ "que encajen con lo que se pide. Al final todos las poneis en comun y os apuntáis 5 puntos si la palabra la teneis repetida"
				+ "y 10 si no. La máquina también juega, por lo que hay que pulsar en mostrar soluciones para poder tener sus palabras en cuenta"
				+ "a la hora de ver si están repetidas o no. Basado en el típio juego 'Alto el lápiz' o 'STOP' jugado en todos los colegios.");
		normas.showAndWait();
    }
    
    @FXML
    void reiniciarJuego(ActionEvent event) {
    	dado.restablecerLetrasUsadas();
    	Image imagenInicio = new Image("/res/Abecedario.png");
    	cuadroImagen.setImage(imagenInicio);
    	
    	//Borrar el texto de la solución dejando el encabezado
		String textoContenido = jugadaPC.getText();
		textoContenido = textoContenido.substring(0, textoContenido.indexOf("\n"));
		jugadaPC.setText(textoContenido + "\n");
    }
}
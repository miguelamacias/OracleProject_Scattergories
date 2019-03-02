package application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TextArea;

public class Tableros {
	//tableros
	private String clasico = "Clásico: Nombre, Apellido, Ciudad, Animal, Objeto, Famoso, Comida";
    private String naturaleza = "Naturaleza: Mamífero, Ave, Reptil, Planta, Anfibio, Invertebrado, Órgano animal";
    private String prueba = "Scattergories uno: Animal de compañia, etc, cosas frias, etx, muchas cosas";
    
    //Escribe el tablero en el areatext
    public void getTablero(int tablero, TextArea jugadaPC) {
    	switch (tablero) {
		case 0:
			jugadaPC.setText("Nombre\t\t Apellido\t\t Ciudad\t\t Animal\t\t Objeto\t\t Famoso\t\t Comida");
			break;
		case 1:
			jugadaPC.setText("Mamífero\t\t Ave\t\t Reptil\t\t Planta\t\t Anfibio\t\t Invertebrado\t\t Órgano animal");
			break;
		default:
			break;
		}
    }
    
    //Debería cargar los tableros disponibles en el combobox
    public String[] cargarTablerosDisponibles() {
    	
    	String opciones[] = {
    			"Clásico: Nombre, Apellido, Ciudad, Animal, Objeto, Famoso, Comida",
    	        "Naturaleza: Mamífero, Ave, Reptil, Planta, Anfibio, Invertebrado, Órgano animal",
    	        prueba,
    	        "Tus muertos"
    	};
    	
    	return opciones;
    }
}

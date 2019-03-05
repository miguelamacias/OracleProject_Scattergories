package application;

import javafx.scene.control.TextArea;

public class Tableros {
	//Variables para los tableros
	private String clasico, naturaleza, scattergories1;
	private String clasicoCargar, naturalezaCargar, scattergories1Cargar;
    
	//Constructor que inicializa las variables con los tableros disponibles
    public Tableros() {
    	clasico = "Clásico: Nombre, Apellido, Ciudad, Animal, Objeto, Famoso, Comida";
    	naturaleza = "Naturaleza: Mamífero, Ave, Reptil, Planta, Anfibio, Invertebrado, Órgano animal";
    	scattergories1= "Scattergories uno: Animal de compañia, etc, cosas frias, etx, muchas cosas";
    	
    	clasicoCargar = "Nombre\t\t Apellido\t\t Ciudad\t\t Animal\t\t Objeto\t\t Famoso\t\t Comida";
    	naturalezaCargar = "Mamífero\t\t Ave\t\t Reptil\t\t Planta\t\t Anfibio\t\t Invertebrado\t\t Órgano animal";
    	scattergories1Cargar = "Aun por determinar";
    	
    }
    
    //Escribe el tablero en la zona de juego
    public void cargarTablero(int tablero, TextArea jugadaPC) {
    	switch (tablero) {
		case 0:
			jugadaPC.setText(clasicoCargar);
			break;
		case 1:
			jugadaPC.setText(naturalezaCargar);
			break;
		case 2:
			jugadaPC.setText(scattergories1Cargar);
			break;
		default:
			break;
		}
    }
    
    //Carga los tableros disponibles en el combobox
    public String[] cargarTablerosDisponibles() {
    	
    	String opciones[] = {clasico, naturaleza, scattergories1};
    	
    	return opciones;
    }
}

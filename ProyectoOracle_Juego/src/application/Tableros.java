package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javafx.scene.control.TextArea;

public class Tableros {
	//Variables para los tableros
	private String clasico, naturaleza, scattergories1;
	private String cabeceraClasico, CabeceraNaturaleza, CabeceraScattergories1;
	private String[] soluciones1 = new String[27];
	FileReader fr;
	BufferedReader leer;
	File soluciones;
	
	//Constructor que inicializa las variables con los tableros disponibles
    public Tableros() throws IOException {
    	clasico = "Clásico: Nombre, Apellido, Ciudad, Animal, Objeto, Famoso, Comida";
    	naturaleza = "Naturaleza: Mamífero, Ave, Reptil, Planta, Anfibio, Invertebrado, Órgano animal";
    	scattergories1= "Scattergories uno: Animal de compañia, etc, cosas frias, etx, muchas cosas";
    	
    	CabeceraNaturaleza = "Mamífero\t\t\t Ave\t\t\t Reptil\t\t\t Planta\t\t\t Anfibio\t\t\t Invertebrado\t\t\t Órgano animal\n";
    	CabeceraScattergories1 = "Aun por determinar\n";
    	
    	//Cargar las soluciones desde el archivo txt
    	soluciones = new File("src/res/soluciones1.txt");    	
		
		fr = new FileReader(soluciones);
		leer = new BufferedReader(fr);
		
		//cargar cabeceras
		cabeceraClasico = leer.readLine();
		
		for (int i = 0; i < soluciones1.length; i++) { 
			soluciones1[i] = leer.readLine();
		}
    	
    }
    
    //Escribe el tablero en la zona de juego
    public void cargarTablero(int tablero, TextArea jugadaPC) {
    	switch (tablero) {
		case 0:
			jugadaPC.setText(cabeceraClasico);
			jugadaPC.appendText("\n");
			break;
		case 1:
			jugadaPC.setText(CabeceraNaturaleza);
			break;
		case 2:
			jugadaPC.setText(CabeceraScattergories1);
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
    
    //Solucciona el tablero
    public void SolucionarTableros(TextArea jugadaPC, int tablero, int letra) {
    	switch (tablero) {
		case 0:
			jugadaPC.setText(cabeceraClasico);
			jugadaPC.appendText("\n");
	    	jugadaPC.appendText(String.format(soluciones1[letra]));
			break;
		case 1:
			jugadaPC.setText("Solución aun no implementada\n");
			break;
		case 2:
			jugadaPC.setText("Solución aun no implementada\n");
			break;
		default:
			break;
		}
    }
}

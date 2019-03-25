package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javafx.scene.control.TextArea;

public class Tableros {
	//Variables para los tableros
	private String clasico, naturaleza, scattergories1;
	private String cabeceraClasico, cabeceraNaturaleza, cabeceraScattergories1;
	private String[] solucionesClasico = new String[27];
	private String[] solucionesNaturaleza = new String[27];
	private String[] solucionesScattergories1 = new String[27];
	FileReader fr;
	BufferedReader leer;
	File soluciones;
	
	//Constructor que inicializa las variables con los tableros disponibles
    public Tableros() throws IOException {
    	clasico = "Clásico: Nombre, Apellido, Ciudad, Animal, Objeto, Famoso, Comida";
    	naturaleza = "Naturaleza: Mamífero, Ave, Reptil, Planta, Anfibio, Invertebrado, Órgano animal";
    	scattergories1= "Scattergories uno: Animal de compañia, etc, cosas frias, etx, muchas cosas";
    	
    	//Objetos necesarios para cargar las soluciones desde el archivo txt
    	soluciones = new File("src/res/soluciones.txt");    	
		
		fr = new FileReader(soluciones);
		leer = new BufferedReader(fr);
		
		//cargar cabeceras
		cabeceraClasico = leer.readLine();
		cabeceraNaturaleza = leer.readLine();
		cabeceraScattergories1 = leer.readLine();
		
		//cargar respuestas
		for (int i = 0; i < solucionesClasico.length; i++) { 
			solucionesClasico[i] = leer.readLine();
		}
		for (int i = 0; i < solucionesNaturaleza.length; i++) {
			solucionesNaturaleza[i] = leer.readLine();
		}
		for (int i = 0; i < solucionesScattergories1.length; i++) {
			solucionesScattergories1[i] = leer.readLine();
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
			jugadaPC.setText(cabeceraNaturaleza);
			jugadaPC.appendText("\n");
			break;
		case 2:
			jugadaPC.setText(cabeceraScattergories1);
			jugadaPC.appendText("\n");
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
	    	jugadaPC.appendText(String.format(solucionesClasico[letra]));
			break;
		case 1:
			jugadaPC.setText(cabeceraNaturaleza);
			jugadaPC.appendText("\n");
	    	jugadaPC.appendText(String.format(solucionesNaturaleza[letra]));
			break;
		case 2:
			jugadaPC.setText(cabeceraScattergories1);
			jugadaPC.appendText("\n");
	    	jugadaPC.appendText(String.format(solucionesScattergories1[letra]));
			break;
		default:
			break;
		}
    }
}

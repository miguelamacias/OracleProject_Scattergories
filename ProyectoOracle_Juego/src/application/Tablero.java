package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javafx.scene.control.TextArea;
/**
 * Clase que simula un tablero del Scattergories o Alto el lápiz.
 * Ofrece métodos y atributos para controlar y cambiar entre los diferentes modelos.
 * @author Miguel Angel Macias
 * @version 1.0
 */
public class Tablero {
	//Variables para los tableros
	private String clasico, naturaleza, scattergories1;
	private String cabeceraClasico, cabeceraNaturaleza, cabeceraScattergories1;
	private String[] solucionesClasico = new String[27];
	private String[] solucionesNaturaleza = new String[27];
	private String[] solucionesScattergories1 = new String[27];
	FileReader fr;
	BufferedReader leer;
	File soluciones;
	
	/**
	 * Constructor sin parametros que inicializa todas las variables de instancia
	 * necesarias para el funcionamiento de la clase. Carga los tableros, los objetos
	 * necesarios para la lectura de datos de los mismos, las cabeceras y las respuestas
	 * de los mismos.
	 */
    public Tablero() throws IOException {
    	clasico = "Clásico: Nombre, Apellido, Ciudad, Animal, Objeto, Famoso, Comida";
    	naturaleza = "Naturaleza: Mamífero, Ave, Reptil, Planta, Anfibio, Invertebrado, Órgano animal";
    	scattergories1= "Scattergories uno: Animal de compañia, etc, cosas frias, etx, muchas cosas";
    	
    	//Objetos necesarios para cargar las soluciones desde el archivo txt
    	soluciones = new File("soluciones.txt");    	
		
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
    
    /**
	 * Método que carga el talero seleccionado en el AreaText deseada.
	 * @param tablero Número del tablero a cargar.
	 * @param TextArea area de texto donde cargar el tablero.
	 */
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
    
    /**
	 * Método que devuelve los tableros disponibles. Son usados
	 * para darle contenido al desplegable que permite seleccionarlos.
	 * @return <code>String[]</code> Array con los tableros disponibles .
	 */
    public String[] getTablerosDisponibles() {
    	
    	String opciones[] = {clasico, naturaleza, scattergories1};
    	
    	return opciones;
    }
    
    /**
	 * Método que muestra las respuestas a un
	 * determinado tablero. Lo hace cargando la solución adecuada en el TextArea
	 * deseado.
	 * @param jugadaPC TextArea donde cargar los resultados.
	 * @param tablero int que indica el tipo de tablero a solucionar.
	 * @param letra int que indica la letra cuya solución se desea mostrar.
	 */
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

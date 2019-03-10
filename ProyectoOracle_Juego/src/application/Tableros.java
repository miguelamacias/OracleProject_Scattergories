package application;

import javafx.scene.control.TextArea;

public class Tableros {
	//Variables para los tableros
	private String clasico, naturaleza, scattergories1;
	private String clasicoCargar, naturalezaCargar, scattergories1Cargar;
	private String[] soluciones = {
			"Andrea\t\t Abascal\t\t Alemania\t\t Alce\t\t Ábaco\t\t Antonio Horozco\t\t Arándano",
			"Benito\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Cristina\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Daniel\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Esteban\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Felipe\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Gabriel\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Helena\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Irene\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Jose\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Katia\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Luis\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Miguel\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Nuria\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Olga\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Pedro\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Queti\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Ramón\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Silvia\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Teresa\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Úrsula\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Virginia\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Wilfredo\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Xavier\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Yahaira\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao",
			"Zahara\t\t Benítez\t\t Barcelona\t\t Burro\t\t Botella\t\t Belén Esteban\t\t Bacalao"		
	};
    
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
    
    //Solucciona el tablero
    public void SolucionarTableros(TextArea jugadaPC, int tablero, int letra) {
    	switch (tablero) {
		case 0:
			SolucionarTablero0(jugadaPC, letra);
			break;
		case 1:
			
			break;
		case 2:
			
			break;
		default:
			break;
		}
    }
    
    private void SolucionarTablero0 (TextArea jugadaPC, int letra) {
    	jugadaPC.appendText("\n");
    	jugadaPC.appendText(soluciones[letra]);
    }
}

package application;

import javafx.scene.control.TextArea;

public class Tableros {
	//Variables para los tableros
	private String clasico, naturaleza, scattergories1;
	private String clasicoCargar, naturalezaCargar, scattergories1Cargar;
	private String[] soluciones1 = {
			"Andrea\t\t\t Abascal\t\t\t Alemania\t\t\t Alce\t\t\t Ábaco\t\t\t Antonio Horozco\t\t\t Arándano",
			"Benito\t\t\t Benítez\t\t\t Barcelona\t\t\t Burro\t\t\t Botella\t\t\t Belén Esteban\t\t\t Bacalao",
			"Cristina\t\t\t Cruz\t\t\t Córdoba\t\t\t Cangrejo\t\t\t Cazo\t\t\t Christiano R.\t\t\t Castaña",
			"Daniel\t\t\t Delgado\t\t\t Dinamarca\t\t\t Delfín\t\t\t Dado\t\t\t Dani Martín\t\t\t Dátil",
			"Esteban\t\t\t Escobar\t\t\t España\t\t\t Elefante\t\t\t Espejo\t\t\t Elton John\t\t\t Espinacas",
			"Felipe\t\t\t Fernández\t\t\t Francia\t\t\t Foca\t\t\t Fuelle\t\t\t Fidel Castro\t\t\t Frambuesa",
			"Gabriel\t\t\t Gutiérrez\t\t\t Granada\t\t\t Gallina\t\t\t Globo\t\t\t George W. Bush\t\t\t Galleta",
			"Helena\t\t\t Hurtado\t\t\t Huelva\t\t\t Hiena\t\t\t Hueso\t\t\t Hugo Chávez\t\t\t Huevo",
			"Irene\t\t\t Iruela\t\t\t Italia\t\t\t Iguana\t\t\t Iglú\t\t\t Isabel II\t\t\t Infusión",
			"Jose\t\t\t Jurado\t\t\t Jaén\t\t\t Jaguar\t\t\t Juego\t\t\t Jorge J. Vázquez\t\t\t Jamón",
			"Katia\t\t\t Kong\t\t\t Kuwait\t\t\t Kiwi\t\t\t Kayak\t\t\t Kim Kardashian\t\t\t Kiwi",
			"Luis\t\t\t Lara\t\t\t Lugo\t\t\t Lemur\t\t\t Lámpara\t\t\t Lola Flores\t\t\t Lechuga",
			"Miguel\t\t\t Martínez\t\t\t Madrid\t\t\t Mapache\t\t\t Mesa\t\t\t Manuel Carrasco\t\t\t Mango",
			"Nuria\t\t\t Navarro\t\t\t Noruega\t\t\t Nutria\t\t\t Navaja\t\t\t Nuria Fergó\t\t\t Naranja",
			"Olga\t\t\t Orozco\t\t\t Oviedo\t\t\t Orangután\t\t\t Oreja\t\t\t Ortega Cano\t\t\t Oliva",
			"Pedro\t\t\t Pacheco\t\t\t Pamplona\t\t\t Perro\t\t\t Plato\t\t\t Paula Vázquez\t\t\t Pastel",
			"Queti\t\t\t Quintana\t\t\t Qatar\t\t\t Quirquincho\t\t\t Quiste\t\t\t Quentin Tarantino\t\t\t Queso",
			"Ramón\t\t\t Romero\t\t\t Roma\t\t\t Ruiseñor\t\t\t Reloj\t\t\t Ricky Martin\t\t\t Rábano",
			"Silvia\t\t\t Salgado\t\t\t Salamanca\t\t\t Saltamontes\t\t\t Sofá\t\t\t Shakira\t\t\t Soja",
			"Teresa\t\t\t Tejero\t\t\t Teruel\t\t\t Tortuga\t\t\t Televisor\t\t\t Tony Blair\t\t\t Tomate",
			"Úrsula\t\t\t Urdangarín\t\t\t Uruguay\t\t\t Urraca\t\t\t Ungüento\t\t\t Ulma Thurman\t\t\t Uva",
			"Virginia\t\t\t Vázquez\t\t\t Venezuela\t\t\t Vaca\t\t\t Vaso\t\t\t Vin Diesel\t\t\t Vinagre",
			"Wilfredo\t\t\t Wagner\t\t\t Wallys Y Futuna\t\t\t Walabí\t\t\t Waffle\t\t\t Woody Allen\t\t\t Wakame",
			"Xavier\t\t\t Xérez\t\t\t Xi'an\t\t\t Xarda\t\t\t Xilófono\t\t\t Xavier Arzalluz\t\t\t Xarda",
			"Yahaira\t\t\t Yagüe\t\t\t Yemen\t\t\t Yak\t\t\t Yo-yo\t\t\t Yasiv Arafat\t\t\t Yogur",
			"Zahara\t\t\t Zorrilla\t\t\t Zaragoza\t\t\t Zorro\t\t\t Zapato\t\t\t Zidane\t\t\t Zanahoria"		
	};
    
	//Constructor que inicializa las variables con los tableros disponibles
    public Tableros() {
    	clasico = "Clásico: Nombre, Apellido, Ciudad, Animal, Objeto, Famoso, Comida";
    	naturaleza = "Naturaleza: Mamífero, Ave, Reptil, Planta, Anfibio, Invertebrado, Órgano animal";
    	scattergories1= "Scattergories uno: Animal de compañia, etc, cosas frias, etx, muchas cosas";
    	
    	clasicoCargar = "Nombre\t\t\t Apellido\t\t\t Ciudad/País\t\t\t Animal\t\t\t Objeto\t\t\t Famoso\t\t\t Comida";
    	naturalezaCargar = "Mamífero\t\t\t Ave\t\t\t Reptil\t\t\t Planta\t\t\t Anfibio\t\t\t Invertebrado\t\t\t Órgano animal";
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
			jugadaPC.setText(clasicoCargar);
			jugadaPC.appendText("\n");
	    	jugadaPC.appendText(soluciones1[letra]);
			break;
		case 1:
			jugadaPC.setText("Solución aun no implementada");
			break;
		case 2:
			jugadaPC.setText("Solución aun no implementada");
			break;
		default:
			break;
		}
    }
}

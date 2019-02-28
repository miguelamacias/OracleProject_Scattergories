package application;

import java.security.SecureRandom;

public class Dado {
	//Variables de instancia
	private SecureRandom dado = new SecureRandom();
	private char[] letras = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
	private boolean[] letrasUsadas = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};


	public char siguienteLetra () {
		int tirada = dado.nextInt(26);
		char resultado = letras[tirada];
		if (!letrasUsadas[tirada]) {
			letrasUsadas[tirada] = true;
			return resultado;
		} else {
			return siguienteLetra();
		}
	}
}

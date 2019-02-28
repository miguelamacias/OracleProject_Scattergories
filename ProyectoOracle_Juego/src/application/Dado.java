package application;

import java.security.SecureRandom;

public class Dado {
	//Variables de instancia
	private SecureRandom dado = new SecureRandom();
	private char[] letras;
	private String alfabeto;
	private boolean[] letrasUsadas;

	public Dado() {
		alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		letras = alfabeto.toCharArray();
		letrasUsadas = new boolean[letras.length];
		restablecerLetrasUsadas();

	}

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

	public void restablecerLetrasUsadas() {
		for (int i = 0; i < letrasUsadas.length; i++) {
			letrasUsadas[i] = false;
		}
	}

	public int getCantidadLetras() {
		return letras.length;
	}
}

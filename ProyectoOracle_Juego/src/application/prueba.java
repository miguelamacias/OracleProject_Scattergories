package application;

public class prueba {
	public static void main(String[] args) {
		Dado dado = new Dado();

		for (int i = 0; i < 26; i++) {
			System.out.printf("%c  ", dado.siguienteLetra());
		}
	}
}

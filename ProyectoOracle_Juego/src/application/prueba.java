package application;

public class prueba {
	public static void main(String[] args) {
		Dado dado = new Dado();

		for (int i = 0; i < 20; i++) {
			System.out.println(dado.siguienteLetra());
		}
	}
}

package application;

import java.io.File;
import java.io.IOException;

public class Prueba {
	public static void main(String[] args) throws IOException {
		//Dado dado = new Dado();

		for (int i = 0; i < 26; i++) {
			File prueba = new File("Aquies.txt");
                        prueba.createNewFile();
		}
	}
}

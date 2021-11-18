package interfaz;

import dominio.*;
import java.io.*;

public class Interfaz {
	public static String AYUDA = "Las operaciones posibles son las siguientes:" + "\n"
			+ "- Añadir contacto: ‘java -jar libreta.jar add <nombre> <teléfono>‘"
			+ "Por ejemplo, java -jar libreta.jar add Pepe 654321234" + "\n"
			+ "- Mostrar contactos: java -jar libreta.jar list" + "\n"
			+ "- Mostrar esta ayuda: java -jar libreta.jar help";
	File lista = new File("Contactos.txt");

	public static void procesarPeticion(String sentencia) {
		String[] args = sentencia.split(" ");

		if (args[0].equals("help") || args[0].equals("ayuda")) {
			System.out.println(AYUDA);
		} else if (args[0].equals("add")) {
			Contacto a = new Contacto(args[1], args[2]);
			Libreta libreta = new Libreta();
			libreta.annadirContacto(a);
		} else if (args[0].equals("list")) {
			Libreta libreta = new Libreta();
			for(int i = 0; i <= libreta.contactos.size(); i++){
				
			}		
		}
	}
}

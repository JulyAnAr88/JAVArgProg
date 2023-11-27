package ACT3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Concatenar {
	
	public static String concatenar(List<String> palabras, int n) {
		
		List<String> filtradas = palabras.stream().filter((palabra)-> palabra.length() > n).collect(Collectors.toList());
						
		Iterator<String> iterador = filtradas.iterator();
		String resultado = iterador.next();
		while(iterador.hasNext()) {
			resultado += ", " + iterador.next();
		}	    
		return resultado;		
	}
	
	
	public static void main(String args[]) {
		List<String> test = new ArrayList<String>();
		int cantCaracteres = 0;

		try (Scanner lectura = new Scanner(System.in)) {
			int i = 0;
			while (i != 2) {

				System.out.println("Seleccione una opción: ");
				System.out.println("1. Ingresar palabra");
				System.out.println("2. Salir");

				i = lectura.nextInt();
				switch (i) {
				case 1:
					
					System.out.println("Cantidad de caracteres a considerar: ");
					cantCaracteres = lectura.nextInt();
					for (int j = 0; j < 4; j++) {
						System.out.println("Ingrese una palabra: ");

						String palabra = lectura.next();
						test.add(palabra);
						
					}
					i=2;
					
					break;
				default:
					break;
				}

			}
		}

		if (test.isEmpty()) {
			System.out.println("Nada que concatenar");
		} else {
			String testConcatenado = concatenar(test, cantCaracteres);
			System.out.println(testConcatenado);			
		}

	}

}

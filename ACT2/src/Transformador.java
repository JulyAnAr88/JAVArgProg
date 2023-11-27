package ACT2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class Transformador {

	static Function<String, String> mayuscular = palabra -> palabra.toUpperCase();

	@FunctionalInterface
	public interface UpperWord {
		String apply(String palabra);
	}

	public static List<String> transformador(List<String> palabras, UpperWord mayusculador) {
		List<String> resultado = new ArrayList<>();
	    for (String cadena : palabras) {
	      resultado.add(mayusculador.apply(cadena));
	    }
		return resultado;

	}

	public static void main(String args[]) {
		List<String> test = new ArrayList<String>();

		try (Scanner lectura = new Scanner(System.in)) {
			int i = 0;
			while (i != 2) {

				System.out.println("Seleccione una opción: ");
				System.out.println("1. Ingresar palabra");
				System.out.println("2. Salir");

				i = lectura.nextInt();
				switch (i) {
				case 1:
					System.out.println("Ingrese una palabra: ");

					String palabra = lectura.next();
					test.add(palabra);
					break;
				default:
					break;
				}

			}
		}

		if (test.isEmpty()) {
			System.out.println("Nada que convertir");
		} else {
			List<String> testTransformado = transformador(test, palabra -> palabra.toUpperCase());
			for (String string : testTransformado) {
				System.out.println(string);
			}
		}

	}
}

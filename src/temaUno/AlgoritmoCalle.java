package temaUno;

import java.util.Scanner;

/**
 * 
 * @author Nelso
 *
 *Para usar los operadores booleanos es necesario usar el tipo de variable primitivo (int or double)
 *asignarle nombre y valor y luego compararlo con los operadores lógicos.
 *
 *El operador "!" por sintaxis funciona en el programa como "!=" para que no de error.
 *
 *En las operaciones booleanas da igual si haces la operación directamente con el valor o con el nombre 
 *de la variable. Ejemplo: boolean result= num-valor:5-==num2-4-. Es válido ponerlo de las dos formas.
 */

/**
 * Tema 1: Actividad resuelta 1.10 p.31 Diseñar un algoritmo que nos indique si
 * podemos salir a la calle. Existen aspectos que influirán en esta decisión: si
 * está lloviendo y si hemos terminado nuestras tareas. Solo podremos salir a la
 * calle si no está lloviendo y hemos finalizado nuestras tareas. Existe una
 * opción en la que, indistintamente de lo anterior, podremos salir a la calle:
 * el hecho de que tengamos que ir a la biblioteca (para realizar un trabajo,
 * etc). Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado
 * las tareas y si necesita ir a la biblioteca. El algoritmo debe mostrar
 * mediante un booleano si es posible que se le otorgue el permiso para ir a la
 * calle.
 */

public class AlgoritmoCalle {

	public static void main(String[] args) {
		// creas tus variable por etapas
		boolean irBiblio, lluvia, deberes;

		// llama al objeto scanner "sc"
		Scanner sc = new Scanner(System.in);

		// muestra por pantalla
		System.out.println("¿Necesitas ir a la biblioteca?");

		// guardas el valor
		irBiblio = sc.nextBoolean();

		// evaluas
		// si variable irBiblio es ==true
		if (irBiblio == true) {
			// muestras por pantalla "puedes salir", fin del programa
			System.out.println("puedes salir");

			// sino haces otra pregunta
		} else {
			// pregunta
			System.out.println("Está lloviendo?");

			// guarda el valor
			lluvia = sc.nextBoolean();

			// evaluas si lluvia es ==false
			if (lluvia == false) {
				// muestra por pantalla "puedes salir, fin del programa
				System.out.println("Puedes salir");
			}

			// sino haces otra pregunta
			else {
				// muestra por pantalla
				System.out.println("¿terminaste los deberes?");
				// guardas el valor
				deberes = sc.nextBoolean();

				// evaluas si deberes es == "true"
				if (deberes == true) {
					// sale por pantalla "puedes salir", finaliza programa
					System.out.println("Puedes salir");
				}

				// sino sale por pantalla no puedes salir
				else {
					System.out.println("No puedes salir");
				}
			}
		}

	}

}

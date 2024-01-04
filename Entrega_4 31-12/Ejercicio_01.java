package com.educacionit.desafio4;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		// declaro las variables a utilizar
		int resultado = 0;
		int numeroLeido = 0;
		int mayor = 0;
		int menor = 0;
		// inicializo el scanner para que el usuario ingrese los datos por consola
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido al programa de suma de numeros");
		// inicio el ciclo do-while, donde consulto si se ingreso el numero 0 al final
		// del ciclo
		do {
			// le solicito al usuario que ingrese el numero por la consola
			System.out.print("Para finalizar con el programa ingrese 0, de lo contrario escriba cualquier numero: ");
			// sumo el numero ingresado al resultado final
			numeroLeido = scanner.nextInt();
			resultado = resultado + numeroLeido;
			// cuando iniliza el programa con las variables en 0, asigno el valor a mayor y
			// menor
			if (mayor == 0) {
				mayor = numeroLeido;
			}
			if (menor == 0) {
				menor = numeroLeido;
			}
			// luego voy comprando con cada valor ingresado si este es mayor o menor al que
			// ya estaba guardado
			if (mayor < numeroLeido && numeroLeido != 0) {
				mayor = numeroLeido;
			}
			if (menor > numeroLeido && numeroLeido != 0) {
				menor = numeroLeido;
			}

		} while (numeroLeido != 0);
		// Muestro los resultados y los numeros mayor y menor por consola
		System.out.println("La sum total de los numeros es: " + resultado);
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);

	}

}

package com.educacionit.desafio4;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		//declaro las variables a utilizar, el array donde guardo los numeros lo defino de una longitud de 100
		int posicion = 0;
		int resultado = 0;
		int mayor = 0;
		int menor = 0;
		int[] numerosIngresados = new int[100];
		//inicializo el scanner para que el usuario ingrese los datos por consola
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido al programa de suma de numeros");
		
		while (true) {
			//le solicito al usuario que ingrese el numero por la consola
			System.out.print("Para finalizar con el programa ingrese 0, de lo contrario escriba cualquier numero: ");
			//guardo el numero en el array en la posicion actual
			numerosIngresados[posicion] = scanner.nextInt();
			//luego consulto si se ingreso 0, si es asi, sumo los valores, adicionalmente obtengo los numeros mayor y menor
			if (numerosIngresados[posicion] == 0) {
				for (int i = 0; i < posicion; i++) {
					resultado = resultado + numerosIngresados[i];

				}
				mayor=numerosIngresados[0];
				for (int i = 0; i < posicion; i++) {
					if (numerosIngresados[i] > mayor)
						mayor = numerosIngresados[i];

				}
				menor = mayor;
				for (int i = 0; i < posicion; i++) {
					if (numerosIngresados[i] < menor)
						menor = numerosIngresados[i];

				}
				break;
			}
			posicion++;
		}
		//Muestro los resultados y los numeros mayor y menor por consola
		System.out.println("La sum total de los numeros es: " + resultado);
		System.out.println("El numero mayor es: " + mayor);
		System.out.println("El numero menor es: " + menor);

	}

}

package com.educacionit.desafio5;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		//declaro las variables a utilizar
		String oracion = "";
		char[] arrayLetras;
		String[] arrayPalabras;
		int contadorPalabras = 0;
		String palabraRepetida;
		int contador = 0;
		//Inicializo el scanner para que el usuario ingrese la oracion
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido al programa para analizar oraciones");
		while (true) {
			// le solicito al usuario que ingrese la oracion a analizar y la guardo en el
			// string
			System.out.println("Por favor, indique la oracion que desea evaluar (no puede esta vacia)");
			oracion = scanner.nextLine();
			// copruebo que no sea una oracion vacia
			if (oracion.isBlank()) {
				System.out.println("¡La oracion estar vacia, por favor intente nuevamente!\n");
			} else {
				break;
			}

		}
		//separo las palabras con el metodo split, los guardo en arrayPalabras y lo imprimo por pantalla
		arrayPalabras = oracion.split(" ");
		System.out.println("La oracion contiene: " + arrayPalabras.length + " palabra/s");
		//luego busco palabra por palabra para verficar si se repite alguna, en caso que se repita o no, lo imprimo por pantalla
		for (int i = 0; i < arrayPalabras.length; i++) {
			String palabra = arrayPalabras[i];

			for (int j = 0; j < arrayPalabras.length; j++) {
				if (palabra.equals(arrayPalabras[j])) {
					contador++;
				}

			}
			if (contador == 1) {
				contador = 0;
			}
		}
		if (contador > 1) {
			System.out.println("Hay palabras repetidas");
		} else {
			System.out.println("Ninguna palabra se repite");
		}
		//Luego ordeno el arrayPalabras con el metodo sort y lo imprimo por pantalla
		Arrays.sort(arrayPalabras);
		String palabrasOrdenadas = Arrays.toString(arrayPalabras);
		System.out.println("Palabras ordenadas: " + palabrasOrdenadas);
		//por ultimo elimino lo espacios, guardo todas las letras en arrayLetras
		oracion = oracion.replaceAll(" ", "");
		arrayLetras = oracion.toCharArray();
		//ordeno las letras por orden alfabetico y luego las imprimo
		Arrays.sort(arrayLetras);
		String letrasOrdenadas = Arrays.toString(arrayLetras);
		System.out.println("Letras ordenadas: " + letrasOrdenadas);
		

	}

}

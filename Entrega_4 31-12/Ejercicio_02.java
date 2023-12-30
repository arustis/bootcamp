package com.educacionit.desafio4;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		// declaro mis variables, junto con el string y el array a utilizar
		String oracion = "";
		char[] letrasOracion;
		char caractMasRepetido = 0;
		int contadorCaract = 0;
		// inicializo el escaner para ingresar los datos por consola
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bienvenido al programa contador de letras");
		while (true) {
			// le solicito al usuario que ingrese la oracion a analizar y la guardo en el
			// string
			System.out.println("Por favor, ingrese la oracion que desea evaluar(no puede estar vacia):");
			oracion = scanner.nextLine();
			// copruebo que no sea una oracion vacia
			if (oracion.isBlank()) {
				System.out.println("¡La oracion esta vacia, por favor intente nuevamente!\n");
			} else {
				break;
			}

		}
		// elimino los espacion en blanco y convierto en un array mis sting para poder analizar caracter por caracter
		oracion = oracion.replaceAll(" ", "");
		letrasOracion = oracion.toCharArray();
		// con el bucle for busco caracter por caracter y cuento cuantas veces se
		// repiten
		// cuando encuentro un caracter que se repita mas que el anterior, toma su lugar
		// como
		// caracter mas repetido
		for (int i = 0; i < letrasOracion.length; i++) {
			char caracter = letrasOracion[i];
			int contador = 0;
			// con este for compruebo cuantas veces se repitio el caracter que esta siendo
			// analizado
			for (int j = 0; j < letrasOracion.length; j++) {
				if (letrasOracion[j] == caracter) {
					contador++;
				}

			}
			// con el if analizo si este ultimo caracter se repitio mas veces que el ultimo
			// que
			// si lo hacia
			if (contadorCaract < contador) {
				contadorCaract = contador;
				caractMasRepetido = caracter;
			}
		}
		// imrimo en pantalla el caracter mas repetido y cuantas veces lo hizo
		System.out.println("El caracter '" + caractMasRepetido + "' se repitio: " + contadorCaract
				+ " veces.\nMuchas gracias por usar este programa.");
	}

}

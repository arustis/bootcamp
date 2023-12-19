package com.educacionit.desafio3;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		int temperatura = 0;
		String tiempo = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("---.Bienvenido al sistema de sugerencias basado en el clima ingresado.---");
		System.out.print("Por favor, ingrese la temperatura en grados celcius: ");
		temperatura = scanner.nextInt();
		System.out.println("Usted ingreso " + temperatura + "°C");
		System.out.println("Por favor ingrese si esta lloviendo, nevando o soleado");
		tiempo = scanner.next();
		System.out.println("Usted ingreso que esta " + tiempo);
		if (temperatura > 25 && tiempo.equals("soleado")) {
			System.out.println("Puede salir a caminar y/o tomar sol(utilizar protector solar)");

		} else if (temperatura <= 25 && temperatura > 15 && tiempo.equals("soleado")) {
			System.out.println("Puede salir a caminar.");

		} else if (temperatura <= 15 && tiempo.equals("soleado")) {
			System.out.println("Puede salir a caminar con campera.");

		} else if (temperatura < 10 && tiempo.equals("lloviendo")) {
			System.out
					.println("Recomiendo quedarse en casa o, en caso de tener que salir, utilizar paraguas y campera.");

		} else if (temperatura < 10 && tiempo.equals("nevando")) {
			System.out.println("Puede salir a esquiar con campera.");

		} else {
			System.out.println("Error en los datos ingresados.");
		}
		System.out.println("Que tenga un exelente día :D");

	}

}

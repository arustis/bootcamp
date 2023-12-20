package com.educacionit.desafio3;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// declaro las variables que van a recibir las credenciales que ingrese el
		// usuario por la consola y las variables con los valores fijos
		String usuario = null;
		String contraseña = null;
		String usuarioRoot = "admin";
		String contraseñaRoot = "password";
		System.out.println("---.Bienvenido al sistema de inicio de sesion.---");
		while (true) {
			// guardamos el usuario
			System.out.print("Por favor ingrese su Usuario: ");
			usuario = scanner.next();
			// guardamos la contraseña
			System.out.print("Por favor ingrese su Contraseña: ");
			contraseña = scanner.next();
			// comparamos con las credenciales deaclaradas en las variables usuarioRoot
			// y contraseñaRoot
			if (usuario.equals(usuarioRoot) && contraseña.equals(contraseñaRoot)) {
				//en caso de ser correctas, imprime lo siguiente en pantalla
				System.out.println("Bienvenido al sistema, que tenga buen día.\n");
				break;
			} else {
				//en caso de ser incorrectas, imprime lo siguiente en pantalla
				System.out.println("Credenciales incorrectas, intente nuevamente.\n");
			}
		}

	}

}

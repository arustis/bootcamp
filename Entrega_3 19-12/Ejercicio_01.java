package com.educacionit.desafio3;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String usuario = null;
		String contraseña = null;
		String usuarioRoot = "admin";
		String contraseñaRoot = "password";
		
		System.out.print("Por favor ingrese su Usuario: ");
		usuario = scanner.next();
		System.out.print("\n");
		System.out.print("Por favor ingrese su Contraseña: ");
		contraseña = scanner.next();
		System.out.print("\n");
		if (usuario.equals(usuarioRoot) && contraseña.equals(contraseñaRoot)) {
			System.out.println("Bienvenido al sistema");
		} else {
			System.out.println("Credenciales incorrectas");
		}

	}

}

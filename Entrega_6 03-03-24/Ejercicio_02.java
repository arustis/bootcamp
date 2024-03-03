package com.educacionit.desafio6;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		double valorA, valorB;
		char tipoDeOperacion;
		Scanner escaner = new Scanner(System.in);
		
		System.out.print("Ingrese un numero a: ");
		valorA = escaner.nextDouble();
		
		System.out.print("Ingrese un numero b: ");
		valorB = escaner.nextDouble();
		
		System.out.print("Ingrese el tipo de operacion que sea realizar(+, -, /, * o %) ");
		tipoDeOperacion = escaner.next().charAt(0);
		
		Operaciones calculo = new Operaciones(valorA, valorB, tipoDeOperacion);
		calculo.setA1(valorA);
		calculo.setB1(valorB);
		calculo.setOperador(tipoDeOperacion);
		switch (tipoDeOperacion) {
		case '+':
			System.out.println("El resultado de la suma es: " + calculo.suma(valorA, valorB));
			break;
		case '-':
			System.out.println("El resultado de la rest es: " + calculo.resta(valorA, valorB));
			break;
		case '*':
			System.out.println("El resultado de la multiplicacion es: " + calculo.multiplicar(valorA, valorB));
			break;
		case '/':
			System.out.println("El resultado de la división es: " + calculo.dividir(valorA, valorB));
			break;
		case '%':
			System.out.println("El resto de la división es: " + calculo.resto(valorA, valorB));
			break;
		default:
			System.out.println("Error en los datos ingresados");

		}
		escaner.close();
	}

}

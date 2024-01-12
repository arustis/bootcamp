package com.educacionIT.desafio2;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int horasTotales = 0;
		int horas = 0, dias = 0, semanas = 0;
		System.out.println("Por favor, ingrese el numero de horas que desea procesar(solo numeros): ");
		horasTotales = scanner.nextInt();
		semanas = horasTotales / 168;// 168 es el numero de horas por semana
		dias = (horasTotales - (semanas * 168)) / 24;//24 es el numero de hs por dia
		horas = horasTotales - (semanas * 168) - (dias * 24);
/*
 * El procedimiento realizado es:
 * calculo la cantidad de semanas que es equivalente las horas totales, como lo numeros
 * son enteros sin coma, el resto lo uso para calcular los dias y las horas
 */
		System.out.println("Cantidad de horas totales: " + horasTotales);
		System.out.println("Semanas: " + semanas);
		System.out.println("Dias: " + dias);
		System.out.println("Horas: " + horas);
	}
}

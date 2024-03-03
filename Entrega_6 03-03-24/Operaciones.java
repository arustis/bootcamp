package com.educacionit.desafio6;

public class Operaciones {
	private double a1;
	private double b1;
	private char operador;
	
	
	public Operaciones(double a1, double b1, char operador) {
		this.a1 = a1;
		this.b1 = b1;
		this.operador = operador;
	}
	

	public double getA1() {
		return a1;
	}


	public void setA1(double a1) {
		this.a1 = a1;
	}


	public double getB1() {
		return b1;
	}


	public void setB1(double b1) {
		this.b1 = b1;
	}


	public char getOperador() {
		return operador;
	}


	public void setOperador(char operador) {
		this.operador = operador;
	}


	public double suma(double oA, double oB) {
		return oA + oB;
	}

	public double resta(double oA, double oB) {
		return oA - oB;
	}

	public double multiplicar(double oA, double oB) {
		return oA * oB;
	}

	public double dividir(double oA, double oB) {
		if (oB != 0) {
			return oA / oB;
		} else {
			throw new ArithmeticException("¡No se puede dividir por cero!");
		}
		
	}
	public double resto (double oA, double oB) {
		if (oB != 0) {
			return oA % oB;
		} else {
			throw new ArithmeticException("¡No se puede calcular el resto dividido por cero!");
		}
	}
	
}

package br.com.erickfreire.parouimpar;

import java.util.Scanner;

/**
 * Programa Que verificar se é par ou impar
 * @author Erick Freire
 * @version 1 - Criada em 24/08/2021
 */

public class ParOuImpar {

	public static void main(String[] args) {
		
		int numero;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que verifica se um número é par ou impar:");
		System.out.print("Digite um valor: ");
		numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.print("\nNumero Par");
		} else {
			System.out.print("\nNumero Ímpar");
		}

	}

}

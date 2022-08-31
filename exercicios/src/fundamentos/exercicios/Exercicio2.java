package fundamentos.exercicios;

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        //2. Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double conversao = fahrenheit * 1.8 + 32 ;

        System.out.print("Valor em Celsius: " + conversao);

        scanner.close();
    }

}
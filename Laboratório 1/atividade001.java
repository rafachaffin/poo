//  1a atividade: Escreva um programa em Java que leia 2 raios R e r de entrada e
//  calcula a área da coroa circular A = pi * (R^2- r^2). Considere pi = 3,14159

import java.util.Scanner;

public class atividade001 {
    
    public static double quadrado(double numero){
        return numero*numero;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro raio:");
        double r1 = scanner.nextDouble();

        System.out.println("Digite o segundo raio:");
        double r2 = scanner.nextDouble();

        scanner.close();

        final double pi = 3.14159;
        double areaCoroa = (quadrado(r1) - quadrado(r2))*pi;


        System.out.printf("A área da coroa circular é de : %.2f" , areaCoroa);


    }
}

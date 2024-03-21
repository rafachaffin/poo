
//  2a atividade: Escreva um programa em Java que peça ao usuário seu nome, idade e
//  altura e imprima na tela as três informações.

import java.util.Scanner;

public class atividade002 {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome :");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade :");
        int idade = scanner.nextInt();

        System.out.println("Digite a altura :");
        double altura = scanner.nextDouble();

        scanner.close();

        System.out.println("A pessoa se chama : " + nome + "\n" + "Tem " + idade + " anos.\n" + "E possui " + altura + "m.");

    }
}

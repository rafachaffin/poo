//  4a atividade: Escreva um programa em Java que leia um número inteiro N de
//  entrada e calcule recursivamente o seu fatorial.


import java.util.Scanner;
public class atividade004 {


    public static int recursao(int a){
        if (a == 1) {
            return a;
        }
        return  a * recursao(a -1);
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o numero:");
        int num = scanner.nextInt();
        scanner.close();

        System.out.println( num + "! = "+ recursao(num));

    }
}

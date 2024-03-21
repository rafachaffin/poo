
// 3a atividade: Escreva um programa em Java que receba as duas notas de um aluno e
// calcule se o aluno ficou aprovado, em prova final ou reprovado. Considere:
// ● Aprovação: Média >= 7;
// ● Prova final: 3 <= Média < 7;
// ● Reprovação: Média < 3.

import java.util.Scanner;

public class atividade003 {

    public static double aNotaMedia(double p1 , double p2){
        double notaMedia = (p1+p2)/2;
        return notaMedia;
    }

   public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    double p1 = scanner.nextDouble();
    double p2 = scanner.nextDouble();
    scanner.close();

    double notaMedia = aNotaMedia(p1,p2);

    if(notaMedia < 3){

        System.out.println("O aluno foi reprovado . A média foi : "+ notaMedia);

    } else if ( notaMedia >= 3 && notaMedia < 7){

        System.out.println("O aluno deve fazer prova final. A média foi : "+ notaMedia);

    } else{

        System.out.println("O aluno passou direto. A média foi : "+ notaMedia);

    }
   } 
}

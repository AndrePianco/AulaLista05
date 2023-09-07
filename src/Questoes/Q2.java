package Questoes;
import java.util.Scanner;

public class Q2 {
    public static float medias(float N1, float N2, float N3, char Le) {

        float m=0;
        if(Le == 'A') {
            m = (N1+N2+N3)/2;
        }
        else if(Le == 'P') {
            m = ((N1*5)+(N2*3)+(N3*2))/10;
        }

        return m;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Digite As Três Notas e a Cada Nota Aperte Enter:");
        float N1 = scan.nextFloat();
        float N2 = scan.nextFloat();
        float N3 = scan.nextFloat();
        System.out.println("Agora Informe a Operação, Para Média Aritmética Digite 'A', e Para Ponderada Digite 'P':");
        char Le = scan2.nextLine().charAt(0);
        float media = medias(N1,N2,N3,Le);
        System.out.println("A Média Será: "+media);
    }
}
package Questoes;
import java.util.Scanner;

public class Q3 {
    public static int soma(int n){
        if(n == 1){
            return 1;
        }
        return n + soma(n-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o numero para ser usado na soma recursiva:");
        int num = scan.nextInt();
        int Soma = soma(num);
        System.out.println(Soma);
    }
}

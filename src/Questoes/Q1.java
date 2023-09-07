package Questoes;
import java.util.Scanner;


public class Q1 {
    public static int primo(int x) {
        if(x % 2 == 0) {
            return 1;
        }
        else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o Numero a Ser Checado");
        int Num = scan.nextInt();
        int Resultado = primo(Num);
        if(Resultado == 1) {
            System.out.println("O Número É Par!");
        } else {
            System.out.println("O Número É Ímpar!");
        }
    }
}
package Questoes;
import java.util.Scanner;

public class Q4 {
    public static class Filme {
        String nome;
        String autor;
        int ano;
        float preco;
    }
    public static Filme[] info = new Filme[3];
    public static Scanner scanner = new Scanner(System.in);

    public static void Pegar_dados() {
        for(int i = 0; i < 3; i++) {
            info[i] = new Filme(); // Crie um novo objeto Filme para cada posição do array
            System.out.printf("Informe o nome do filme %d:\n", i + 1);
            info[i].nome = scanner.nextLine();

            System.out.printf("Informe o autor do filme %d:\n", i + 1);
            info[i].autor = scanner.nextLine();

            System.out.printf("Informe o ano do filme %d:\n", i + 1);
            info[i].ano = scanner.nextInt();
            scanner.nextLine(); // Consuma a quebra de linha deixada na entrada após a leitura do ano

            System.out.printf("Informe o preço do filme %d:\n", i + 1);
            info[i].preco = scanner.nextFloat();
            scanner.nextLine(); // Consuma a quebra de linha deixada na entrada após a leitura do preço
        }
    }

    public static void Imprimir_dados() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Dados do Filme " + (i + 1) + ":");
            System.out.println("Nome: " + info[i].nome);
            System.out.println("Autor: " + info[i].autor);
            System.out.println("Ano: " + info[i].ano);
            System.out.println("Preço: " + info[i].preco);
        }
    }

    public static void main(String[] args){
        Pegar_dados();
        Imprimir_dados();
    }
}

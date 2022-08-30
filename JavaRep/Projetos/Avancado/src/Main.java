import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // ex1();
        //ex02();
        ex03();
    }

    public static void ex1() {
        // Pedir para o usuario infromar n numeros inteiros até ele digitar 0
        // Quando ele desejar 0, mostrar a lista dos numeros digitados por ele

        ArrayList inteiros = new ArrayList();
        while (true) {
            System.out.print("Informe o valor do inteiro: ");
            int escolha = in.nextInt();
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados:");
        System.out.println(inteiros);
    }

    public static void ex02() {
        // Pedir para o suario informar valores inteiros ate que seja informado 0
        // Quando for informado 0, mostrar os valores que o usuario informou
        // mostrar a soma dos numeros pares e dos numeros impares informados
        // mostrar a média de todos os valores informados

        ArrayList<Integer> inteiros = new ArrayList<>();
        int somapar = 0, somaimpar = 0;
        double somaTotal = 0;
        while (true) {
            System.out.print("Informe o valor do inteiro: ");
            int escolha = in.nextInt();
            if (escolha % 2 == 0) {
                somapar += escolha;
            } else if (escolha % 2 != 0) {
                somaimpar += escolha;
            }
            somaTotal += escolha;
            inteiros.add(escolha);
            if (escolha == 0) {
                break;
            }
        }
        System.out.println("Valores informados: " + inteiros);
        System.out.println("Soma dos numeros pares: " + somapar);
        System.out.println("Soma dos numeros ímpares: " + somaimpar);
        System.out.println("Média dos numeros informados: " + somaTotal / inteiros.size());
    }

    public static void ex03() {
        // ler o input do usuario (String) até que seja informado SAIR
        // Pedir para o usuario um valor inteiro > 0
        // Remover da lista as palavras que tenha a quantidade de caracteres menores que o numero informado

        ArrayList<String> palavras = new ArrayList();
        String palavra;
        int numero;
        while (true) {
            System.out.print("Informe uma palavra: (digite -sair- para encerrar a lista): ");
            palavra = in.nextLine();
            if (palavra.equalsIgnoreCase("sair")) {
                break;
            }
            palavras.add(palavra);
        }
        System.out.println("Informe um valor inteiro: ");
        numero = in.nextInt();
        for (int i = 0; i < palavras.size(); i++) {
            if (palavras.get(i).length() < numero) {
                palavras.remove(i);
                i--;
            }
        }
        System.out.println(palavras);
    }
}








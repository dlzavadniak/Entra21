import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Qual tabuada você deseja saber?");
        int valor = in.nextInt();
        while (valor != 0) {
            for (int i = 0; i <= 10; i++) {
                System.out.println(i * valor);
            }
            System.out.println("Qual tabuada você deseja saber?");
            valor = in.nextInt();
        }
    }
}
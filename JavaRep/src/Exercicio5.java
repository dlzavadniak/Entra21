import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantas palavras deseja informar:");
        int numpal = in.nextInt();
        String[] palavras = new String[numpal];
        for (int i = 0; i < numpal; i++) {
            System.out.println("Informe a palavra: ");
            palavras[i] = in.next();
        }
        for (int i = 0; i < palavras.length; i++) {
            if (i == 0) {
                System.out.print(palavras[i]);
            } else {
                System.out.print(", " + palavras[i]);
            }
        }
    }
}

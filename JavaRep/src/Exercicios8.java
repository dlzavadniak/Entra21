import java.util.Scanner;

public class Exercicios8 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //que01();
        que02();
    }

    public static void que01() {
        System.out.println("Escreva 2 números inteiros: ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        boolean maior = false, menor = false, igual = false, naoigual = false, maiorigual = false, menorigual = false;
        System.out.println("Mostrador de relacionamento: ");
        if (num1 > num2) {
            System.out.printf("%d é maior que %d\n", num1, num2);
            maior = true;
        }
        if (num1 ==num2) {
            System.out.printf("%d é igual a %d\n", num1, num2);
            igual = true;
        }
        if (num1<num2) {
            System.out.printf("%d é menor que %d\n", num1, num2);
            menor = true;
        }
        if (num1 != num2) {
            System.out.printf("%d é diferente de %d\n", num1, num2);
            naoigual = true;
        }
        if (num1>=num2) {
            System.out.printf("%d é maior ou igual a %d\n", num1, num2);
            maiorigual = true;
        }
        if (num1<=num2) {
            System.out.printf("%d é menor ou igual a %d\n", num1, num2);
        }
    }

    public static void que02() {

    }
}

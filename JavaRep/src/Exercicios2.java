import javax.sound.midi.Soundbank;
import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Exercicios2 {
    public static void main(String[] args) {
        // que01();
        //que02();
        //que03();
        //que04();
        //que05();
        //que06();
        //que07();
        //que08();
        que09();
    }

    public static void que01() {
        Scanner in = new Scanner(System.in);
        System.out.println("Valor da base: ");
        int base = in.nextInt();
        System.out.println("Valor da altura: ");
        int altura = in.nextInt();
        if (altura == base) {
            System.out.print("É um quadrado!");
        } else {
            System.out.print("É um retângulo!");
        }
    }

    public static void que02() {
        Scanner in = new Scanner(System.in);
        System.out.println("Primeiro valor: ");
        int prival = in.nextInt();
        System.out.println("Segundo valor: ");
        int segval = in.nextInt();
        if (prival > segval) {
            System.out.printf("O %d é o maior valor", prival);
        } else {
            System.out.printf("O %d é o maior valor", segval);
        }
    }

    public static void que03() {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantidade desejada: ");
        int quades = in.nextInt();
        int custo = 100;
        double valfin;
        double desco = 100 * 0.10;
        if (quades > 1000) {
            valfin = quades * (custo - desco);
        } else {
            valfin = quades * custo;
        }
        System.out.printf("O valor final é: R$%.2f", valfin);
    }

    public static void que04() {
        Scanner in = new Scanner(System.in);
        System.out.println("Salário atual");
        int salatu = in.nextInt();
        System.out.println("Anos trabalhados");
        int anotra = in.nextInt();
        double aume = salatu * 0.05;
        double salfi;
        if (anotra > 5) {
            salfi = salatu + aume;
        } else {
            salfi = salatu;
        }
        System.out.printf("O salário final é de: R$%.2f", salfi);
    }

    public static void que05() {
        Scanner in = new Scanner(System.in);
        System.out.println("Adicione a pontuação do aluno: ");
        int nota = in.nextInt();
        if (nota < 25) {
            System.out.println("O aluno tirou F");
        } else if (nota > 25 && nota < 45) {
            System.out.println("O aluno tirou E");
        } else if (nota > 45 && nota < 50) {
            System.out.println("O aluno tirou D");
        } else if (nota > 50 && nota < 60) {
            System.out.println("O aluno tirou C");
        } else if (nota > 60 && nota < 80) {
            System.out.println("O aluno tirou B");
        } else {
            System.out.println("O aluno tirou A");

        }
    }

    public static void que06() {
        Scanner in = new Scanner(System.in);
        System.out.println("Idade da primeira pessoa: ");
        int idapri = in.nextInt();
        System.out.println("Idade da segunda pessoa: ");
        int idaseg = in.nextInt();
        System.out.println("Idade da terceira pessoa: ");
        int idater = in.nextInt();
        if (idapri > idaseg && idapri > idater) {
            System.out.println("A primeira pessoa é a mais velha");
        } else if (idapri > idater && idapri < idaseg) {
            System.out.println("A segunda pessoa é a mais velha");
        } else {
            System.out.println("A terceira pessoa é a mais velha");
        }
        if (idapri < idater && idapri < idaseg) {
            System.out.println("A primeira pessoa é a mais nova");
        } else if (idapri < idater && idapri > idaseg) {
            System.out.println("A segunda pessoa é a mais nova");
        } else {
            System.out.println("A terceira pessoa é a mais nova");
        }
    }

    public static void que07() {
        Scanner in = new Scanner(System.in);
        System.out.print("Insira um número: ");
        int num = in.nextInt();
        System.out.printf("O valor absoluto desse número é %d", Math.abs(num));

    }

    public static void que08() {
        Scanner in = new Scanner(System.in);
        System.out.println("Número de aulas dadas: ");
        int auldad = in.nextInt();
        System.out.println("Número de aulas que esteve presente: ");
        int aulpre = in.nextInt();
        double pre = auldad * 0.75;
        if (aulpre > pre) {
            System.out.println("Poderá fazer o exame!");
        } else {
            System.out.println("Não poderá fazer o exame!");
        }
    }

    public static void que09() {
        Scanner in = new Scanner(System.in);
        System.out.println("Número de aulas dadas: ");
        int auldad = in.nextInt();
        System.out.println("Número de aulas que esteve presente: ");
        int aulpre = in.nextInt();
        double pre = auldad * 0.75;
        System.out.println("O aluno tem atestado médico? (SIM/NAO)");
        String atestado = in.nextLine();
        in.nextLine();
        if (atestado.equals("SIM")) {
            System.out.println("Poderá fazer o exame!");
        } else if (aulpre > pre) {
            System.out.println("Poderá fazer o exame");
        } else {
            System.out.println("Não poderá fazer o exame");
        }
    }
}




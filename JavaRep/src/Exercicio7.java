import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //que01();
        //que02();
        //que03();
        //que04();
        //que05();
        //que06();
        //que07();
        //que08();
        //que09();
        //que10();
        //que11();
        //que12();
        //que13();
        //que14();
        //que15();
        //que16();
        //que17();
        //que18();
        //que19();
        //que20();
        //que21();
        //que22();
        //que23();
        que24();
    }

    public static void que01() {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite uma frase");
        String frase = in.nextLine();
        int total = 0;
        char carac;
        for (int i = 0; i < frase.length(); i++) {
            carac = frase.charAt(i);
            if (carac == ' ') {
                total++;
            }
        }
        System.out.printf("A frase tem " + total + " espaços");
    }

    public static void que02() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva a altura");
        int altura = in.nextInt();
        System.out.println("Escreva a largura");
        int largura = in.nextInt();
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("#");
                if (j == largura - 1) {
                    System.out.println("");
                }
            }
        }
    }

    public static void que03() {
        Scanner in = new Scanner(System.in);
        int numeros[] = new int[5];
        int soma = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Escreva um número: ");
            numeros[i] = in.nextInt();
            soma += numeros[i];
        }
        System.out.println("A soma deles é " + soma);

    }

    public static void que04() {
        Scanner in = new Scanner(System.in);
        System.out.println("Escreva um número: ");
        int numero = in.nextInt();
        int fatorial = 1;
        for (int i = numero; i > 0; i--) {
            fatorial = numero * i;
            numero = fatorial;
        }
        System.out.println("O numero fatorial dele é " + fatorial);

    }

    public static void que05() {
        Scanner in = new Scanner(System.in);
        String[] user = {"Hassan", "Idris", "Trevor"};
        String[] password = {"homecoming", "turnupcharlie", "afraidofthedark"};
        System.out.println("Seu nome de usuario: ");
        String usuario = in.nextLine();
        System.out.println("Sua senha");
        String senha = in.nextLine();
        int contagem = 0;
        for (int i = 0; i < user.length; i++) {
            if (usuario.equalsIgnoreCase(user[i]) && senha.equals(password[i])) {
                System.out.println("Olá " + user[i]);
            } else {
                contagem++;
            }
        }
        if (contagem == user.length) {
            System.out.println("Usuario incorreto");
        }

    }

    public static void que06() {
        Scanner in = new Scanner(System.in);
        int tentativas = 3;
        while (tentativas > 0) {
            System.out.println("Informe um pin de 5 números");
            int pin = in.nextInt();
            if (pin == 91352) {
                System.out.println("Acesso autorizado");
                break;
            }
            tentativas--;
            if (tentativas == 0) {
                System.out.println("Acesso bloqueado");
            } else {
                System.out.println("Senha incorreta tente novamente");
            }
        }
    }

    public static void que07() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int soma = 0;
        int numero = in.nextInt();
        for (int i = 1; i <= numero; i++) {
            soma += i;
        }
        System.out.println("A soma é:" + soma);
    }

    public static void que08() {
        Scanner in = new Scanner(System.in);
        System.out.println("Nome completo do usuario: ");
        String name = in.nextLine();
        String[] array = name.split(" ");
        char nome = array[0].charAt(0);
        char sobrenome = array[1].charAt(0);
        System.out.println(nome + ". " + sobrenome + ".");

    }

    public static void que09() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe uma palavra");
        String palavra = in.next();
        String palindromo = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palindromo += palavra.charAt(i);
        }
        if (palindromo.equals(palavra)) {
            System.out.println("É um palíndromo");
        } else {
            System.out.println("Não é um palindromo");
        }
    }

    public static void que11() {
        System.out.println("Informe um número inteiro");
        String num = String.valueOf(in.nextInt());
        String inverso = "";
        for (int i = num.length() - 1; i >= 0; i--) {
            inverso = inverso + String.valueOf(num.charAt(i));
        }
        System.out.println(inverso);

    }

    public static void que12() {
        int maior = 0;
        int menor = 0;
        int parada = -1;
        boolean primeiro = true;
        while (true) {
            System.out.print("Informe um numero (0 para sair): ");
            parada = in.nextInt();
            if (parada == 0) {
                break;
            }
            if (primeiro) {
                menor = parada;
                maior = parada;
                primeiro = false;
            } else {
                if (parada > maior) {
                    maior = parada;
                }
                if (parada < menor) {
                    menor = parada;
                }
            }
        }
        System.out.println("O menor valor foi: " + menor);
        System.out.print("O maior valor foi: " + maior);
    }

    public static void que13() {
        Random r = new Random();
        int radomico = r.nextInt(101);
        int chutes = 0;
        while (true) {
            System.out.println("Informe um número: ");
            int valorInformado = in.nextInt();
            chutes++;
            if (valorInformado == radomico) {
                System.out.println("ACERTOU");
                break;
            } else if (valorInformado > radomico) {
                System.out.println("Chutou muito alto, tente novamente");

            } else {
                System.out.println("Chutou muito baixc, tente novamente");
            }
        }
        System.out.println("O numero de chutes foi " + chutes);
    }

    public static void que14() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j < 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if ((i + j < 4) || (j - i > 4)) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if ((i + j < 4) || (j - i > 4)) {
                    System.out.print(" ");
                } else {
                    System.out.print(i + 1);
                }
            }
            System.out.println("");
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 9; j++) {
                if ((i + j < 4) || (j - i > 4)) {
                    System.out.print(" ");
                } else if (j > 4) {
                    System.out.print(Math.abs(j - 3));
                } else {
                    System.out.print(Math.abs(j - 5));
                }
            }
            System.out.println("");
        }
    }

    //exercicios string 17/5

    public static void que15() {
        System.out.println("Digite algo: ");
        String algo = in.nextLine();
        System.out.println("Lenght: " + algo.length());
        System.out.println("Empty: " + algo.isEmpty());
        System.out.println("Uppercase: " + algo.toUpperCase());
        System.out.println("Lowercase: " + algo.toLowerCase());
    }

    public static void que16() {
        System.out.println("Escreva algo: ");
        String algo = in.nextLine();
        System.out.println("Escreva alguma coisa de novo: ");
        String algo2 = in.nextLine();
        if (algo.equals(algo2)) {
            System.out.println("As frases são iguais");
        } else if (algo.equalsIgnoreCase(algo2)) {
            System.out.println("As frases são iguais ignorando letras maiusculas");
        } else {
            System.out.println("As frases não são iguais");
        }
    }

    public static void que17() {
        System.out.println("Escreva uma frase: ");
        String frase1 = in.nextLine();
        System.out.println("Escreva mais uma frase: ");
        String frase2 = in.nextLine();
        if (frase1.contains(frase2)) {
            System.out.println("A segunda frase faz parte da primeira");
        } else if (frase2.contains(frase1)) {
            System.out.println("A primeira frase faz parte da segunda");
        } else {
            System.out.println("Uma frase não faz parte da outra");
        }
    }

    public static void que18() {
        System.out.println("Escreva uma frase: ");
        String frase1 = in.nextLine();
        System.out.println("Escreva uma palavra: ");
        String frase2 = in.nextLine();
        if (frase1.startsWith(frase2)) {
            System.out.println("A segunda frase não é prefixo da primeira frase");
        } else if (frase2.startsWith(frase1)) {
            System.out.println("A primeira frase não é prefixo da segunda frase");
        } else {
            System.out.println("Uma frase não é prefixo da outra");
        }
    }

    public static void que19() {
        System.out.println("Escreva uma frase: ");
        String frase1 = in.nextLine();
        System.out.println("Escreva uma palavra: ");
        String frase2 = in.nextLine();
        if (frase1.endsWith(frase2)) {
            System.out.println("A segunda frase não é sufixo da primeira frase");
        } else if (frase2.endsWith(frase1)) {
            System.out.println("A primeira frase não é sufixo da segunda frase");
        } else {
            System.out.println("Uma frase não é sufixo da outra");
        }
    }

    public static void que20() {
        System.out.println("Digite algo: ");
        String palavra = in.nextLine();
        System.out.println("Digite um algo de novo: ");
        String palavra2 = in.nextLine();
        int pos = palavra.indexOf(palavra2);
        System.out.println("A posição de " + palavra2 + " em " + palavra + " é " + pos);
    }

    public static void que21() {
        String frase = "lala#lwve#-rwgra22lalang!#<3";
        String decyphered = frase.replace("w", "o");
        decyphered = decyphered.replace("#", " ");
        decyphered = decyphered.replace("2", "m");
        decyphered = decyphered.replace("lala", "i");
        decyphered = decyphered.replace("-", "p");
        System.out.println(decyphered);
    }

    public static void que22() {
        System.out.println("Quantos numeros você deseja informar?");
        int num = in.nextInt();
        int numeros[] = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Informe um numero: ");
            numeros[i] = in.nextInt();
        }
        int somaPar = 0, somaImpar = 0;
        for (int valor : numeros) {
            if (valor % 2 == 0) {
                somaPar += valor;
            } else {
                somaImpar += valor;
            }
        }
        System.out.println("Soma dos valores pares: " + somaPar);
        System.out.println("Soma dos valores ímpares: " + somaImpar);
    }

    public static void que23() {
        System.out.println("Quantas palavras você deseja informar? ");
        int num = in.nextInt();
        String[] palavras = new String[num];
        in.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("Informe uma palavra: ");
            palavras[i] = in.nextLine();
        }
        System.out.println("Informe um número maior do que 0: ");
        int naozero = in.nextInt();
        for (int i = 0; i < num; i++) {
            if (palavras[i].length() < naozero) {
                palavras[i] = null;
            }
        }
        for (String palavra : palavras) {
            if (palavra != null) {
                System.out.println(palavra);
            }
        }
    }

    public static void que24() {
        System.out.println("Informe o tamanho da primeira lista: ");
        int tampri = in.nextInt();
        System.out.println("Informe o tamanho da segunda lista: ");
        int tamseg = in.nextInt();
        int[] numeros1 = new int[tampri];
        int[] numeros2 = new int[tamseg];
        //int[] numerosdi = new int[0];
        for (int i = 0; i < tampri; i++) {
            System.out.println("Informe um número para a primeira lista");
            numeros1[i] = in.nextInt();
        }
        for (int j = 0; j < tamseg; j++) {
            System.out.println("Informe um número para segunda lista");
            numeros2[j] = in.nextInt();
        }
        for (int valor1 : numeros1) {
            boolean achou = false;
            for (int valor2 : numeros2) {
                if (valor1 == valor2) {
                    achou = true;
                    break;
                }
            }
            if (!achou) {
                System.out.println("Os números da lista 1 que nao estão na lista 2 são: " + valor1);
            }
        }
    }


}





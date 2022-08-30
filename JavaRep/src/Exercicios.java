import java.awt.*;
import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        //exe01();
        //exe02();
        //exe04();
        //exe05();
        //exe06();
        //exe07();
        //exe08();
        //exe09();
        //exe10();
        //exe11();
        //exe12();
        //exe13();
        //exe14();
        //exe15();
        //exe16();
        //exe17();
        //exe18();
        //exe19();
        //exe20();
        //exe21();
        //exe22();
    }

    public static void exe01() {
        int varA = 10;
        int varB = 20;
        int varC = varA;
        varA = varB;
        varB = varC;
        System.out.println(varA);
        System.out.println(varB);
    }

    public static void exe02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("valor a ser subtraído");
        int val = sc.nextInt();
        System.out.println(--val);
    }

    public static void exe03() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base do retangulo");
        double base = sc.nextDouble();
        System.out.println(base);
        System.out.println("Altura do retangulo");
        double altura = sc.nextDouble();
        System.out.println("Área do retangulo");
        System.out.println(base * altura);
        System.out.println("Perímetro do retangulo");
        System.out.println(base + base + altura + altura);
    }

    public static void exe04() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Idade em anos");
        int anos = sc.nextInt();
        System.out.println("Idade em meses");
        int meses = sc.nextInt();
        System.out.println("Idade em dias");
        int dias = sc.nextInt();
        int anosdias = (anos * 365);
        int mesesdias = (meses * 30);
        System.out.println(anosdias + mesesdias + dias);
    }

    public static void exe05() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eleitores");
        int eleitores = sc.nextInt();
        System.out.println("Votos brancos");
        int brancos = sc.nextInt();
        System.out.println("Votos nulos");
        int nulos = sc.nextInt();
        int validos = eleitores - brancos - nulos;
        int perbra = brancos * 100 / eleitores;
        int pernul = nulos * 100 / eleitores;
        System.out.println("Votos válidos");
        System.out.println(validos);
        System.out.println("Percentual de votos brancos");
        System.out.println(perbra);
        System.out.println("Percentual de votos nulos");
        System.out.println(pernul);
    }

    public static void exe06() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Salário mensal");
        int salario = sc.nextInt();
        System.out.println("Percentual de reajuste");
        int percentual = sc.nextInt();
        System.out.println("Novo salário");
        System.out.println(salario * percentual / 100 + salario);
    }

    public static void exe07() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Custo de Fábrica do carro");
        double custfa = sc.nextDouble();
        double perdis = 0.28;
        double perimp = 0.45;
        System.out.println("Custo final do carro");
        double valdis = perdis * custfa;
        double valimp = perimp * custfa;
        double custfin = custfa + valdis + valimp;
        System.out.println(custfin);

    }

    public static void exe08() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Carros vendidos");
        double carven = sc.nextDouble();
        System.out.println("Valor total de vendas");
        double totven = sc.nextDouble();
        System.out.println("Salário Fixo");
        double salfix = sc.nextDouble();
        System.out.println("Valor recebido por carro vendido");
        double valcarven = sc.nextDouble();
        double comissao = carven * valcarven;
        double comissa2 = totven * 0.05;
        System.out.println("Salário final do vendedor");
        double salariofinal = salfix + comissao + comissa2;
        System.out.println(salariofinal);

    }

    public static void exe09() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Graus em Fahrenheit");
        double fah = sc.nextDouble();
        double cel = ((fah - 32) / 9) * 5;
        System.out.println("Graus em celsius");
        System.out.println(cel);
    }

    public static void exe10() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeira nota:");
        double nota1 = sc.nextDouble();
        double nota12 = nota1 * 2;
        System.out.println("Segunda nota:");
        double nota2 = sc.nextDouble();
        double nota23 = nota2 * 3;
        System.out.println("Terceira nota:");
        double nota3 = sc.nextDouble();
        double nota35 = nota3 * 5;
        double media = (nota12 + nota23 + nota35) / 10;
        System.out.println("Média final:");
        System.out.println(media);
    }

    public static void exe11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um valor:");
        int valor = sc.nextInt();
        if (valor > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else if (valor == 10) {
            System.out.println("É 10!");
        } else System.out.println("É MENOR QUE 10!");
        {
        }
    }


    public static void exe12() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um número: ");
        int valor = sc.nextInt();
        if (valor >= 0) {
            System.out.println("É POSITIVO");
        } else System.out.println("É NEGATIVO");
        {
        }
    }

    public static void exe13() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade de maçãs compradas: ");
        int maca = sc.nextInt();
        double total;
        if (maca >= 12) total = maca * 1.00;
        else total = maca * 1.30;
        {
            System.out.printf("O custo total das maçãs foi de: R$%.2f", total);
        }
    }

    public static void exe14() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ano de nascimento: ");
        int anonas = sc.nextInt();
        System.out.println("Ano atual: ");
        int anoatu = sc.nextInt();
        if (anoatu - anonas >= 16) {
            System.out.println("Poderá votar!");
        } else System.out.println("Não poderá votar!");
        {
        }
    }

    public static void exe15() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro valor: ");
        int prival = sc.nextInt();
        System.out.println("Segundo valor: ");
        int segval = sc.nextInt();
        if (prival > segval) {
            System.out.printf("O maior valor é: %d", prival);
        } else System.out.printf("O maior valor é: %d", segval);
        {
        }
    }

    public static void exe16() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o primeiro valor:");
        int prival = sc.nextInt();
        System.out.println("Insira o segundo valor: ");
        int segval = sc.nextInt();
        if (prival < segval) {
            System.out.printf("A ordem crescente é: %d %d. ", prival, segval);
        } else System.out.printf("A ordem crescente é: %d %d.", segval, prival);
        {
        }
    }

    public static void exe17() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Horário do ínicio do jogo");
        int horini = sc.nextInt();
        System.out.println("Hora do fim do jogo");
        int horfin = sc.nextInt();
        int hortot;
        if (horini < horfin) hortot = horfin - horini;
        else hortot = 24 - horini + horfin;
        {
            System.out.printf("O jogo teve %d horas", hortot);
        }
    }

    public static void exe18() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Horas trabalhadas em um mês");
        int hormes = sc.nextInt();
        System.out.println("Salário por hora");
        double salhor = sc.nextDouble();
        double horext = hormes - 160;
        double saltot;
        if (hormes > 160) {
            saltot = 160 * salhor + horext * 1.5 * salhor;
        } else {
            saltot = hormes * salhor;
        }
        System.out.printf("O salário final do funcionário é %.2f reais", saltot);
    }

    public static void exe19() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Seu gênero");
        String sexo = sc.nextLine();
        System.out.println("Seu nome");
        String nome = sc.nextLine();
        System.out.println("Sua altura");
        double altura = sc.nextDouble();
        double pesoideal;
        if (sexo.equals("MASCULINO")) {
            pesoideal = (72.7 * altura) - 58;
        } else {
            pesoideal = (62.1 * altura) - 44;
        }
        System.out.printf("Seu peso ideal é %.2f", pesoideal);
    }

    public static void exe20() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Salário fixo: ");
        double salfix = sc.nextDouble();
        System.out.println("Valor de vendas efetuadas: ");
        double venefe = sc.nextDouble();
        double salatot;
        if (venefe < 1500.00) {
            salatot = salfix + venefe * 0.03;
        } else {
            salatot = salfix + 1500.00 * 0.05;
        }
        System.out.printf("O salário total do vendedor é R$%.2f: ", salatot);
    }

    public static void exe21() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Número da conta: ");
        int numcon = sc.nextInt();
        System.out.println("Saldo na conta: ");
        double salcon = sc.nextDouble();
        System.out.println("Débito: ");
        double debcon = sc.nextDouble();
        System.out.println("Crédito: ");
        double credis = sc.nextDouble();
        double salatua =  salcon - debcon + credis;
        System.out.printf("O saldo atual da conta é: %.2f\n", salatua);
        if (salatua > 0) {
            System.out.println("SALDO ESTÁ POSITIVO");
        } else {
            System.out.println("SALDO ESTÁ NEGATIVO");
        }
    }
    public static void exe22(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantidade atual em estoque: ");
        double quaest = sc.nextDouble();
        System.out.println("Quantidade maxima de estoque: ");
        double maxest = sc.nextDouble();
        System.out.println("Quantidade mínima de estoque");
        double minest = sc.nextDouble();
        double quamed = ((maxest + minest)/2);
        if (quamed <= quaest) {
            System.out.println("NÃO EFETUAR COMPRA!");
        } else {
            System.out.println("EFETUAR COMPRA!");
        }
    }
}

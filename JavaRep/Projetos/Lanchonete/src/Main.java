import classes.cliente.Cliente;
import classes.lanches.*;

import java.util.InputMismatchException;
import java.util.Scanner;

import static classes.lanches.ETipoLanche.*;


public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Cliente cl = new Cliente();
        System.out.print("Insira o nome do cliente: ");
        cl.setNome(in.nextLine());
        while (true) {
            cl.getPedido().adicionarLanche(montarLanche());
            System.out.println("Deseja mais um lanche? (S/N)");
            if (in.nextLine().equalsIgnoreCase("N")) {
                break;
            }
        }
        System.out.println("Cliente: " + cl.getNome());
        cl.getPedido().imprimirComanda();
    }

    private static Lanche montarLanche() {
        Lanche lanche = null;
        while (lanche == null) {
            System.out.println("-MENU: Escolha uma opção-");
            Integer escolha = null;
            try {
                escolha = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Escolha um lanche valido!");
            } finally {
                in.nextLine();
                }
                ETipoLanche tipolanche = (ETipoLanche) escolha;
                switch (tipolanche) {
                    case X_BURGUER:
                        new XBurguer();
                        break;
                    case X_SALADA:
                        new XSalada();
                        break;
                    case MISTO_QUENTE:
                        new MistoQuente();
                        break;
                    case HOT_DOG:
                        new Hotdog();
                        break;
                    case MINI_PIZZA:
                        new MiniPizza();
                        break;
                    case MISTO_QUENTE:
                        new MistoQuente();
                        break;
                    case PIZZA:
                        new Pizza();
                        break;
                    default -> System.out.println("Opção não implement!");
                }
            }
            lanche.montarDetalhesLanche(in);
            System.out.print("Informe o valor do(a) " + lanche.getTipo() + ": R$");
            lanche.setValor(in.nextDouble());
            in.nextLine();
         return lanche;
    }
}


import java.util.HashMap;
import java.util.IllegalFormatCodePointException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Double> produtos = new HashMap<>();
        boolean executa = true;
        while (executa) {
            System.out.println("MENU");
            System.out.println("1 - Cadastrar produto: ");
            System.out.println("2 - Buscar produto");
            System.out.println("3 - Mostrar lista de produtos");
            System.out.println("4 - Remover produto");
            System.out.println("0 - Sair");
            int escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 0:
                    executa = false;
                    break;
                case 1:
                    System.out.println("Produto que deseja cadastrar: ");
                    String chave = in.nextLine();
                    if (produtos.containsKey(chave)) {
                        System.out.println("Produto já existente, deseja atualizar valor? (S/N)");
                        if (in.nextLine().equalsIgnoreCase("N")) {
                            continue;
                        }
                    }
                    System.out.println("Valor do produto de deseja cadastrar");
                    Double valor = in.nextDouble();
                    produtos.put(chave, valor);
                    break;
                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados!");
                    } else {
                        System.out.println("Produto que deseja buscar: ");
                        String produto = in.nextLine();
                        if (produtos.containsKey(produto)) {
                            System.out.println(produto + " : " + produtos.get(produto));
                        } else {
                            System.out.println("Produto " + produto + " não encontrado!");
                        }
                    }
                    break;
                case 3:
                    System.out.println(produtos); break;
                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados!");
                    } else {
                        System.out.println("Produto que deseja buscar: ");
                        String produto = in.nextLine();
                        if (produtos.containsKey(produto)) {
                            produtos.remove(produto);
                        } else {
                            System.out.println("Produto " + produto + " não encontrado!");
                        }
                    }
                    break;
                default:
                    System.out.println("Informe uma opção válida!");
            }
        }
    }
}

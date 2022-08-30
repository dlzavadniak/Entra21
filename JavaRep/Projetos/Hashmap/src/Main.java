import classes.Carro;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static HashMap<String, ArrayList<Carro>> carros = new HashMap<>();
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        boolean executa = true;
        while (executa) {
            System.out.println("--MENU--");
            System.out.println("1- Lista de carros disponiveis para a venda");
            System.out.println("2- Adicionar carro a lista de venda");
            System.out.println("3- Vender um carro");
            System.out.println("0- SAIR");
            int escolha = in.nextInt();
            in.nextLine();
            switch (escolha) {
                case 0:
                    executa = false;
                    break;
                case 1:
                    mostrarListaCarros();
                    break;
                case 2:
                    adicionarCarroLista();
                    break;
                case 3:
                    venderCarro();
            }
        }
    }

    public static void mostrarListaCarros() {
        if (carros.isEmpty()) {
            System.out.println("Não existem carros cadastrados!");
        } else {
            System.out.println("--Catalogo--");
            for (String key : carros.keySet()) {
                System.out.println("---" + key.toUpperCase() + "---");
                for (Carro c : carros.get(key)) {
                    System.out.printf("%s: R$%.2f.\n", c.getModelo(), c.getValor());
                }
            }
        }
        System.out.println();
    }

    public static void adicionarCarroLista() {
        System.out.println("Informe a marca do carro: ");
        String marca = in.nextLine().toLowerCase();
        Carro c = new Carro();
        System.out.println("Informe o valor de venda do carro: R$ ");
        c.setValor(in.nextDouble());
        in.nextLine();
        System.out.println("Informe o modelo do carro: ");
        c.setModelo(in.nextLine());
        if (!carros.containsKey(marca)) {
            carros.put(marca, new ArrayList<>());
        }
        carros.get(marca).add(c);
        System.out.println("Carro adicionado ao catalogo!");
        System.out.println();
    }

    public static void venderCarro() {
        System.out.println("Informe a marca do carro que deseja comprar: ");
        String marca = in.nextLine();
        if (!carros.containsKey(marca.toLowerCase())) {
            System.out.println("Não existem carros dessa marca!");
        } else {
            System.out.println("Informe o modelo do carro: ");
            String modelo = in.nextLine();
            ArrayList<Carro> carrosMarca = carros.get(marca.toLowerCase());
            boolean encontrado = false;
            for (int i = 0; i < carrosMarca.size(); i++) {
                Carro c = carrosMarca.get(i);
                if (c.getModelo().equalsIgnoreCase(modelo)) {
                    encontrado = true;
                    System.out.printf("Valor da venda: R$%.2f. Deseja efetuar venda? (S/N) ", c.getValor());
                    if (in.nextLine().equalsIgnoreCase("S")) {
                        System.out.printf("Carro %s da marca %s foi vendido por R$%.2f", c.getModelo(), marca, c.getValor());
                        carros.remove(i);
                        if (carrosMarca.isEmpty()) {
                            carros.remove(marca.toLowerCase());
                        }
                    }
                    break;
                }
            }
        }
    }
}

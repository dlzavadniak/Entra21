import classes.Manutencao;
import classes.Manutencao;
import classes.Veículo;

import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static Scanner in = new Scanner(System.in);

    public static ArrayList<Veículo> veiculos = new ArrayList<>();


    public static void main(String[] args) {
        while (true) {
            System.out.println("--MENU--");
            System.out.println("(1) - Cadastrar um veículo");
            System.out.println("(2) - Cadastrar uma manutenção");
            System.out.println("(3) - Checar o índice de sucateamento de um veículo");
            System.out.println("(4) - Custo médio e diário da manutençao");
            System.out.println("(5) - Comparar o indice de sucateamento de dois veículos");
            System.out.println("(6) - SAIR");
            System.out.println("Escolha: ");
            int escolha = in.nextInt();

            switch (escolha) {
                case 1:
                    veiculos.add(new Veículo());
                    break;
                case 2:
                    for (Veículo v : veiculos) {
                        v.getManutencaos().add(new Manutencao());
                    }
                    break;
                case 3:
                    for (Veículo v : veiculos) {
                        System.out.println("O índice de sucateamento do veiculo é: "+v.indiceSucateamento());
                    }
                    break;
                case 4:
                    System.out.println("Você deseja checar (1)- Custo médio das manutenções ou (2)- Custo diário da manutenção");
                    int escolha2 = in.nextInt();
                    in.nextLine();
                    for (Veículo v : veiculos) {
                        for (Manutencao manutencao : v.getManutencaos()) {
                            if (escolha2 == 1) {
                                System.out.println("O custo médio da manutenção é de: "+v.custoMedio());

                            } else if (escolha2 == 2) {
                                double media;
                                media = manutencao.getCusto() / manutencao.getTempParado();
                                System.out.println("O custo díario da manutenção foi de: R$" + media);
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.print("Digite a placa do primeiro veículo: ");
                    String placa = in.nextLine();
                    for (Veículo veiculo : veiculos) {
                        if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                            if (comparaSucateamento(veiculo) == 1) {
                                System.out.println("O primeiro veículo está menos sucateado!");
                            } else if (comparaSucateamento(veiculo) == 0) {
                                System.out.println("Ambos estão igualmente sucateados!");
                            } else if (comparaSucateamento(veiculo) == -1) {
                                System.out.println("O segundo veículo está menos sucateado!");
                            }
                        }
                    }
                    break;
            }
            if (escolha == 6) {
                break;
            }
        }
    }

    public static int comparaSucateamento(Veículo veiculo) {
        System.out.print("Digite a placa do segundo veículo: ");
        String placa2 = in.nextLine();
        double condicao2 = 0;
        for (Veículo veiculo2 : veiculos) {
            if (veiculo2.getPlaca().equalsIgnoreCase(placa2)) {
                if (veiculo.indiceSucateamento() > veiculo2.indiceSucateamento()) {
                    return -1;
                } else if (veiculo.indiceSucateamento() == veiculo2.indiceSucateamento()) {
                    return 0;
                } else {
                    return 1;
                }
            }
        }
        return 10;
    }

}
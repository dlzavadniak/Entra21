package classes;

import java.util.Scanner;

public class Manutencao {

    public static Scanner in = new Scanner(System.in);

    private int indenManutencao;

    private String descServico;

    private double custo;

    private int tempParado;

    private int contador;

    public Manutencao() {
        System.out.println("Informe o numero de indentificação da manutenção: ");
        setIndenManutencao(in.nextInt());
        in.nextLine();
        System.out.println("Informe a descrição da manutenção: ");
        setDescServico(in.nextLine());
        System.out.println("Informe o custo da manutenção: ");
        setCusto(in.nextDouble());
        in.nextLine();
        System.out.println("Informe o tempo parado do veículo: ");
        setTempParado(in.nextInt());
        in.nextLine();
    }







    public int getIndenManutencao() {
        return indenManutencao;
    }

    public void setIndenManutencao(int indenManutencao) {
        this.indenManutencao = indenManutencao;
    }

    public String getDescServico() {
        return descServico;
    }

    public void setDescServico(String descServico) {
        this.descServico = descServico;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public int getTempParado() {
        return tempParado;
    }

    public void setTempParado(int tempParado) {
        this.tempParado = tempParado;
    }

}


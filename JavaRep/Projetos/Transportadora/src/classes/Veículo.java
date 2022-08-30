package classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Veículo {

    private String placa;

    private String modelo;

    private String dataAquisicao;

    private ArrayList<Manutencao> manutencaos = new ArrayList<>();



    public static Scanner in = new Scanner(System.in);

    public Veículo(){
        System.out.println("--Cadastro do veículo--");
        System.out.println("Informe o modelo do veículo: ");
        setModelo(in.nextLine());
        System.out.println("Informe a placa do veículo: ");
        setPlaca(in.nextLine());
        System.out.println("Informe a data de aquisição do veículo: ");
        setDataAquisicao(in.nextLine());
    }

    public double custoMedio() {
        double customedio = 0;
        for (Manutencao manutencao : this.getManutencaos()) {
            customedio = manutencao.getCusto();
        } return customedio/manutencaos.size();
    }

    public int repeteServico(){
        System.out.print("Informe a descrição da manutenção: ");
        String descricao = in.nextLine();
        int repeticoes = 0;
        for (Manutencao manutencao:this.getManutencaos()) {
            if(manutencao.getDescServico().equalsIgnoreCase(descricao)){
                repeticoes++;
            }
        }
        return repeticoes;
    }

    public double indiceSucateamento(){
        int tempo = 0;
        for (Manutencao manutencao:this.getManutencaos()) {
            tempo += manutencao.getTempParado();
        }
        if(tempo<=20){
            return 0;
        } else if (tempo<=50) {
            return 0.5;
        } else if (tempo<=80){
            return 1.0;
        } else if (tempo<=120){
            return 1.5;
        } else {
            return 2;
        }
    }




    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDataAquisicao() {
        return dataAquisicao;
    }

    public void setDataAquisicao(String dataAquisicao) {
        this.dataAquisicao = dataAquisicao;
    }

    public ArrayList<Manutencao> getManutencaos() {
        return manutencaos;
    }

    public void setManutencaos(ArrayList<Manutencao> manutencaos) {
        this.manutencaos = manutencaos;
    }
}
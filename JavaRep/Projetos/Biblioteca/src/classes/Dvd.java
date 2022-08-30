package classes;

import java.util.Scanner;

public class Dvd extends Item {

    //atributos
    private String diretor;

    private double duracao;

    private  int anoLancamento;



    public void montarDetalhes(Scanner in) {
        System.out.println("Diretor do filme: ");
        this.setDiretor(in.nextLine());
        System.out.println("Ano de lançamento do filme: ");
        this.setAnoLancamento(in.nextInt());
        in.nextLine();
        System.out.println("Duração do filme: ");
        this.setDuracao(in.nextDouble());
        in.nextLine();
    }
    @Override
    public void mostrarDetalhes(){
        System.out.println("Diretor do filme: "+this.getDiretor());
        System.out.println("Ano de lançamento do filme: "+this.anoLancamento);
        System.out.println("Duração do filme: "+this.getDuracao());

    }
    // getter e setter

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
}

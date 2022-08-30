package classes;

import java.util.Scanner;

public class Livro extends Item{

    //atributos
    private String autor;

    private int qtdePaginas;

    private int anoPublicacao;

    private int edicao;


    //getter e setter

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public void montarDetalhes(Scanner in){
        System.out.println("Autor do livro: ");
        this.setAutor(in.nextLine());
        System.out.println("Quantidade de páginas do livro: ");
        this.setQtdePaginas(in.nextInt());
        in.nextLine();
        System.out.println("Ano de publicação: ");
        this.setAnoPublicacao(in.nextInt());
        in.nextLine();
        System.out.println("Edição número: ");
        this.setEdicao(in.nextInt());
        in.nextLine();
    }
    @Override
    public void mostrarDetalhes() {
        System.out.println("Autor do livro: "+this.getAutor());
        System.out.println("Quantidade de páginas do livro: "+this.getQtdePaginas());
        System.out.println("Ano de publicação: "+this.getAnoPublicacao());
        System.out.println("Edição número: "+this.getEdicao());

    }

    public int getQtdePaginas() {
        return qtdePaginas;
    }

    public void setQtdePaginas(int qtdePaginas) {
        this.qtdePaginas = qtdePaginas;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }
}

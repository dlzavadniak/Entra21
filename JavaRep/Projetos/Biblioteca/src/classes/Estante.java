package classes;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Estante {
    public static Scanner in = new Scanner(System.in);

    private int capMaxima;

    private ArrayList<Item> itens = new ArrayList<>();

    public Estante(int capacidadeMaxima) {
        setCapMaxima(capacidadeMaxima);
    }

    public boolean estanteCheia() {
        return this.quantidadeItens() == this.getCapMaxima();
    }

    public int quantidadeItens() {
        return this.itens.size();
    }


    public Item buscarItem(String titulo) {
        return this.itens.stream().filter(i -> i.getTitulo().equalsIgnoreCase(titulo))
                .findFirst().orElse(null);
    }
    public boolean adicionarItem(Item item) {
        if (!estanteCheia()) {
            return this.itens.add(item);
        }
        return false;
    }
    public Item removerItem(int posicao) {
        return this.itens.remove(posicao);
    }


    public int getCapMaxima() {
        return capMaxima;
    }

    public void setCapMaxima(int capMaxima) {
        this.capMaxima = capMaxima;
    }

    public ArrayList<Item> getItens() {
        return itens;
    }

    public void setItens(ArrayList<Item> itens) {
        this.itens = itens;
    }
}



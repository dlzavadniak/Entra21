package classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Baralho {

    private ArrayList<Carta> cartas = new ArrayList<>();

    public Baralho() {
        int valorNaipe = 1;
        for (Naipe n : Naipe.values()) {
            int valorCarta = 1;
            for (ValorCarta vc : ValorCarta.values()) {
                Carta c = new Carta();
                c.setValor(vc);
                c.setNaipe(n);
                c.setValorReal(valorNaipe*valorCarta);
                cartas.add(c);
                valorCarta++;
            }
        }
        shuffle();
    }

    public void shuffle() {
        Collections.shuffle(cartas);
    }

    public Carta getFromTop() {
        return this.cartas.remove(0);
    }

    public Carta getFromBottom() {
        return this.cartas.remove(this.cartas.size()-1);
    }

    public Carta searchCard(Naipe naipe, ValorCarta valorReal) {
        return this.cartas.stream().filter(carta -> naipe.equals(carta.getNaipe()) && carta.getValorReal() == valorReal).findFirst().orElse(null));

    }

    public Carta searchCard(Naipe naipe, int valorReal) {
        return null;
    }

    public ArrayList<Carta> getCartas() {
        return cartas;
    }

    public void setCartas(ArrayList<Carta> cartas) {
        this.cartas = cartas;
    }
}

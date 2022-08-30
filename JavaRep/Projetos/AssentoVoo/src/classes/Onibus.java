package classes;

import java.util.ArrayList;

public class Onibus implements MeioTransporte {

    private ArrayList<AssentoOnibus> assentos = new ArrayList<>();

    private boolean leito;

    public Onibus(int linhasCadeiras) {
        for (int i = 1; i <= 4 * linhasCadeiras; i++) {
            AssentoOnibus a = new AssentoOnibus();
            a.setLugar(String.valueOf(i));
            assentos.add(a);
        }
    }

    public ArrayList<AssentoOnibus> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoOnibus> assentos) {
        this.assentos = assentos;
    }

    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoOnibus assento1 : this.assentos) {
            if (assento.equalsIgnoreCase(assento1.getLugar())) {
                return assento1.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int contador = 0;
        for (AssentoOnibus assento : this.assentos) {
            if (!assento.isOcupado()) {
                contador++;
            }
        }
        return contador;
    }

    @Override
    public void mostrarAssento() {
        for (int i = 1; i <= assentos.size(); i++) {
            if (assentos.get(i-1).isOcupado()) {
                System.out.print("[XX]");
            }
            if (i < 10) {
                System.out.print("[0" + i + "]");
            } else {
                System.out.print("[" + i + "]");
            }
            if (i % 4 == 0) {
                System.out.println();
            }
            if (i % 2 == 0 && i % 4 != 0) {
                System.out.print("| |");
            }
        }
    }

    @Override
    public Assento getAssento(String assento) {
        for (AssentoOnibus assento1 : assentos) {
            if (assento.equalsIgnoreCase(assento1.getLugar())) {
                return assento1;
            }
        }
        return null;
    }

    public boolean isLeito() {
        return leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }
}

package classes;

import java.util.ArrayList;

public class Aviao implements MeioTransporte{
    private ArrayList<AssentoVoo> assentos = new ArrayList<>();

    public ArrayList<AssentoVoo> getAssentos() {
        return assentos;
    }

    public void setAssentos(ArrayList<AssentoVoo> assentos) {
        this.assentos = assentos;
    }

    public Aviao(int linhasCadeirasLuxo, int linhascadeirasEconomicas){
        for (int i = 0; i < 4*linhasCadeirasLuxo;i++){
            AssentoVoo a = new AssentoVoo();
            a.setCodigo(ClasseAssentoVoo.LUXO);
            assentos.add(a);
        }
        for (int i =0; i < 6*linhascadeirasEconomicas; i++) {
            AssentoVoo a = new AssentoVoo(ClasseAssentoVoo.ECONOMICA);
            assentos.add(a);
        }
    }

    @Override
    public boolean verificaOcupacao(String assento) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a.isOcupado();
            }
        }
        return false;
    }

    @Override
    public int quantidadeLivre() {
        int livres = 0;
        for (AssentoVoo a : this.assentos) {
            if (!a.isOcupado()) {
                livres++;
            }
        }
        return livres;
    }

    @Override
    public void mostrarAssento() {

    }

    @Override
    public void mostrarAssentos() {

    }

    @Override
    public Assento getAssento(String assento) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)) {
                return a;
            }
        }
        return null;
    }

    public Assento getAssento(String assento, ClasseAssentoVoo classe) {
        for (AssentoVoo a : this.assentos) {
            if (a.getCodigo().equalsIgnoreCase(assento)
                    && a.getClasse().equals(classe)) {
                return a;
            }
        }
        return null;
    }
}
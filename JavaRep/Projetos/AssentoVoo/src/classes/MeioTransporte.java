package classes;

public interface MeioTransporte {

    public boolean verificaOcupacao(String assento);

    public int quantidadeLivre();

    public void mostrarAssento();

    public Assento getAssento(String assento);

}

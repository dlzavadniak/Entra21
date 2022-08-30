package classes;

public enum Naipe {
    ESPADAS("espadas"), PAUS("paus"), COPAS("copas"), OUROS("ouros");

    private final String naipe;

    Naipe(String naipeCarta) {
       naipe = naipeCarta;
    }

    public String getNaipe(){
        return this.naipe;
    }

}

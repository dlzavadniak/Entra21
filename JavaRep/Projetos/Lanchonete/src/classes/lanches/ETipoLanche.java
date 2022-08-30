package classes.lanches;

public enum ETipoLanche {
    X_BURGUER(1, "X-BURGUER"),
    X_SALADA(2,"X-Salada"),
    MISTO_QUENTE(3, "Misto Quente"),
    HOT_DOG(4, "Hot Dog"),
    MINI_PIZZA(5,"Mini Pizza"),
    PIZZA(6,"Pizza");

    private int escolha;
    private String opcao;

    ETipoLanche(int num, String des){
        setEscolha(num);
        setOpcao(des);
    }

    ETipoLanche() {

    }

    public int getEscolha() {
        return escolha;
    }

    public void setEscolha(int escolha) {
        this.escolha = escolha;
    }

    public String getOpcao() {
        return opcao;
    }

    public void setOpcao(String opcao) {
        this.opcao = opcao;
    }
}



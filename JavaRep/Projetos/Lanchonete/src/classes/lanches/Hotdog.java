package classes.lanches;

public class Hotdog extends Sanduiches{

    public Hotdog() {
        this.adicionarIngrediente("Pão");
        this.adicionarIngrediente("Salsicha");
        this.adicionarIngrediente("Purê de batata");
        this.adicionarIngrediente("Batata palha");
        this.adicionarIngrediente("Vinagrete");
        this.adicionarIngrediente("Queijo Cheddar");
        this.adicionarIngrediente("Milho");
        this.adicionarIngrediente("Ervilha");
        this.setTipo("Hot Dog");
    }
}
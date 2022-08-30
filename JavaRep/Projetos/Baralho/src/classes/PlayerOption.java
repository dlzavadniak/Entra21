package classes;

public enum PlayerOption {
    JOGADOR1(1),
    JOGADOR2(2);

    private int value;

    private String description;

    PlayerOption(int jogador){
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

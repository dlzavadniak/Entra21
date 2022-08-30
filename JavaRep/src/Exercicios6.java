import java.util.Scanner;

public class Exercicios6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isClass = true;
        while (isClass) {
            System.out.println("Informe a abreviação: ");
            String clazz = in.next();
            if (clazz.length() != 3) {
                System.out.println("A abreviação está incorreta");
            } else {
            switch (clazz) {
                case "PLD", "WAR", "DKN", "GNB":
                    System.out.println("Pertence a classe Tank");
                    break;
                case "WHM", "SCH", "AST", "SAG":
                    System.out.println("Pertence a classe Healer");
                    break;
                case "MNR", "DRG", "NJA", "SMR", "RPR", "BRD", "MCH", "DNC", "BLM", "SMN", "RDM", "BEM":
                    System.out.println("Pertence a classe DPS");
                    break;
                default:
                    System.out.println("Não pertence a nenhuma classe");
                    isClass = false;
                    break;
            }
            }
        }

    }
}

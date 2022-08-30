import java.util.Locale;
import java.util.Scanner;
import java.sql.SQLOutput;

public class Codigo {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduza o código morse a ser traduzido para o português: ");
        String resposta = in.nextLine();
        resposta = resposta.toLowerCase();
        resposta = resposta.replace("--..--|", ",");
        resposta = resposta.replace(".-.-.-|", ".");
        resposta = resposta.replace("---...|", ":");
        resposta = resposta.replace("-.-.-.|", ";");
        resposta = resposta.replace("-.-.--|", "!");
        resposta = resposta.replace("..--..|", "?");
        resposta = resposta.replace(".----.|", "'");
        resposta = resposta.replace("-...-|", "=");
        resposta = resposta.replace("-....-|", "-");
        resposta = resposta.replace("-..-.|", "/");
        resposta = resposta.replace(".----|", "1");
        resposta = resposta.replace("..---|", "2");
        resposta = resposta.replace("...--|", "3");
        resposta = resposta.replace("....-|", "4");
        resposta = resposta.replace(".....|", "5");
        resposta = resposta.replace("-....|", "6");
        resposta = resposta.replace("--...|", "7");
        resposta = resposta.replace("---..|", "8");
        resposta = resposta.replace("----.|", "9");
        resposta = resposta.replace("-----|", "0");
        resposta = resposta.replace("-...|", "B");
        resposta = resposta.replace("-.-.|", "C");
        resposta = resposta.replace("..-.|", "F");
        resposta = resposta.replace("....|", "H");
        resposta = resposta.replace(".---|", "J");
        resposta = resposta.replace(".-..|", "L");
        resposta = resposta.replace(".--.|", "P");
        resposta = resposta.replace("--.-|", "Q");
        resposta = resposta.replace("...-|", "V");
        resposta = resposta.replace("-..-|", "X");
        resposta = resposta.replace("-.--|", "Y");
        resposta = resposta.replace("--..|", "Z");
        resposta = resposta.replace("-..|", "D");
        resposta = resposta.replace("--.|", "G");
        resposta = resposta.replace("-.-|", "K");
        resposta = resposta.replace("---|", "O");
        resposta = resposta.replace(".-.|", "R");
        resposta = resposta.replace("...|", "S");
        resposta = resposta.replace("..-|", "U");
        resposta = resposta.replace(".--|", "W");
        resposta = resposta.replace(".-|", "A");
        resposta = resposta.replace("..|", "I");
        resposta = resposta.replace("--|", "M");
        resposta = resposta.replace("-.|", "N");
        resposta = resposta.replace("-|", "T");
        resposta = resposta.replace(".|", "E");
        resposta = resposta.replace("*|", " ");
        System.out.println(resposta);

    }
}


// .--.|.-|.-.|.-|-...|.|-.|...|-.-.--|*|...-|---|-.-.|.|...|*|.--.|.-|...|...|.-|.-.|.-|--|*|-..|.-|*|.--.|.-.|..|--|.|..|.-.|.-|*|..-.|.-|...|.|-.-.--|


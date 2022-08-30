import java.util.Random;
import java.util.Scanner;

public class Pedrapapeltesoura {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner in = new Scanner(System.in);

        int pontuacao1 = 0;
        int pontuacao2 = 0;
        while (pontuacao1 < 10 && pontuacao1 < 10) {
            //usuario
            int escolhaUsuario = -1;
            boolean valida = escolhaValida(escolhaUsuario);
            while (!valida) {
                System.out.println("Escolha (0) Pedra, (1) Papel ou (2) Tesoura: ");
                escolhaUsuario = in.nextInt();
                if (!valida) {
                    System.out.println("Escolha inválida");
                }
            }


            String escolhaDoUsuarioString = escolhaString(escolhaUsuario);
            //computador
            int escolhaComputador = r.nextInt();
            String escolhaDoComputadorString = escolhaString(escolhaComputador);
            System.out.println("(Jogador) " + escolhaDoUsuarioString + " X " + escolhaDoComputadorString + "(Computador)");
            //int vencedor =
            //if (escolhaUsuario == escolhaComputador)

        }
    }

    public static boolean escolhaValida(int escolha) {
        return escolha > -1 && escolha < 3;
    }

    public static String escolhaString(int escolha) {
        switch (escolha) {
            case 0:
                return "Pedra";
            case 1:
                return "Papel";
            case 2:
                return "Tesoura";
            default:
                return "";
        }
    }

    public int checarVencedor(int escolha1, int escolha2) {
        if ((escolha1 == 0 && escolha2 == 1) ||
                   (escolha1 == 1 && escolha2 == 2) ||
                   (escolha1 == 2 && escolha2 == 0)) {
            return 2;
        } else if ((escolha2 == 0 && escolha1 == 1) ||
                  (escolha2 == 1 && escolha1 == 2) ||
                  (escolha2 == 2 && escolha1 == 0))  {
            return 1;
        } else {
            return 0;
        }
    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //doubleChar();
        //coutHi();
    }

    private static void doubleChar() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe uma palavra");
        String str = in.nextLine();
        String nova = "";
        for (int i = 0; i < str.length(); i++) {
            nova = nova + str.charAt(i) + str.charAt(i);
        }
        System.out.println(nova);
    }

    public static void coutHi() {
        Scanner in = new Scanner(System.in);
        System.out.println("Informe uma palavra");
        String str = in.nextLine();
        int contador = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'h') {
                if (str.charAt(i + 1) == 'i') {
                    contador++;

                }
            }
        }
        System.out.println(contador);
    }
    public static void catDog() {
String str=null;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '.'){
                if (i + 3 < str.length()) {
                    if (str.charAt(i + 1) == 'x') {
                        if (i + 2 < str.length()) {
                            if (str.charAt(i + 2) == 'y') {
                                if (i + 1 < str.length()) {
                                    if (str.charAt(i + 3) == 'z') {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } return false;
    }
    }
    if (str.charAt(i) == 'x') {
        if (i + 2 < str.length()) {
            if (str.charAt(i + 1) == 'y') {
                if (i + 1 < str.length()) {
                    if (str.charAt(i+2) == 'z') {
                        return true;
                     }
                }
             }
        } else if(str.charAt(0)==x)
    }
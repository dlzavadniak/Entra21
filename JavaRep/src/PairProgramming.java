import java.util.Scanner;

public class PairProgramming {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Informe a quantidade de alunos da turma: ");
        int qntAlunos = in.nextInt();
        System.out.print("Informe o número de questões da prova: ");
        int questoes = in.nextInt();
        System.out.print("Informe o gabarito oficial da prova: ");
        in.nextLine();
        String gabaritoOf = in.nextLine();
        System.out.println("");
        int pontos = 0;

        String[] nomeAlunos = new String[qntAlunos];
        String[] gabaritos = new String[qntAlunos];
        double[] notasFinais = new double[qntAlunos];
        int[] pontosfi = new int[qntAlunos];

        for (int i = 0; i < qntAlunos; i++) {
            System.out.print("Informe o nome do aluno: ");
            nomeAlunos[i] = in.nextLine();
            System.out.print("Informe o gabarito do aluno: ");
            gabaritos[i] = in.nextLine();
        }
        for (int i = 0; i < gabaritos.length; i++) {
            pontos = 0;
            for (int j = 0; j < gabaritoOf.length(); j++) {
                if (gabaritos[i].charAt(j) == gabaritoOf.charAt(j)) {
                    pontos++;
                }
            }
            pontosfi[i] = pontos;
        }

        for (int l = 0; l < notasFinais.length; l++) {
            double nota = (10.0 / questoes) * pontosfi[l];
            notasFinais[l] = nota;
            System.out.println("A nota do " + nomeAlunos[l] + " foi " + notasFinais[l]);

        }
    }
}





import classes.Checklistitem;
import classes.ListaTarefas;
import classes.Tarefa;

import java.util.Scanner;


public class Main {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Informe a quantidade de tarefas da lista: ");
        ListaTarefas lt = new ListaTarefas(in.nextInt());
        in.nextLine();
        System.out.println("Informe um nome para a lista de tarefas: ");
        lt.setNomeLista(in.nextLine());
        while (true) {
            Tarefa t = criarTarefa();
            if (!lt.adicionarTarefa(t)) {
                System.err.println("Impossivel adicionar tarefa!");
                break;
            }
            System.out.println("Deseja adicionar mais tarefas? (S/N)");
            String add = in.nextLine();
            if (add.equalsIgnoreCase("N")) {
                break;
            }
        }
    }

    public static Tarefa criarTarefa() {
        Scanner in = new Scanner(System.in);
        Tarefa t = new Tarefa();
        System.out.println("Informe o nome da tarefa: ");
        t.setNome(in.nextLine());
        System.out.println("Descreva a tarefa: ");
        t.setDescricao(in.nextLine());
        System.out.println("Ordem da tarefa: ");
        t.setOrdem(in.nextInt());
        in.nextLine();
        System.out.println("Tarefa tem checklist? (S/N)");
        String checklist = in.nextLine();
        System.out.println("Informe o tamanho da check list: ");
        if (checklist.equalsIgnoreCase("S")) {
            t.criarChecklist(in.nextInt());
            while (true) {
                Checklistitem item = new Checklistitem();
                System.out.println("Informe um nome para o item: ");
                item.setNome(in.nextLine());
                System.out.println("Informe uma descrição para o item: ");
                item.setDescricao(in.nextLine());
                t.adicionarChecklistItem((item));
                System.out.println("Deseja adicionar mais itens? (S/N)");
                String add = in.nextLine();
                if (add.equalsIgnoreCase("N")) {
                    break;
                }
            }
        }

        return t;
    }

}

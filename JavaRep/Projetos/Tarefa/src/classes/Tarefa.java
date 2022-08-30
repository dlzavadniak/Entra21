package classes;

import java.util.UUID;

public class Tarefa {

    // atributos

    private String uuid;

    private String nome;

    private String descricao;

    private boolean completa;

    private int ordem;

    private Checklistitem[] checklist;

    // métodos

    public Tarefa() {
        this.setUuid(UUID.randomUUID().toString());
    }

    public void completar() {
        this.setCompleta(true);
        for (Checklistitem item : this.getChecklist()) {
            if (item!= null) {
                item.completar();
            }
        }
    }

    public boolean temChecklist(){
       return this.getChecklist() != null;
    }

    public void criarChecklist(int tamanho) {
        this.setChecklist(new Checklistitem[tamanho]);
    }

    public boolean adicionarChecklistItem(Checklistitem item){
        for (int i = 0; i < this.getChecklist().length; i++) {
            if (this.getChecklist()[i] == null) {
                this.getChecklist()[i] = item;
                return true;
            }
        }
        return false;
    }

    // getters e setters

    public String getUuid() {
        return this.uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isCompleta() {
        return this.completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    public int getOrdem() {
        return this.ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public Checklistitem[] getChecklist() {
        return checklist;
    }

    public void setChecklist(Checklistitem[] checklist) {
        this.checklist = checklist;
    }
}

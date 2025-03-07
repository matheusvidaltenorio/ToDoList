package projetoatividades;
import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List<Tarefa> tarefas;

    public ToDoList() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefas.add(new Tarefa(descricao));
    }

    public void removerTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.remove(indice);
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa na lista.");
        } else {
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i).toString());
            }
        }
    }

    public void concluirTarefa(int indice) {
        if (indice >= 0 && indice < tarefas.size()) {
            tarefas.get(indice).concluir();
        } else {
            System.out.println("Índice inválido!");
        }
    }
}


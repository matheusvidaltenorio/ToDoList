package projetoatividades;
import java.util.Scanner;
public class ProjetoAtividades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList listaDeTarefas = new ToDoList();

        while (true) {
            System.out.println("\n---- Lista de Tarefas ----");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Remover Tarefa");
            System.out.println("3. Listar Tarefas");
            System.out.println("4. Concluir Tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (escolha) {
                case 1:
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();
                    listaDeTarefas.adicionarTarefa(descricao);
                    break;
                case 2:
                    listaDeTarefas.listarTarefas();
                    System.out.print("Digite o número da tarefa a ser removida: ");
                    int indiceRemover = scanner.nextInt() - 1;
                    listaDeTarefas.removerTarefa(indiceRemover);
                    break;
                case 3:
                    listaDeTarefas.listarTarefas();
                    break;
                case 4:
                    listaDeTarefas.listarTarefas();
                    System.out.print("Digite o número da tarefa a ser concluída: ");
                    int indiceConcluir = scanner.nextInt() - 1;
                    listaDeTarefas.concluirTarefa(indiceConcluir);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
    
}

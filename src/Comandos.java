import java.util.Scanner;
import java.util.ArrayList;

public class Comandos {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> tarefas = new ArrayList<>();

    public void exibirMenu() {
        System.out.println(" <<<<< Bem vindo ao Gerenciador de Tarefas! >>>>>");
        System.out.println("Selecione uma das opções abaixo: ");
        System.out.println("[1] Adicionar Tarefa");
        System.out.println("[2] Exibir Tarefas");
        System.out.println("[3] Remover Tarefa");
        System.out.println("[4] Sair");
    }

    public void adicionarTarefa() {
        System.out.println("<<<<< Gerenciador de Tarefas >>>>>");
        System.out.println("Digite a tarefa a ser adicionada abaixo: ");
        String tarefa = scanner.nextLine();
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso!");
    }

    public void exibirTarefas() {
        System.out.println("<<<<< Gerenciador de Tarefas >>>>>");
        if (tarefas.isEmpty()) {
            System.out.println("A lista de tarefas está vazia.");
        } else {
            System.out.println("Carregando tarefas...");
            for (int i = 0; i < tarefas.size(); i++) {
                System.out.println((i + 1) + ". " + tarefas.get(i));
            }
        }
    }

    public void removerTarefa() {
        if (!tarefas.isEmpty()) {
            System.out.println("<<<<< Gerenciador de Tarefas >>>>>");
            System.out.print("Digite o número da tarefa a ser removida: ");
            int indice = scanner.nextInt();
            if (indice >= 1 && indice <= tarefas.size()) {
                tarefas.remove(indice - 1);
                System.out.println("Tarefa removida com sucesso!");
            } else {
                System.out.println("Número de tarefa inválido.");
            }
        }
    }

    public void sair() {
        System.out.println("<<<<< Gerenciador de Tarefas >>>>>");
        System.out.println("Saindo do aplicativo...");
        System.out.println("Obrigado por usar o nosso Gerenciador de Tarefas!");
    }
}

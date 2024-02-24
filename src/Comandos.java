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
        System.out.println("[3] Verificar Tarefa");
        System.out.println("[4] Renomear Alguma Tarefa");
        System.out.println("[5] Remover Tarefa Específica");
        System.out.println("[6] Remover Todas as Tarefas");
        System.out.println("[7] Sair");
    }

    public void adicionarTarefa() {
        System.out.println("<<<<< Gerenciador de Tarefas >>>>>");
        System.out.println("Digite a tarefa a ser adicionada abaixo: ");
        String tarefa = scanner.nextLine().toLowerCase(); // Converte a entrada para minúsculo, para evitar erros em outros métodos.
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
                // Exibe o menu com 1 número a mais no indice para melhor navegação do usuário
            }
        }
    }

    public void verificarTarefa() {
        System.out.println("<<<<< Gerenciador de Tarefas >>>>>");
        System.out.println("Digite o nome da tarefa para verificar se existe na lista ou não.");
        String tarefa = scanner.nextLine().toLowerCase();
        if (!tarefas.isEmpty()) {
            if (tarefas.contains(tarefa)) {
                int indice = tarefas.indexOf(tarefa) + 1;
                System.out.println("A tarefa " + tarefa + " existe! A sua posição na lista é: " + indice + ".");
            } else {
                System.out.println("A tarefa " + tarefa + " não existe na lista!");
            }
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
    }

    public void renomearTarefa() {
        System.out.println("<<<<< Gerenciador de Tarefas >>>>>");
        System.out.println("Digite a posição da tarefa na lista: ");
        int indice = scanner.nextInt() - 1;
        scanner.nextLine();

        if (!tarefas.isEmpty()) {
            if (indice >= 0 && indice < tarefas.size()) {
                System.out.println("Agora, o novo nome da tarefa: ");
                String nome = scanner.nextLine();
                tarefas.set(indice, nome);
                System.out.println("Tarefa renomeada com sucesso!");
            } else {
                System.out.println("A posição indicada não existe na lista!");
            }
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
    }

    public void removerTarefa() {
        if (!tarefas.isEmpty()) {
            System.out.println("<<<<< Gerenciador de Tarefas >>>>>");
            System.out.print("Digite o número da tarefa a ser removida: ");
            int indice = scanner.nextInt();
            if (indice >= 1 && indice <= tarefas.size()) {
                tarefas.remove(indice - 1); // Será (indice - 1) pois acrescetamos 1 numero a mais no indice para melhor navegação.
                System.out.println("Tarefa removida com sucesso!");
            } else {
                System.out.println("Número de tarefa inválido.");
            }
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
    }

    public void removerTudo() {
        System.out.println("<<<<< Gerenciador de Tarefas >>>>>");
        System.out.println("Essa opção irá apagar tudo, você tem certeza? (S ou N)");
        String escolha = scanner.nextLine().toUpperCase(); // Converte a entrada para maiúsculo, para evitar erros.

        if (!tarefas.isEmpty()) {
            if (escolha.equals("S")) {
                tarefas.clear();
                System.out.println("Tarefas removidas com sucesso!");
            } else if (escolha.equals("N")) {
                System.out.println("Ok, retornando ao menu principal...");
            } else {
                System.out.println("Escolha uma opção válida!");
            }
        } else {
            System.out.println("A lista de tarefas está vazia.");
        }
    }

    public void sair() {
        System.out.println("<<<<< Gerenciador de Tarefas >>>>>");
        System.out.println("Saindo do programa...");
        System.out.println("Obrigado por usar o nosso Gerenciador de Tarefas!");
    }
}

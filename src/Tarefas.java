import java.util.InputMismatchException;
import java.util.Scanner;

public class Tarefas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Comandos comandos = new Comandos();

        while (true) {
            try {
                comandos.exibirMenu();
                int escolha = scanner.nextInt();
        
                switch (escolha) {
                    case 1:
                        comandos.adicionarTarefa();
                        break;
                    case 2:
                        comandos.exibirTarefas();
                        break;
                    case 3:
                        comandos.verificarTarefa();
                        break;
                    case 4:
                        comandos.removerTarefa();
                        break;
                    case 5:
                        comandos.removerTudo();
                        break;    
                    case 6:
                        comandos.sair();
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("[ERRO] Digite uma opção válida.");
                scanner.nextLine();
            }
        }
    }
}

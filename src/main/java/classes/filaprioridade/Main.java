package classes.filaprioridade;

import java.util.Scanner;

public class Main {

    /* NÃO FIZ O USO DESSA CLASSE!
    NÃO FIZ O USO DESSA CLASSE!
    NÃO FIZ O USO DESSA CLASSE!
    NÃO FIZ O USO DESSA CLASSE!
    NÃO FIZ O USO DESSA CLASSE!
    NÃO FIZ O USO DESSA CLASSE!
    */
    public static void main(String[] args) {
        
        
        GerenciadorFila filaComPrioridade = new GerenciadorFila();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar pessoa à fila");
            System.out.println("2. Remover pessoa da fila");
            System.out.println("3. Exibir fila");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome da pessoa: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite a prioridade (quanto menor o número, maior a prioridade): ");
                    int prioridade = scanner.nextInt();
                    //filaComPrioridade.adicionarPaciente(nome, prioridade);
                    break;
                case 2:
                    filaComPrioridade.removerPaciente();
                    break;
                case 3:
                    filaComPrioridade.exibirFila();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

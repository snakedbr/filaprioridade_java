package classes.filaprioridade;

import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
import javax.swing.JOptionPane;

public class GerenciadorFila {

    // Fila de prioridade que ordena as pessoas com base na prioridade
    private PriorityQueue<Paciente> fila;

    // Construtor que define o comparador para ordenar com base na prioridade
    public GerenciadorFila() {
        fila = new PriorityQueue<>(Comparator.comparingInt(Paciente::getPrioridade));
    }

    // Método para adicionar uma pessoa à fila
    public void adicionarPaciente(String nome, int idade, String cpf, String tipoconsulta, int prioridade) {
        Paciente paciente = new Paciente(nome, idade, cpf, tipoconsulta, prioridade);
        fila.add(paciente);
        JOptionPane.showMessageDialog(null, paciente+"\n\nCadastrado com sucesso!"); // uso JOptionPane dentro do método para ser imprimido a mensagem na GUI

    }

    // Método para remover a pessoa com maior prioridade (menor valor de prioridade)
    public void removerPaciente() {
        if (fila.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A fila está vazia, não há ninguém para remover.");
        } else {
            Pessoa removido = fila.poll(); // Remove a pessoa com maior prioridade
            JOptionPane.showMessageDialog(null, removido.getNome() + " foi removido da fila.");  // uso JOptionPane dentro do método para ser imprimido a mensagem na GUI
        } 
    }

    // Método para exibir a fila atual
    public void exibirFila() {
        if (fila.isEmpty()) {
           JOptionPane.showMessageDialog(null,"A fila está vazia.");
        } else {
            JOptionPane.showMessageDialog(null,"Fila atual:" + fila);
        }
    }
}

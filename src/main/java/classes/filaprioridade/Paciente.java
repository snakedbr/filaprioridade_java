package classes.filaprioridade;

public class Paciente extends Pessoa {

    private String tipoconsulta;
    private int prioridade;

    public Paciente(String nome, int idade, String cpf, String tipoconsulta, int prioridade) {
        super(nome, idade, cpf);
        this.tipoconsulta = tipoconsulta;
        this.prioridade = prioridade;
    }

    public Paciente(String nome, int prioridade) {
        super(nome, 0, ""); // Passando valores padrão para idade e CPF
        this.prioridade = prioridade;
    }

    public String getTipoconsulta() {
        return tipoconsulta;
    }

    public void setTipoconsulta(String tipoconsulta) {
        this.tipoconsulta = tipoconsulta;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    @Override
    public String toString() {
        return "\nPaciente: "+nome + "\nPrioridade: " + prioridade + "\nTipo de Consulta: "+tipoconsulta;
    }
    

}

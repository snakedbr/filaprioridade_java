
package classes.filaprioridade;

public class Medico extends Pessoa {
    
    private String especialidade;
    private String crm;
    private String login;
    private String senha;
    
    public Medico (String nome, int idade, String cpf, String especialidade, String crm, String login, String senha){
        super(nome, idade, cpf);
        this.especialidade=especialidade;
        this.crm=crm;
        this.login=login;
        this.senha=senha;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    @Override
    public String toString() {
        return "NOME: "+nome + "// ESPECIALIDADE: " + especialidade + "// CRM: " +crm;
    }
    
}

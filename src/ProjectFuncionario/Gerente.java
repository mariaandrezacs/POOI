package ProjectFuncionario;

public class Gerente extends Funcionario implements Geral{
    private int senha;

    
    public Gerente(int senha, String funcao, String nome, String cpf, double salario) {
        super(funcao, nome, cpf, salario);
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
   
    @Override
    public void calculaBonificacao(){
        this.setSalario(this.getSalario() + (this.getSalario() * 0.1));
    }
    
    
    @Override
    public String toString() {
        return "Funcionário {" + "Função = " + funcao + ", Nome = " + nome + ","
                +           " Cpf = " + cpf +  ", Salário = " + salario + '}';
    }

    
}

package ProjectFuncionario;

public class Funcionario {
    String nome;
    String cpf;
    double salario;
    String funcao;

    public Funcionario(String funcao, String nome, String cpf, double salario) {
        this.funcao = funcao;
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Funcionário {" + "Função = " + funcao + ", Nome = " + nome + ", Cpf = " + cpf +  ", Salário = " + salario + '}';
    }
  
    
}

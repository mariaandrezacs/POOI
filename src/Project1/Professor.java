package Project1;

// Herança, class encapsuladas, metodo construtor, toString, Sobreescrita
public class Professor extends Pessoa implements Geral{
    String especialidade;
    double salario;

    public Professor(String especialidade, double salario, int idade, String nome, String sexo) {
        super(idade, nome, sexo);
        this.especialidade = especialidade;
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Uso da Interface
    public void falar(){
        System.out.println("Olá, turma! Pestem atenção no assunto...podemos começar?!");
    }
    
    // Sobreescrita
    public String toString() {
        return "Pessoa{" + "idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "Especialidade = " + especialidade + "Salário = " + salario +'}';
    }
}

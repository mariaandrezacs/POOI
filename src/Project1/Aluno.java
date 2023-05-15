package Project1;

// Herança, class encapsuladas, metodo construtor, toString, Sobreescrita

public class Aluno extends Pessoa implements Geral{
    String curso;
    double numeroMatricula;

    public Aluno(String curso, double numeroMatricula, int idade, String nome, String sexo) {
        super(idade, nome, sexo);
        this.curso = curso;
        this.numeroMatricula = numeroMatricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(double numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }
    
    //Uso da Interface
    public void falar(){
        System.out.println("Oi, Pofessor! Podemos sim.");
    }
    
    // Sobreescrita
    public String toString() {
        return "Pessoa{" + "idade=" + idade + ", nome=" + nome + ", sexo=" + sexo + "Curso = " + curso + "numeroMatricula = " + numeroMatricula +'}';
    }
    
}

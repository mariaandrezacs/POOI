package Project1;

import java.util.Scanner;

public class TesteSala {
    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);
        //Professor p = new Professor();
        Aluno a;
        
        do{
            meuMenu();
            opcao  = sc.nextInt();
            switch(opcao){
                case 0:
                    //System.out.println("Fim.");
                case 1:
                    //apresentaProfessor();
                    break;
                case 2:
                    //apresentaAluno();
                    break;
                case 3:
                    //maisInformacao();
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }
        } while (opcao != 0);
        
    }
    
    public static void meuMenu(){
        System.out.println("-----Sala de Aula-----");
        System.out.println("0.Sair");
        System.out.println("1.Apresentar Professor");
        System.out.println("2.Alunos respondem");
        System.out.println("3.");
        System.out.println("4.Opção: "); }
    
    public static void apresentaProfessor(Professor p){
        p.setNome("Ricardo Azevedo");
        p.setIdade(32);
        p.setSexo("Masculino");
        p.setEspecialidade("Professor de Matemática");
        p.setSalario(1523.00);
        System.out.println(p.toString());
        //return p;
    }
    
    public static void aluno(){
        
    }
    
    public static void professor(){
        
    }
}

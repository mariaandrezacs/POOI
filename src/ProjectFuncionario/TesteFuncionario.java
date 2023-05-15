package ProjectFuncionario;

import java.util.Scanner;

public class TesteFuncionario {
    
    public static void main(String[] args) {
        int opcao;
        Scanner sc = new Scanner(System.in);  
        Gerente g = new Gerente(0000, "Gerente", "Roberto Rodrigues", "42365782190", 2000);
        
        do{  
            meuMenu();
            opcao  = sc.nextInt();
            switch(opcao){
                case 0:
                    System.out.println("Fim!");
                case 1:
                    mostrarFuncionario(g);
                    break;
                case 2:
                    aumentarSalario(g);
                    break;
                case 3:
                    adicionarBonificacao(g);
                    break;
                default:
                    System.out.println("Opção Inválida.");
            }
        } while (opcao != 0);
    }
    
    public static void meuMenu(){
        System.out.println("-----Funcionários-----");
        System.out.println("0.Sair");
        System.out.println("1.Mostrar dados do Funcionário");
        System.out.println("2.Aumentar Salário");
        System.out.println("3.Adicionar Bonificação");
        System.out.println("4.Opção: ");  
    }
    
    public static void mostrarFuncionario(Gerente g){
        g.setSenha(5555);
        System.out.println(g.toString());

    } 
    public static void aumentarSalario(Gerente g){
        System.out.println("Aumento de (R$250,00) no salário do funcionário.");
        g.setSalario(g.getSalario() + 250);
    }
    
    public static void adicionarBonificacao(Gerente g){
        System.out.println("Foi adicionado bonificação de 10% no Salário!");
        g.calculaBonificacao();  
    }
    
}

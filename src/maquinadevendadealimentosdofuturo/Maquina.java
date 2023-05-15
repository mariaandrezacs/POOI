
package maquinadevendadealimentosdofuturo;

import java.util.ArrayList;
import java.util.Scanner;

public class Maquina {
    
    
    public static void main(String[] args) {
        int opcao;
        ValorAPagar vp = new ValorAPagar(0.0);
        Scanner sc = new Scanner(System.in);
        ArrayList lista = new ArrayList();
           
        do{
            System.out.print("|------- Menu Principal ------|\n");
            System.out.print("| Opção 1 - Refrigerante      |\n");
            System.out.print("| Opção 2 - Água              |\n");
            System.out.print("| Opção 3 - Chocolate         |\n");
            System.out.print("| Opção 4 - Finalizar compra  |\n");
            System.out.print("| Opção 0 - sair (Cancelar)   |\n");
            System.out.print("|--- Valor a pagar R$ "+vp.getValor()+" ----|\n");
            System.out.print("Digite uma opção: \n");
            opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
                MenuRefrigerante(vp, sc,lista);
                break;
            case 2:
                MenuAgua(vp, sc,lista);
                break;
            case 3:
                MenuBarraDeChocolate(vp, sc,lista);
                break;
            case 4:
                notaFiscal(vp, lista);
                opcao=0;
                break;
            case 0:
                System.out.print("\nCompra cancelada \nVolte sempre!");
                break;
            default:
                System.out.print("\nOpção Inválida!\n");
                break;              
        }
        }while(opcao!=0);
    }
    public static void MenuRefrigerante(ValorAPagar vp, Scanner sc,ArrayList lista) {
        int opcao;
        do{
            System.out.print("|----- Menu Refrigerante ------------|\n");
            System.out.print("| Opção 1 - Pode ser Pepsi (R$5,00)  |\n");
            System.out.print("| Opção 2 - Cajuina (R$2,50)         |\n");
            System.out.print("| Opção 3 - Guaraná Jesus (R$3,00)   |\n");
            System.out.print("| Opção 0 - Voltar ao menu principal |\n");
            System.out.print("|--- Valor a pagar R$ "+vp.getValor()+" -----------|\n");
            System.out.print("Digite uma opção: \n");
            opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
                Refrigerante PodeSerPepsi = new Refrigerante("PodeSerPepsi",5.0,false);
                subMenuGeloRefri(vp, sc,lista,PodeSerPepsi);
                break;
            case 2:
                Refrigerante Cajuina = new Refrigerante("Cajuina",2.50,false);
                subMenuGeloRefri(vp, sc,lista,Cajuina);
                break;
            case 3:
                Refrigerante GuaranaJesus = new Refrigerante("GuaranaJesus",3.0,false);
                subMenuGeloRefri(vp, sc,lista,GuaranaJesus);
                break;
            case 0:
                break;
            default:
                System.out.print("\nOpção Inválida!\n");
                break; 
        }
        }while(opcao!=0);
    }
    public static void MenuBarraDeChocolate(ValorAPagar vp, Scanner sc,ArrayList lista) {
        int opcao;
        do{
        System.out.print("|-- Menu Barra De Chocolate ---------|\n");
        System.out.print("| Opção 1 - Garoto (R$5,00)          |\n");
        System.out.print("| Opção 2 - Nestle (R$4,50)          |\n");
        System.out.print("| Opção 0 - Voltar ao menu principal |\n");
        System.out.print("|--- Valor a pagar R$ "+vp.getValor()+" -----------|\n");
        System.out.print("Digite uma opção: \n");
        opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
                BarraDeChocolate Garoto = new BarraDeChocolate("Garoto",5.0);
                lista.add(Garoto);
                vp.adicionar(Garoto.getPreco());
                System.out.print("Produto adicionado no carrinho \n");
                opcao=0;
                break;
            case 2:
                BarraDeChocolate Nestle = new BarraDeChocolate("Nestle",4.50);
                lista.add(Nestle);
                vp.adicionar(Nestle.getPreco());
                System.out.print("Produto adicionado no carrinho \n");
                opcao=0;
                break;
            case 0:
                break;
            default:
                System.out.print("\nOpção Inválida!\n");
                break; 
        }
        }while(opcao!=0);
    }
    public static void MenuAgua(ValorAPagar vp, Scanner sc,ArrayList lista) {
        int opcao;
        do{
        System.out.print("|----- Menu Água --------------------|\n");
        System.out.print("| Opção 1 - Crystal (R$5,00)         |\n");
        System.out.print("| Opção 2 - Itagy (R$4,50)           |\n");
        System.out.print("| Opção 3 - Aldebaran (R$2,50)       |\n");
        System.out.print("| Opção 0 - Voltar ao menu principal |\n");
        System.out.print("|--- Valor a pagar R$ "+vp.getValor()+" -----------|\n");
        System.out.print("Digite uma opção: \n");
        opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
                Agua Crystal = new Agua("Crystal",5.0,false);
                subMenuGeloAgua(vp, sc,lista, Crystal);
             
                break;
            case 2:
                Agua Itagy = new Agua("Itagy",4.50,false);
                subMenuGeloAgua(vp, sc,lista, Itagy);
                
                break;
            case 3:
                 Agua Aldebaran = new Agua("Aldebaran",2.50,false);
                subMenuGeloAgua(vp, sc,lista,Aldebaran);
                
                break;
            case 0:
                break;
            default:
                System.out.print("\nOpção Inválida!\n");
                break;
        }
        }while(opcao!=0);
    }
     public static void subMenuGeloRefri(ValorAPagar vp, Scanner sc,ArrayList lista,Refrigerante refri ) {
        int opcao;
        do{
            System.out.print("|----- Gelo na bebiba? -------------|\n");
            System.out.print("| Opção 1 - Sim (R$1,00)            |\n");
            System.out.print("| Opção 2 - Não (R$0,00)            |\n");
            System.out.print("| Opção 0 - Voltar ao menu principal|\n");
            System.out.print("|--- Valor a pagar R$ "+vp.getValor()+" -----------|\n");
            System.out.print("Digite uma opção: \n");
            opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
                refri.setPreco(refri.getPreco()+1);
                refri.AdicionarGelo();
                vp.adicionar(refri.getPreco());
                lista.add(refri);
                System.out.print("Produto adicionado no carrinho \n");
                opcao=0;
                break;
            case 2:
                lista.add(refri);
                vp.adicionar(refri.getPreco());
                System.out.print("Produto adicionado no carrinho \n");
                opcao=0;
                break;              
            case 0:
                opcao=0;
                break;
            default:
                System.out.print("\nOpção Inválida!\n");
                break;           
        }
        }while(opcao!=0);
    }
     public static void subMenuGeloAgua(ValorAPagar vp, Scanner sc,ArrayList lista,Agua agua ) {
        int opcao;
        do{
            System.out.print("|----- Gelo na bebiba? ----------|\n");
            System.out.print("| Opção 1 - Sim (R$1,00)         |\n");
            System.out.print("| Opção 2 - não (R$0,00)         |\n");
            System.out.print("| Opção 0 - Não ao menu principal|\n");
            System.out.print("|--- Valor a pagar R$ "+vp.getValor()+" -----------|\n");
            System.out.print("Digite uma opção: \n");
            opcao = sc.nextInt();
        
        switch (opcao) {
            case 1:
                agua.setPreco(agua.getPreco()+1);
                agua.AdicionarGelo();
                lista.add(agua);
                vp.adicionar(agua.getPreco());
                System.out.print("Produto adicionado no carrinho \n");
                opcao=0;
                break;
            case 2:
                lista.add(agua);
                vp.adicionar(agua.getPreco());
                System.out.print("Produto adicionado no carrinho \n");
                opcao=0;
                break;              
            case 0:
                opcao=0;
                break;
            default:
                System.out.print("\nOpção Inválida!\n");
                break;           
        }
        }while(opcao!=0);
    }
    public static void notaFiscal(ValorAPagar vp, ArrayList lista){
        System.out.print("------ NOTA FISCAL-------\n");
           for (int i = 0; i < lista.size(); i++) {
                System.out.print("Item "+(i+1)+" "+lista.get(i)+"\n");   
    }
           System.out.print("Total a pagar R$ "+vp.getValor());
    
    
    } 
    
}


package Automovel;

public class TestaAutomovel {
    
    
    public static void main(String[] args) {
        //Agregação
        Direcao d = new Direcao("preta", (float) 35.2, true);
        Motor m = new Motor((float) 2.0, 'G', "4647832857383");
        Automovel a = new Automovel("fiat", "mobi", d, m);
        
        System.out.println(a.toString());
        //A destruição de a não afetaria d e m
        
        //Composição
        Automovel a2 = new Automovel("ford","ka",new Direcao("preta", (float) 35.2,true),new Motor((float) 1.6, 'A',"45347832857383"));
        
        System.out.println(a2.toString());
        //A destruição de a2 destruiria o motor e a direção que foram instanciadas no construtor
        
    }
}
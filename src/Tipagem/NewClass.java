package Tipagem;


public class NewClass{
//Tipagem forte e estática
//Forte e estática
//var-inferência de tipo    

}
class TipoEstatica {
    public static void main(String[] args) {
        
        //Integer numero = "123456789";  //ERROR
    }
}
class TipoForte {
    public static void main(String[] args) {
        
    }
    String texto = "Meu Texto";
    
    //texto = 1000;   //nok
    
    Integer numero = Integer.valueOf("1024");
    //numero = 512; //OK
}
class TipoInferido {
    public static void main(String[] args) {
        
        var numero = Integer.valueOf("123456");
        
        var texto = "O numero é: ";
        
        System.out.println(texto + numero);
        
    }
}


package maquinadevendadealimentosdofuturo;


public class Agua extends Produto implements Gelo {
    boolean gelo;
    
    public Agua(String marca, double preco, boolean gelo) {
        super(marca, preco);
        this.gelo = false;
    }

    @Override
    public void AdicionarGelo() {
        this.gelo = true;
    }
    
    @Override
    public String toString() {
        return "Água | Marca = " + this.getMarca() + " | valor = R$" + this.getPreco() +" | gelo = " + gelo;
    }   
  
    
}

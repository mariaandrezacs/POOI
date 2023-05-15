package maquinadevendadealimentosdofuturo;

public class Refrigerante extends Produto implements Gelo{
    boolean gelo;
    
    public Refrigerante(String marca, double preco,boolean gelo) {
        super(marca, preco);
        this.gelo = false;
    }

    @Override
    public void AdicionarGelo() {
        this.gelo = true;
    }
    
    @Override
    public String toString() {
        return "Refrigerante | Marca = " + this.getMarca() + " | valor = R$" + this.getPreco() +" | gelo = " + gelo;
    }
    
    
}

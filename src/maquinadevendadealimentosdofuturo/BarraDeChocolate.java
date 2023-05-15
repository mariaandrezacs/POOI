package maquinadevendadealimentosdofuturo;

public class BarraDeChocolate extends Produto{

    public BarraDeChocolate(String marca, double preco) {
        super(marca, preco);
    }
    @Override
    public String toString() {
        return "Barra de Chocolate | Marca = " + this.getMarca() + " | valor = R$" + this.getPreco();
    }
    
}


package maquinadevendadealimentosdofuturo;

public class ValorAPagar {
    private double valor;

    public ValorAPagar(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void adicionar(double precoProduto) {
        setValor(getValor()+precoProduto);
    }
    
}

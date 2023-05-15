package maquinadevendadealimentosdofuturo;

public abstract class Produto {
    private String marca;
    private double preco;

    public Produto(String marca, double preco) {
        this.marca = marca;
        this.preco = preco;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    @Override
    public String toString() {
        return "Marca = " + marca + " | valor = R$" + preco;
    }

}

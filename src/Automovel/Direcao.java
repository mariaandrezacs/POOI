
package Automovel;

public class Direcao {
    private String cor;
    private float tamanhoRaio;
    private boolean kitMultimidia;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getTamanhoRaio() {
        return tamanhoRaio;
    }

    public void setTamanhoRaio(float tamanhoRaio) {
        this.tamanhoRaio = tamanhoRaio;
    }

    public boolean isKitMultimidia() {
        return kitMultimidia;
    }

    public void setKitMultimidia(boolean kitMultimidia) {
        this.kitMultimidia = kitMultimidia;
    }

    public Direcao(String cor, float tamanhoRaio, boolean kitMultimidia) {
        this.cor = cor;
        this.tamanhoRaio = tamanhoRaio;
        this.kitMultimidia = kitMultimidia;
    }

    @Override
    public String toString() {
        return "Direcao{" + "cor=" + cor + ", tamanhoRaio=" + tamanhoRaio + ", kitMultimidia=" + kitMultimidia + '}';
    }    
    
}
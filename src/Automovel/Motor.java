
package Automovel;

public class Motor {
    private float potencia;
    private char combustivel;
    private String chassi;

    public float getPotencia() {
        return potencia;
    }

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public char getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(char combustivel) {
        this.combustivel = combustivel;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public Motor(float potencia, char combustivel, String chassi) {
        this.potencia = potencia;
        this.combustivel = combustivel;
        this.chassi = chassi;
    }

    @Override
    public String toString() {
        return "Motor{" + "potencia=" + potencia + ", combustivel=" + combustivel + ", chassi=" + chassi + '}';
    }

}


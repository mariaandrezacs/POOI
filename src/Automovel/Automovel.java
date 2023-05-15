
package Automovel;

public class Automovel {
    String marca;
    String modelo;
    Direcao dir;
    Motor mot;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Direcao getDir() {
        return dir;
    }

    public void setDir(Direcao dir) {
        this.dir = dir;
    }

    public Motor getMot() {
        return mot;
    }

    public void setMot(Motor mot) {
        this.mot = mot;
    }

    public Automovel(String marca, String modelo, Direcao dir, Motor mot) {
        this.marca = marca;
        this.modelo = modelo;
        this.dir = dir;
        this.mot = mot;
    }

    @Override
    public String toString() {
        return "Automovel{" + "marca=" + marca + ", modelo=" + modelo + ", dir=" + dir + ", mot=" + mot + '}';
    }    
}

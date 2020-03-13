package heritage;

/**
 *
 * @author Rafu
 */
public class Car {
    private String marca;
    private String modelo;
    private String cor;
    protected double preco;

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

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "\nMarca=" + marca + "\nModelo=" + modelo + "\nCor=" + cor +"\nPreço=" + preco;
    }
    
}

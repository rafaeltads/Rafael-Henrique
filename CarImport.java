package heritage;

/**
 *
 * @author Rafu
 */
public class CarImport extends Car {
    protected double imposto=30;

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    @Override
    public double getPreco(){
        return preco + (preco*getImposto()/100);
    }

    @Override
    public String toString() {
        return super.toString() + getPreco();
    }
    
}

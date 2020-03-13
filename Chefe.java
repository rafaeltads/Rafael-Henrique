package Polimorfismo;
/**
 *
 * @author Rafu
 */
public class Chefe extends Funca{
    private String secretaria;
    public Chefe(String nome,String cargo,double salario,String secretaria){
        super(nome,cargo,salario);
        this.secretaria=secretaria;
    }

    public String getSecretaria() {
        return secretaria;
    }

    public void setSecretaria(String secretaria) {
        this.secretaria = secretaria;
    }
    @Override
    public void calcularSalario(){
        super.calcularSalario();
        salario = salario+(salario*5/100);
    }
    @Override
    public String toString() {
        return super.toString() + "\nSecretaria=" + secretaria;
    }
    
}

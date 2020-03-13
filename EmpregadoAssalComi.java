package Interface;

/**
 *
 * @author Rafu
 */
public class EmpregadoAssalComi extends EmpregadoComissionado{
    
    private double salarioBase;
    public EmpregadoAssalComi(String primeiro, String ultimo, String cpf, double vendas, double taxa, double salario) {
        super( primeiro, ultimo, cpf, vendas, taxa);
        setSalarioBase( salario );
    } 

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salario) {
       salarioBase = ( salario < 0.0 ) ? 0.0 : salario;
    }
@Override
public double ganhos()
   {
      return getSalarioBase() + super.ganhos();
   }
@Override
   public String toString()
   {
      return String.format( "%s %s; %s: R$%,.2f", 
         "assalariado", super.toString(), 
         "salario base", getSalarioBase() );
   }
}

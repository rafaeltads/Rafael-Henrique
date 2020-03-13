package Interface;

/**
 *
 * @author Rafu
 */
public class EmpregadoAssalariado extends Empregado{
    private double salarioSemanal;
    public EmpregadoAssalariado( String primeiro, String ultimo, String cpf, 
      double salario )
   {
      super( primeiro, ultimo, cpf ); // primeira tarefa de um construtor da subclasse é chamar o construtor da superclasse para inicializar as variáveis
      setSalarioSemanal( salario ); // validate and store salary
   }
public void setSalarioSemanal( double salario )
   {
      salarioSemanal = salario < 0.0 ? 0.0 : salario;
   }
public double getSalarioSemanal()
   {
      return salarioSemanal;
   }
    @Override
    public double ganhos() {
        return getSalarioSemanal();
    }
    @Override
   public String toString()
   {
      return String.format( "empregado assalariado: %s\n%s: $%,.2f", 
         super.toString(), "salario semanal", getSalarioSemanal() );
   }
}

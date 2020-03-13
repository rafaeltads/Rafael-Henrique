package heritage;
/**
 *
 * @author Rafu
 */
public class Especialista extends Medico{
    private String especialidade;
public Especialista()
{
   super();
}
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        
        this.especialidade = especialidade;
    }    

    @Override
    public String toString() {
     return super.toString() + "\nEspecialidade=" + especialidade;
    }
    
}

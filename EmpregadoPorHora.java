package Interface;

/**
 *
 * @author Rafu
 */
public class EmpregadoPorHora extends Empregado{
    private double rendimento;
    private double horas;
    public EmpregadoPorHora(String primeiro, String ultimo, String cpf, double salarioPorHora , double horasTrabalhadas){
    super (primeiro,ultimo,cpf);
    setRendimento(salarioPorHora);
    setHoras(horasTrabalhadas);
    }

    public double getRendimento() {
        return rendimento;
    }

    public void setRendimento(double salarioPorHora) {
        rendimento = (salarioPorHora <0.0) ? 0.0 : salarioPorHora;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horasTrabalhadas) {
        horas = ((horasTrabalhadas >= 0.0) && (horasTrabalhadas <= 168.0)) ? horasTrabalhadas : 0.0;
    }
    @Override
    public double ganhos(){
        if(getHoras() <= 40)
            return getRendimento() * getHoras();
        else
       return 40 * getRendimento() + (getHoras() - 40 ) * getRendimento() * 1.5;
    }

    @Override
    public String toString() {
        return String.format ("Empregado por horas: %s\n%s: R$%,.2f; %s: %, .2f", 
        super.toString(), "Salário por hora", getRendimento(), "Horas trabalhadas", getHoras());
    }
}

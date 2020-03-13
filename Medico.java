package heritage;

/**
 *
 * @author Rafu
 */
public class Medico {
    protected int crm;
    protected String nome;
    protected  int celular;

    public int getCrm() {
        return crm;
    }

    public void setCrm(int crm) {
        this.crm = crm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Medico" + "\nCrm=" + crm + "\nNome=" + nome + "\nCelular=" + celular;
    }
    
}

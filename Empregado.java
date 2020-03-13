package Interface;

/**
 *
 * @author Rafu
 */
public abstract class Empregado {
    private String primeiroNome;
    private String ultimoNome;
    private String cpf;
    public Empregado(String p, String u, String c){
        primeiroNome = p;
        ultimoNome = u;
        cpf = c;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String p) {
        this.primeiroNome = p;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String u) {
        this.ultimoNome = u;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String c) {
        this.cpf = c;
    }
    public abstract double ganhos();

    @Override
    public String toString() {
        return String.format("%s %s\nCPF: %s", getPrimeiroNome(), getUltimoNome(), getCpf());
    }
    
}

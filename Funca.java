package Polimorfismo;
/**
 *
 * @author Rafu
 */
public class Funca {
    private String nome;
    private String cargo;
    protected double salario;
    public Funca(String nome,String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    public void calcularSalario(){
        salario = salario + (salario*10/100);
    }
    @Override
    public String toString() {
        return "Nome: " + nome + "\nCargo: " + cargo + "\nSalario=" + salario;
    }
}

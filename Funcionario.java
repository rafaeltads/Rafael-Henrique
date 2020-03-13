package Aulas;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 */
public class Funcionario extends Object {
    private String primeiroNome;
    private String ultimoNome;
    private static int contador;
    public Funcionario (String primeiro, String ultimo){
        primeiroNome = primeiro;
        ultimoNome = ultimo;
        ++contador;
        JOptionPane.showMessageDialog(null,"Construtor de objetos Funcionários: "+ primeiroNome + " " + ultimoNome);
    }
    protected void Finalize(){
        --contador;
        JOptionPane.showMessageDialog(null, "Finalizador de objeto funcionário: "+ primeiroNome + " "+ultimoNome+"; Contador="+ contador);
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public static int getContador() {
        return contador;
    }

}


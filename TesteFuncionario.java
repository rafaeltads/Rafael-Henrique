package Aulas;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"Funcionários antes da instanciação: "+Funcionario.getContador());
        
        Funcionario e1 = new Funcionario("Joseph","Joestar");
        Funcionario e2 = new Funcionario("Giorno","Giovanna");
        
        e1=null;
        e2=null;
        System.gc();
        JOptionPane.showMessageDialog(null,"Funcionário após System.gc(): " + Funcionario.getContador());
        System.exit(0);
    }
}

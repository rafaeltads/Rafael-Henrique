package Aulas;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 */
public class Estatico
{
    static int variavel = 1;
    private static void soma(){
        variavel = variavel +1;
        JOptionPane.showMessageDialog(null,"O novo valor da variável: "+ variavel);
    }
    public static void chama(){
        Estatico.soma();
    }
}

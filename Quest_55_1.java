package rafu;

import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
/*55. Faça um programa que leia um número e imprima a raiz quadrada caso ele seja
positivo e o seu quadrado caso ele seja negativo.*/
public class Quest_55 {
    public static void main(String[] args) {
        double a;
        a=Double.parseDouble(JOptionPane.showInputDialog("Número:"));
        if(a>0)
            JOptionPane.showMessageDialog(null,"Resultado: "+(Math.sqrt(a)));
        else
            JOptionPane.showMessageDialog(null,"Resultado: "+(Math.pow(a,2)));
    }
}

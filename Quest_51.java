
package rafu;

import javax.swing.JOptionPane;

/**
 *51. Faça um programa que leia um número e imprima se ele é ímpar ou par.
 * @author ALUNO
 */
public class Quest_51 {
    public static void main(String[] args) {
        int a;
        a=Integer.parseInt(JOptionPane.showInputDialog("Número:"));
        if(a%2==0)
            JOptionPane.showMessageDialog(null,a+" é par");
        else
            JOptionPane.showMessageDialog(null,a+" é ímpar");
    }
}

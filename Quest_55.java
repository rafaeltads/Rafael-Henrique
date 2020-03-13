/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafu;

import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
//55. Faça um programa que leia um número e imprima a raiz quadrada caso ele positivo e o seu quadrado caso ele seja negativo.
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

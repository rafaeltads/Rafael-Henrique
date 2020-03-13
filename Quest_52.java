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
//52. Faça um programa que leia um número e imprima se ele é positivo, negativo ou nulo.
public class Quest_52 {
    public static void main(String[] args) {
        int a;
        a=Integer.parseInt(JOptionPane.showInputDialog("Número: "));
        if(a>0)
            JOptionPane.showMessageDialog(null,"Seu número é positivo");
        else
            if(a==0)
                JOptionPane.showMessageDialog(null,"Seu número é nulo");
            else
                JOptionPane.showMessageDialog(null,"Seu número é negativo");
    }
}

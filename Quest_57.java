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
//57. Faça um programa que lei um número e imprima se ele é divisível por 10, por 5, por 2 ou por nenhum destes.
public class Quest_57 {
    public static void main(String[] args) {
        int a;
        a=Integer.parseInt(JOptionPane.showInputDialog("Número: "));
        if(a%10==0)
            JOptionPane.showMessageDialog(null,"Seu número é divisível por 10");
        else
            if(a%5==0)
             JOptionPane.showMessageDialog(null,"Seu número é divisível por 5");
            else
             if(a%2==0)
             JOptionPane.showMessageDialog(null,"Seu número é divisível por 2");
             else
             JOptionPane.showMessageDialog(null,"Seu número não é divisível por 10, ou por 5 ou por 2");
    }
}

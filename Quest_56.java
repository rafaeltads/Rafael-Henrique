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
//56. Faça um programa que leia um números e imprima uma das mensagens: é múltiplo de 3 ou não é múltiplo de 3
public class Quest_56 {
    public static void main(String[] args) {
        int a;
        a=Integer.parseInt(JOptionPane.showInputDialog("Número:"));
        if(a%3==0)
            JOptionPane.showMessageDialog(null,"Seu número é múltiplo de 3");
        else
            JOptionPane.showMessageDialog(null,"Seu número não é múltiplo de 3");

    }
}

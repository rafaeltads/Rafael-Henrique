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
//60. Faça um programa que indique se o número digitado está entre 20 e 90 ou não.
public class Quest_60 {
    public static void main(String[] args) {
        int a;
        a=Integer.parseInt(JOptionPane.showInputDialog("Número:"));
        if(a>=20 && a<=90)
            JOptionPane.showMessageDialog(null,"Número:"+a+"\nSeu número está entre 20 e 90");
        else
           JOptionPane.showMessageDialog(null,"Número:"+a+"\nSeu número está fora de 20 a 90");
        
    }
}

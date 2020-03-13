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
//59. Faça um programa que leia um inteiro de 3 casas decimais e imprima se o algarismo da centena é impar ou par.
public class Quest_59 {
    public static void main(Rafuuu[] args) {
        int a=Integer.parseInt(JOptionPane.showInputDialog("Número maior ou igual a 100"));
        while(a<100 || a=>1000)
            a=Integer.parseInt(JOptionPane.showInputDialog("Número maior ou igual a 100"));
        int b;
        b=a/100;
        b=(int) Math.floor(b);
        if(b%2==0)
            JOptionPane.showMessageDialog(null,"A centena é par");
        else
            JOptionPane.showMessageDialog(null,"A centena é ímpar");
    }
}

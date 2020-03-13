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
 /*54. Faça um programa que leia 2 inteiros e efetue e a adição. Caso o valor somado seja maior que 20, este deverá ser imprimido
somando-se a 8, caso seja menor do que 20 o mesmo deverá ser imprimido subtraindo-se 5.
*/
public class Quest_54 {
    public static void main(String[] args) {
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog("Número:"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Número:"));
        if(a+b>20)
            JOptionPane.showMessageDialog(null,"Somatório: "+(a+b)+"\nResultado: "+(a+b+8));
        else
             JOptionPane.showMessageDialog(null,"Somatório: "+(a+b)+"\nResultado: "+(a+b-5));
    }
  
}

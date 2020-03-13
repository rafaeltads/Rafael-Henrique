/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafu;

import javax.swing.JOptionPane;

/**
 *3. Faça um programa que leia um número inteiro e exiba na tela seu sucessor e seu antecessor.
 * @author ALUNO
 */
public class Quest_1 {
    public static void main(String[] args) {
        int a;
        a=Integer.parseInt(JOptionPane.showInputDialog("Número:"));
        JOptionPane.showMessageDialog(null,(a-1)+" "+a+" "+(a+1));    
    }
}

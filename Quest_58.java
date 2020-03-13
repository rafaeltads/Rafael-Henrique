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
/*58. A prefeitura abriu uma linha de credito para os funcionários estatutários. O valor máximo da prestação não poderá ultrapassar 30%
do salário bruto. Faça um programa que permita ler um salário bruto e o valor da prestação e imprimir se é ou não possível fazer o
empréstimo.*/
public class Quest_58 {
    public static void main(String[] args) {
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog("Salário mensal em R$:"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Prestação mensal em R$:"));
        if(b>(a*30/100))
            JOptionPane.showMessageDialog(null,"Crédtio não aprovado");
        else
            JOptionPane.showMessageDialog(null,"Crédito aprovado");
    }
}

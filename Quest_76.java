/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafu;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 * 76. Faça um programa que leia 3 inteiros (variáveis a, b, c) e efetuar cálculo da equação de segundo grau, 
 * apresentando: as duas raízes, se para os calores informados for possível fazer o cálculo delta; 
 * A mensagem “Não há raízes reais” se não for possível fazer o cálculo delta; e a mensagem “Não é equação de segundo grau” 
 * se a for igual a zero.
 */
public class Quest_76 {
    public static void main(String[] args) {
        int a,b,c,d,delta1,raiz1 = 0,raiz2;
        a=Integer.parseInt(JOptionPane.showInputDialog("Valor de a"));
        while(a==0)
        a=Integer.parseInt(JOptionPane.showInputDialog("Para ser equação de segundo grau a deve ser diferente de 0\nValor de a"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Valor de b"));
        c=Integer.parseInt(JOptionPane.showInputDialog("Valor de c"));
        d=JOptionPane.showConfirmDialog(null,"Sua equação: "+a+"x² + "+b+"x + "+c+"=0 ?");
        while(d==1)
        {
         a=Integer.parseInt(JOptionPane.showInputDialog("Valor de a"));
         while(a==0)
         a=Integer.parseInt(JOptionPane.showInputDialog("Para ser equação de segundo grau a deve ser diferente de 0\nValor de a"));
         b=Integer.parseInt(JOptionPane.showInputDialog("Valor de b"));
         c=Integer.parseInt(JOptionPane.showInputDialog("Valor de c"));
         d=JOptionPane.showConfirmDialog(null,"Sua equação: "+a+"x² + "+b+"x + "+c+"=0 ?");
        }
        delta1=b*b-(4*a*c);
        if(delta1<0)
            JOptionPane.showMessageDialog(null,"Delta: "+delta1+"\nSua equação não possui raízes reais");
        else
        {raiz1=(int) ((-b+(Math.sqrt(delta1)))/2*a);
            raiz2=(int) ((-b-(Math.sqrt(delta1)))/2*a);
            JOptionPane.showMessageDialog(null,"Delta: "+delta1+"\nx': "+raiz1+"\nx'': "+raiz2);}
    }
}

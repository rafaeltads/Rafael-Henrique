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
 /*53. Faça um programa que leia um peso na Terra e o número de um planeta e imprima o valor do seu peso no planeta escolhido.
Gravidades relativas a Terra:
a) 0,37 Mercúrio
b) 0,88 Vênus
c) 0,38 Marte
d) 2,64 Júpiter
e) 1,15 Saturno
f) 1,17 Urano*/
public class Quest_53 {
    public static void main(String[] args) {
        int a,b;
        a=Integer.parseInt(JOptionPane.showInputDialog("Peso:"));
        b=Integer.parseInt(JOptionPane.showInputDialog("Planeta:\n0-Mercúrio\n1-Vênus\n2-Marte\n3-Júpiter\n4-Saturno\n5-Urano"));
        switch (b){
            case 0:
                JOptionPane.showMessageDialog(null,"Peso em Mercúrio: " + a*0.37);
                break;
            case 1:
              JOptionPane.showMessageDialog(null,"Peso em Vênus: " + a*0.88);
                break;
            case 2:
              JOptionPane.showMessageDialog(null,"Peso em Marte: " + a*0.38);
                break;
            case 3:
              JOptionPane.showMessageDialog(null,"Peso em Júpiter: " + a*2.64);
                break;    
            case 4:
              JOptionPane.showMessageDialog(null,"Peso em Saturno: " + a*1.15);
                break;
            case 5:
              JOptionPane.showMessageDialog(null,"Peso em Urano: " + a*1.17);
                break;
}
    }
}
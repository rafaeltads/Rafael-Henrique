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
 * 66. Faça um programa que leia 3 números e armazene-os em 3 variáveis com os 
 * seguintes nomes: maior, intermediário e menor.
 */
public class Quest_66 {
    public static void main(String[] args) {
        int [] a = new int [3];
        int maior = 0,menor=0,inter=0;
        String tudo=null;
        for(int i=0;i<3;i++)
        a[i]=Integer.parseInt(JOptionPane.showInputDialog("Número:"));
        for(int i=0;i<3;i++)
        {
         if(i==0)
         {
          maior=a[i];
          menor=a[i];
         }
         if(a[i]>maior)
         maior=a[i];
         if(a[i]<menor)
         menor=a[i];
        inter=inter+a[i];
        }
        inter=inter-(maior+menor);
        JOptionPane.showMessageDialog(null,"Maior: " +maior+"\nIntermediário: "+inter+"\nmenor: "+menor);
    }
}

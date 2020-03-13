/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafu;

import javax.swing.JOptionPane;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;

/**
 *
 * @author Rafu
 * 71. A turma de programação I, por ter muitos alunos, será dividida em dias de provas. 
 * Decidiu-se dividi-las em 3 grupos. Faça um programa que leia o nome do aluno e imprima a sala onde o mesmo irá fazer a prova:
A – K: sala 101
L – N: sala 102
O –Z: sala 103
 */
public class Quest_71 {
    public static void main(String[] args) {
     String nome = JOptionPane.showInputDialog("nome");
     nome = toLowerCase(nome);
        String salaAK = "abcdefghijk",salaLN="lmn";
        String letraa = nome.substring(0,1);
        System.out.println(letraa);
        if (salaAK.contains(letraa))
            JOptionPane.showMessageDialog(null,nome+", você pertence a sala 101");
        else
            if(salaLN.contains(letraa))
                JOptionPane.showMessageDialog(null,nome+", você pertence a sala 102");
        else
                JOptionPane.showMessageDialog(null,nome+", você pertence a sala 103");
    }
}
    


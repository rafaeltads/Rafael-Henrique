/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafu;

import javax.swing.JOptionPane;

/**
 *4. Faça um programa que leia nome, endereço e telefone e exiba na tela.
 * @author ALUNO
 */
public class Quest_4 {
    public static void main(String[] args) {
        String nome,end,number;
        nome=JOptionPane.showInputDialog("Seu nome:");
        end=JOptionPane.showInputDialog("Sua rua:");
        end=end+", Nª"+JOptionPane.showInputDialog("Número da sua casa:");
        end=end+", "+JOptionPane.showInputDialog("Seu bairro");
        number=JOptionPane.showInputDialog("Seu número de telefone:");
        JOptionPane.showMessageDialog(null,"Nome: "+nome+"\nEndereço: "+end+"\nNúmero de telefone: "+number);
    }
}

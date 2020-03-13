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
public class Cadastro_de_carros {
    public static void main(String[] args) {
        carro c1 = new carro();
        c1.modelo=JOptionPane.showInputDialog("Modelo do carro:");
        c1.ano=Integer.parseInt(JOptionPane.showInputDialog("Ano do carro:"));
        c1.marca=JOptionPane.showInputDialog("Marca do carro:");
        c1.placa=JOptionPane.showInputDialog("Placa do carro:");
        c1.placa=c1.placa.toUpperCase();
        JOptionPane.showMessageDialog(null,"======Dados do carro======\nModelo: "+c1.modelo+"\nAno: "+c1.ano+"\nMarca: "+c1.marca+"\nPlaca: "+c1.placa);
    }
}

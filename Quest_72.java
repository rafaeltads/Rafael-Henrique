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
 * 72. Faça um programa que leia uma quantia em reais e converta para uma das seguintes moedas:
f – franco suíço
l – libra
d – dólar
m – marco alemão
 */
public class Quest_72 {
    public static void main(String[] args) {
        double real;
        real=Double.parseDouble(JOptionPane.showInputDialog("Quantial em real:"));
        String letra = JOptionPane.showInputDialog("Conversão para qual moeda?\nF – franco suíço\nL – libra\nD – dólar\nM – marco alemão");
        switch (letra){
                case "F":
                    double fran = Double.parseDouble(JOptionPane.showInputDialog("Cotação do franco suíço hoje:"));
                    JOptionPane.showMessageDialog(null,"Conversão de real para franco suíço: "+(real/fran));
    break;
                case "L":
                    double lib = Double.parseDouble(JOptionPane.showInputDialog("Cotação da libra hoje:"));
                    JOptionPane.showMessageDialog(null,"Conversão de real para libra: "+(real/lib));
    break;
                case "D":
                    double dol = Double.parseDouble(JOptionPane.showInputDialog("Cotação do dolar hoje:"));
                    JOptionPane.showMessageDialog(null,"Conversão de real para dolar: "+(real/dol));
    break;
                case "M":
                    double mar = Double.parseDouble(JOptionPane.showInputDialog("Cotação do marco alemão hoje:"));
                    JOptionPane.showMessageDialog(null,"Conversão de real para marco alemão: "+(real/mar));
        }
}

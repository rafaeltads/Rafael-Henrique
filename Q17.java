package rafu;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 * 17. Sabendo-se que 100 quilowatts de energia custa um sétimo do salário mínimo, faça um programa que receba o
 * valor de um salário
 * mínimo e a quantidade de quilowatts gasta por uma residência e exiba na tela: O valor em reais de cada quilowatt,
* o valor em reais
* a ser pago e o novo valor a ser pago por essa residência com um desconto de 10%.
 */
public class Q17 {
    public static void main(String[] args) {
    double sal,conta,kw,total;
   sal=Double.parseDouble(JOptionPane.showInputDialog("Salário mínimo:"));
    conta=Double.parseDouble(JOptionPane.showInputDialog("Quilowatts consumidos:"));
    kw=sal/7;
    total=kw*conta/100;
    JOptionPane.showMessageDialog(null,"Sua conta é: "+total);
}
}

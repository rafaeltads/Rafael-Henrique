package rafu;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 * 48. Faça um programa que dado um número de conta corrente com três dígitos, retorne o seu dígito verificador, 
 * o qual é calculado da seguinte forma:
Exemplo: número de conta: 235
A) Somar o número da conta com o seu inverso: 235 + 532 = 767.
B) Multiplicar cada dígito pela sua ordem posicional e somar estes resultados:
i. 7 6 7
C) X 1 2 3
i. 7+12+21=40
D) O último dígito desse resultado é o dígito verificador da conta(40 -> 0).
 */
public class Quest_48 {
    public static void main(String[] args) {
       int a,b,c,d,soma,soma1,b1,c1,d1,e1,dig;
       a=Integer.parseInt(JOptionPane.showInputDialog("Número da conta corrente:"));
       while(a<100 || a>999)
       a=Integer.parseInt(JOptionPane.showInputDialog("Por ,favor digite o número correto: "));
       b=a/100;
       c=a%100;
       c=(int) Math.floor(c/10);
       d=a%((b*100)+(c*10));
        System.out.println(b+" "+c+" "+d);
        soma=a+((d*100)+(c*10)+(b));
        System.out.println(soma);
        b1=soma/100;
        c1=soma%100;
        c1=(int) Math.floor(c1/10);
        d1=(b1*100)+(c1*10);
        e1=soma%d1;
        System.out.println(b1+" "+c1+" "+e1);
        soma1=b1+2*c1+3*e1;
        System.out.println(soma1);
        dig=soma1%10;
        JOptionPane.showMessageDialog(null,"Dígito verificador: "+dig);
    }
}

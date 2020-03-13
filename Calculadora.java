package rafu;

import javax.swing.JOptionPane;

/**
 *
 * @author ALUNO
 */
public class Calculadora {
    public static void main(String[] args) {
        double a,b,resul = 0;
        int loop=0;
        String op;
        while(loop==0){
        a=Double.parseDouble(JOptionPane.showInputDialog("Número:"));
        b=Double.parseDouble(JOptionPane.showInputDialog("Outro número:"));
        op=JOptionPane.showInputDialog("Operação:\n+: soma\n-: subtração\n*: multiplicação\n/: divisão");
        while(!op.equals("+") && !op.equals("-") && !op.equals("*") && !op.equals("/")){
            op=JOptionPane.showInputDialog("Apenas uma das opções abaixo:\n+: soma\n-: subtração\n*: multiplicação\n/: divisão");
        }
        switch (op){
            case "+":
                resul=a+b;
                break;
            case "-":
                resul=a-b;
                break;
            case "*":
                resul=a*b;
                break;
            case "/":
                resul=a/b;
                break;     
        }
                JOptionPane.showMessageDialog(null,"Resultado: "+resul);
        }
    }
  
}

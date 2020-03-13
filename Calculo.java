package rafu;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 */
public class Calculo {
    public static void main(String[] args) {
        String var;
        var=JOptionPane.showInputDialog("Equação:");
        int A = var.length();
        int calc[] = new int[A];
        int resultado = 1;
        for(int i=0;i<A;i++){
            String check;
            check=""+var.charAt(i);
            if("1234567890".contains(check))
            {
                calc[i]=Integer.parseInt(check);
                resultado=resultado*calc[i];
            }
        }
        
    }
    }

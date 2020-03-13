package Rafu;

import javax.swing.JOptionPane;

public class Quest_21 {
    public static void main(String[] args) {
        double lad,perim,diag,area;
        
        lad = Float.parseFloat(JOptionPane.showInputDialog("Entre com o lado do quadrado: "));
        
        perim = lad*4;
        area = lad * lad;
        diag = Math.pow(lad, 2) + Math.pow(lad, 2);
        diag = Math.sqrt(diag);
        
        JOptionPane.showMessageDialog(null,"O perimetro do quadrado é: "+perim);
        JOptionPane.showMessageDialog(null,"A área do quadrado é: "+area+"Cm²");
        JOptionPane.showMessageDialog(null,"A diagonal do quadrado é: "+diag);
        
    }
}
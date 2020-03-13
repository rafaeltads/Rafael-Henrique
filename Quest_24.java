package rafu;

import javax.swing.JOptionPane;

public class Quest_24 {
    public static void main(String[] args) {
        double D,d,area;
        
        D = Double.parseDouble(JOptionPane.showInputDialog("Entre com a Diagonal maior"));
        d = Double.parseDouble(JOptionPane.showInputDialog("Entre com a Diagonal menor"));
        
        area = (D*d)/2;
        
        JOptionPane.showMessageDialog(null,"A área do Losango é: "+area+"cm²");
    }
  
}

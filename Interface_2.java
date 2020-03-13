package Interface;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 */
public class Interface_2 {
    public static void main(String[] args) {
    JetSki A = new JetSki();
    A.casco=JOptionPane.showInputDialog("Casco:");
    A.pressao=Integer.parseInt(JOptionPane.showInputDialog("Pressão:"));
    JOptionPane.showMessageDialog(null,A.toString());
    }   
}
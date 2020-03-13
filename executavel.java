package Interface;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 */
public class executavel {
    public static void main(String[] args) {
        ImplementsInterface A = new ImplementsInterface();
        A.metodo1(Integer.parseInt(JOptionPane.showInputDialog("Idade: ")));
        A.nome=JOptionPane.showInputDialog("Nome:");
        JOptionPane.showMessageDialog(null,"Nome="+ A.metodo3("") + "\nIdade=" + A.metodo2());
    }
}

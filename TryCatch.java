package Aulas;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 */
public class TryCatch {
    public static void main(String[] args) {
        try {
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Money:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("People:"));
            double resul = num1/num2;
            if(num2==0){
                throw new ArithmeticException();
            }
            DecimalFormat duascasas = new DecimalFormat("0.00");
            JOptionPane.showMessageDialog(null,"Quantia: "+duascasas.format(resul));
        } catch (NumberFormatException erro) {
            JOptionPane.showMessageDialog(null,"Digite somente números");
        }
        catch (ArithmeticException erro){
            JOptionPane.showMessageDialog(null,"Impossível dividir por 0");
        }
    }
}

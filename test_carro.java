package heritage;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 */
public class test_carro {
    public static void main(String[] args) {
        CarImport vetor[] = new CarImport[1];
        for(int i=0;i<1;i++){
        vetor[i] = new CarImport();
        vetor[i].setMarca(JOptionPane.showInputDialog("Marca:"));
        vetor[i].setModelo(JOptionPane.showInputDialog("Modelo:"));
        vetor[i].setCor(JOptionPane.showInputDialog("Cor:"));
        vetor[i].setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço:")));
        JOptionPane.showMessageDialog(null,vetor[i].toString());
    }
        Car vetor1[] = new Car[1];
        for(int i=0;i<1;i++){
            vetor1[i] = new Car();
        vetor1[i].setMarca(JOptionPane.showInputDialog("Marca:"));
        vetor1[i].setModelo(JOptionPane.showInputDialog("Modelo:"));
        vetor1[i].setCor(JOptionPane.showInputDialog("Cor:"));
        vetor1[i].setPreco(Double.parseDouble(JOptionPane.showInputDialog("Preço:")));
        JOptionPane.showMessageDialog(null,vetor1[i].toString());
        }
    }
}

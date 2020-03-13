package heritage;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 */
public class test_medico {
    public static void main(String[] args) {
        Especialista[] vetor = new Especialista[3];
        for(int i=0;i<1;i++){
            vetor[i] = new Especialista();
            vetor[i].setNome(JOptionPane.showInputDialog("Nome:"));
            vetor[i].setCrm(Integer.parseInt(JOptionPane.showInputDialog("Crm:")));
            vetor[i].setCelular(Integer.parseInt(JOptionPane.showInputDialog("Celular:")));
            vetor[i].setEspecialidade(JOptionPane.showInputDialog("Epecialidade:"));
            JOptionPane.showMessageDialog(null,vetor[i].toString());
        }
        /*for(int i=0;i<1;i++){
         Medico[] vetor1 = new Medico[3];
         vetor1[i] = new Medico();
         vetor1[i].setNome(JOptionPane.showInputDialog("Nome:"));
         vetor1[i].setCrm(Integer.parseInt(JOptionPane.showInputDialog("Crm:")));
         vetor1[i].setCelular(Integer.parseInt(JOptionPane.showInputDialog("Celular:")));
         JOptionPane.showMessageDialog(null,vetor1[i].toString());
        }*/
    }
}

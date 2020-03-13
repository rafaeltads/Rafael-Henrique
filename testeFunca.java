package Polimorfismo;

import javax.swing.JOptionPane;

/**
 *
 * @author Rafu
 */
public class testeFunca {
    public static void main(String[] args) {
        Funca F[] = new Funca[4];
        F[0] = new Funca ("Jonathan", "Arqueólogo", 1000000);
        F[1] = new Chefe ("Joseph", "Magnata", 10000000,"Suzie Q");
        F[2] = new Funca ("Jotaro", "Biologo", 10000);
        F[3] = new Chefe ("Josuke", "Vagabundo", 5, "Giorno");
        for(int i=0;i<4;i++){
            F[i].calcularSalario();
}
        for(int i=0;i<4;i++){
            JOptionPane.showMessageDialog(null,F[i]);
        }
}
}

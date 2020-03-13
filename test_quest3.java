package Lista_21;

import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 * 3) Criar uma classe executável que instancie quatro objetos do tipo Medicamento 
 * guardando suas referências dentro de um arranjo. A classe não deve ter construtor explicito.
 * Os parâmetros e as variáveis de instância devem ter o mesmo nome. Os campos obrigatórios são 
 * data de fabricação e tempo de validade do medicamento (por exemplo: 2 anos). 
 * O programa deve emitir uma mensagem caso o medicamento esteja vencido.
 * @author Rafu
 */
public class test_quest3 {
    public static void main(String[] args) {
        int val1,val2;
        Quest3 med[] = new Quest3[1];
        for(int i=0;i<1;i++){
            med[i] = new Quest3();
            med[i].setNome(JOptionPane.showInputDialog("Nome do remédio:"));
            med[i].setData(JOptionPane.showInputDialog("Dia de fabricação:"));
            med[i].setData(med[i].getData()+"/"+JOptionPane.showInputDialog("Mês de fabricação: "));
            med[i].setData(med[i].getData()+"/"+JOptionPane.showInputDialog("Ano de fabricação: "));
            GregorianCalendar calendar = new GregorianCalendar();
            int dia = calendar.get(GregorianCalendar.DAY_OF_MONTH);
            int mes = 30*calendar.get(GregorianCalendar.MONTH);
            int ano =365 * calendar.get(GregorianCalendar.YEAR);
            val1= dia + mes + ano;
            val2=Integer.parseInt(med[i].getData().substring(0,2));
            val2=val2+(30*(Integer.parseInt(med[i].getData().substring(3,5))));
            val2=val2+(365*(Integer.parseInt(med[i].getData().substring(6,10))));
            if(val1-val2<=730)
            JOptionPane.showMessageDialog(null,"Remédio: "+med[i].getNome()+"\nData de fabricação: "+med[i].getData()+"\nRemédio ainda está em validade");
            else
            JOptionPane.showMessageDialog(null,"Remédio: "+med[i].getNome()+"\nData de fabricação: "+med[i].getData()+"\nRemédio não está em validade");
  }
    }
}

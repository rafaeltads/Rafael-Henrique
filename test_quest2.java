package Lista_21;

import javax.swing.JOptionPane;

/**
2) Criar uma classe chamada Amigo, com quatro variáveis de instancia. A classe deve estar
encapsulada e através do método toString() somente exibir duas das variáveis. Um dos campos
deve ser a idade e deve ter obrigatoriamente um limite inferior e um limite superior (ex: poderão
ser meus amigos pessoas entre 18 e 60 anos). O objeto não será criado se a idade informada
estiver fora da faixa aceitável para ser amigo A classe deve limitar a idade inferior e superior dos
seus amigos não criando o objeto amigo caso a idade não seja compatível.
* @author Rafu
 */
public class test_quest2 {
    public static void main(String[] args) {
        int idade;
        idade=Integer.parseInt(JOptionPane.showInputDialog("Idade do amigo:"));
        if(idade>15 && idade<65){
        Quest2 amigo = new Quest2();
        amigo.setNome(JOptionPane.showInputDialog("Nome do amigo:"));
        amigo.setApelid(JOptionPane.showInputDialog("Apelido do amigo:"));
        amigo.setEnd(JOptionPane.showInputDialog("Endereço do amigo:"));
        amigo.setIdade(idade);
        JOptionPane.showMessageDialog(null,amigo.toString());}
        else
        JOptionPane.showMessageDialog(null,"Amigo não cabe nos parâmetros");
    }
}

package Lista_21;

import javax.swing.JOptionPane;

/**
 * 1) Crie um programa Java para armazenar dados de clientes (nome, endereço e telefone). Os
dados devem estar protegidos. Evitando assim que eles sejam alterados diretamente, o que só
poderá ser feito por meio de métodos. O programa deverá ter somente o método consultar
dados e não deve ser criado o método toString(). Instancie dois objetos do tipo cliente e não
guarde as referências destes objetos em arranjo. O programa deve ter um método especial para
inicializar as variáveis de instancia dos objetos. Ao concluir o programa responda as seguintes
questões:
a. Qual linha passa os argumentos para o construtor?
b. Qual linha tem o tem o nome do método responsável por executar o programa?
c. Qual linha recebe argumentos?
 * @author Rafu
 */
public class test_ques1 {
    public static void main(String[] args) {
     Quest1 client = new Quest1("JoJo","91 98360117","Morioh");//Construtor recebe dados
     Quest1 client1 = new Quest1("Josuke", "91 924242469","Benevides");
     JOptionPane.showMessageDialog(null,"Cliente: "+client.random()+"\n\nCliente: "+client1.random());//Executa o programa
    

    }
}

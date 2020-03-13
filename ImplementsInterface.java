package Interface;

/**
 *
 * @author Rafu
 */
public class ImplementsInterface implements Interface{
    int idade;
    String nome;
    @Override
    public void metodo1(int i) {
    idade=i;
    }
    @Override
    public int metodo2() {
    return idade;
    }
    @Override
    public String metodo3(String parametro1) {
    return nome;
    } 
}
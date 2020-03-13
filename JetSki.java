package Interface;
/**
 *
 * @author Rafu
 */
public class JetSki implements Canoa, Moto {
    String casco;
    int pressao;
    @Override
    public void setCasco(String c) {
    casco = c;
    }

    @Override
    public String getCasco() {
        return casco;
    }

    @Override
    public void setAcelerador(int r) {
    pressao = r;
    }

    @Override
    public int getAcelerador() {
    return pressao;
    }

    @Override
    public String toString() {
        return "Casco=" + casco + "\nPressao=" + pressao;
    }
    
}
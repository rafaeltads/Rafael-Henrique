package Lista_21;

/**
 *
 * @author Rafu
 */
public class Quest2 {
    String nome, apelid, end;
    int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelid() {
        return apelid;
    }

    public void setApelid(String apelid) {
        this.apelid = apelid;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
 
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Nome= " + getNome() + "\nApelido= " + getApelid() + "\nEndreço= " + getEnd() + "\nIdade= " + getIdade();
    }
    
}

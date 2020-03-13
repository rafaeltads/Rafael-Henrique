package Lista_21;

/**
 *
 * @author Rafu
 */
public class Quest1 {
    private String nome,telefone,end;
    Quest1(String nome, String telefone, String end) {//Recebe o argumento
        this.nome = nome;
        this.telefone = telefone;
        this.end = end;
    }
    public String random(){
        return nome +"\nTelefone: "+ telefone +"\nEndereço: "+ end;
    }
    }
    

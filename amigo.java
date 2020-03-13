/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rafu;

/**
 *
 * @author Rafu
 */
class amigo {
    private String nome;
    private int telefone;
    int idade;

    
    public void jojo(String n){
            nome = n;
    }
    public void digitaidade(int i){
        if(idade>150)
            i=150;
        if(idade<0)
            i=1;
        idade = i;
    }
    public String mostranome()
    {
    return nome;
    }
    public int mostraidade(){
        return idade;
    }
    }

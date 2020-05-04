/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author renan
 */
public class Partida implements Serializable{
    private Usuario user;
    private int pontuacao;
    private String dificuldade;
    
    public Partida(Usuario user,int pontuacao, String dificuldade){
        this.dificuldade = dificuldade;
        this.user = user;
        this.pontuacao = pontuacao;
    }

    public int getPontuacao() {
        return pontuacao;
    }


    public String getDificuldade() {
        return dificuldade;
    }

    public Usuario getUser() {
        return user;
    }
           
    @Override
    public String toString(){
        return this.user.getNome()+ "\t" + this.getPontuacao() + "\t" + this.getDificuldade() + "\t\n";
    }
    
}

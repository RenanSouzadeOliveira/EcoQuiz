/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.Random;

/**
 *
 * @author renan
 */
public class Usuario implements Serializable{
    private String nome;
    
    public Usuario(String nome){
            this.nome = nome;
    }
    public Usuario(){
        Random geradorAleatorio = new Random();
        String user = "Anônimo[" + geradorAleatorio.nextInt() + "]";
        this.nome = user;
    }

    
    public String getNome() {
        return nome;
    }
    
    @Override
    public String toString(){
        return this.getNome();
    }
}

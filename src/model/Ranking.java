/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author renan
 */
public class Ranking{
    private ArrayList<Partida> partida = new ArrayList<Partida>();
    
    public ArrayList<Partida> getPartida() {
        return partida;
    }    
    
    
    public Ranking(ArrayList<Partida> quiz){
        this.partida = quiz;
    }
    
    @Override
    public String toString(){
        return this.partida.toString();
        
    }

    
    
    
}

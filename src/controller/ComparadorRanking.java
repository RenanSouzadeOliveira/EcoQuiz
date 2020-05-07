/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Comparator;
import model.Partida;

/**
 *
 * @author renan
 */
public class ComparadorRanking implements Comparator<Partida> {
    
    
    @Override
    public int compare(Partida partida1, Partida partida2){
        if(partida2.getPontuacao() == partida1.getPontuacao()){
            return 0;
        } 
        
        if(partida2.getPontuacao() > partida1.getPontuacao()){
            return 1;
        } else {
            return -1;
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Partida;



/**
 *
 * @author renan
 */
public class LerPartida {
    
    
     public static ArrayList<Partida> lerRanking(ArrayList list, String dificuldade) throws FileNotFoundException, IOException, ClassNotFoundException{
         ObjectInputStream k; // "ObjectInputStream desserializa dados e objetos escritos anteriormente com o ObjectOutputStream
         String arquivo; // Caminho do arquivo
         arquivo = verificaDificuldade(dificuldade);
         try{
            k = new ObjectInputStream(new FileInputStream(arquivo));      
            list = (ArrayList<Partida>) k.readObject();
            k.close();
         } catch(FileNotFoundException e){
            JOptionPane.showMessageDialog(null,"Não foi possível gerar um ranking, tente jogar uma partida primeiro","Erro",JOptionPane.ERROR_MESSAGE); 
         }
         
      return list;
    }
     
    protected static String verificaDificuldade(String dificuldade){
        //Retorna o arquivo do ranking para cada dificuldade;
        String nomeArquivo="";
        if(dificuldade.equals("Novato")){
            nomeArquivo = "ranknovato.dat";
        } else if (dificuldade.equals("Normal")){
            nomeArquivo = "ranknormal.dat";
        } else{
            nomeArquivo = "rankhard.dat";
        }
        return nomeArquivo;
    }
    
   
    
}

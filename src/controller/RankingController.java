/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Partida;
import model.Ranking;

/**
 *
 * @author renan
 */
public class RankingController {
    public static void gravarPartida(Partida quiz) throws FileNotFoundException, IOException, ClassNotFoundException{
      ArrayList<Partida> ranking = new ArrayList<Partida>();
      File file;
      if(quiz.getDificuldade().equals("Novato")){
           file = new File("ranknovato.dat");
      } else if(quiz.getDificuldade().equals("Normal")){
           file = new File("ranknormal.dat");
      } else{
           file = new File("rankhard.dat");
      }
      if(file.exists() && file.length() != 0){          
           ranking = lerRanking(ranking,quiz.getDificuldade());
           ranking.add(quiz);
      } else{
          ranking.add(quiz);
      }
      System.out.println(ranking);
      ObjectOutputStream r = new ObjectOutputStream(new FileOutputStream(file));
      r.writeObject(ranking);
      r.close();
      }
    
     public static ArrayList<Partida> lerRanking(ArrayList list, String dificuldade) throws FileNotFoundException, IOException, ClassNotFoundException{
         ObjectInputStream k;
         if(dificuldade.equals("Novato")){
             k = new ObjectInputStream(new FileInputStream("ranknovato.dat"));
         } else if(dificuldade.equals("Normal")){
             k = new ObjectInputStream(new FileInputStream("ranknormal.dat"));
         } else {
             k = new ObjectInputStream(new FileInputStream("rankhard.dat"));
         }
      list = (ArrayList<Partida>) k.readObject();
      k.close();
      return list;
    }
}

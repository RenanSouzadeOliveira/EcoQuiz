/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.LerPartida.lerRanking;
import static controller.LerPartida.verificaDificuldade;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import model.Partida;

/**
 *
 * @author renan
 */
public class GravarPartida {
    public static void gravarPartida(Partida quiz) throws FileNotFoundException, IOException, ClassNotFoundException{
      ArrayList<Partida> ranking = new ArrayList<Partida>();// recebe o ranking
      String arquivo; // caminho do arquivo do ranking
      arquivo = verificaDificuldade(quiz.getDificuldade()); // retorna o caminho para o arquivo do rankinh correto
      File file;
      file = new File(arquivo);// abrindo o arquivo do ranking
      if(verificaConteudo(file) == false){
          ranking = lerRanking(ranking,quiz.getDificuldade());
          ranking.add(quiz);
      } else {
          ranking.add(quiz);
      }
      ObjectOutputStream r = new ObjectOutputStream(new FileOutputStream(file));
      r.writeObject(ranking);
      r.close();
      }
    
     private static boolean verificaConteudo(File file){
        //verifica se o arquivo existe e se é nulo ou não.
        if(file.exists() && file.length() != 0){
            return false;
        } else{
            return true;
        }
    }
}

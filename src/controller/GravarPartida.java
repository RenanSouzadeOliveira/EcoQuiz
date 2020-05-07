/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.LerRanking.lerRanking;
import static controller.LerRanking.verificaDificuldade;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Partida;
import view.JFPrincipal;

/**
 *
 * @author renan
 */
public class GravarPartida {
    public static void gravarPartida(Partida quiz){
      ArrayList<Partida> ranking = new ArrayList<Partida>();// recebe o ranking      
      String arquivo; // caminho do arquivo do ranking
      
      arquivo = verificaDificuldade(quiz.getDificuldade()); // verificando qual ranking deverá ser aberto
      File file = new File(arquivo); // Instanciando o arquvio
      try{
          // abrindo o arquivo do ranking
          if(verificaConteudo(file) == false){
            ranking = lerRanking(ranking,quiz.getDificuldade()); // lendo o ranking ja existente
            ranking.add(quiz);// adicionando a nova partida caso ja exista um ranking
          } else {
            ranking.add(quiz);// adicionando partida caso não exista um ranking
          }
          ObjectOutputStream r = new ObjectOutputStream(new FileOutputStream(file));// ObjectOutPutStream permite gravar o objeto, podendo 'reconstruilo' com o ObjectInputStream
          r.writeObject(ranking); // gravando o arrayList
          r.close(); 
      } catch(FileNotFoundException e){
          JOptionPane.showMessageDialog(null,"Ops, tivemos um erro, tente novamente","Erro",JOptionPane.ERROR_MESSAGE);
          System.exit(0);
      } catch(IOException e){
          JOptionPane.showMessageDialog(null,"Ops, tivemos um erro, tente novamente","Erro",JOptionPane.ERROR_MESSAGE);
          System.exit(0);
      }
      
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

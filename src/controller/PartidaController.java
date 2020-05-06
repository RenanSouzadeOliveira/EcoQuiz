/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static controller.GravarPartida.gravarPartida;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import model.Partida;
import model.Usuario;

/**
 *
 * @author renan
 */
public class PartidaController {
    
    public static boolean validarResposta(String alternativa){
        boolean statusResposta = false;
        String caminho = "src/controller/respostas.txt";
        String conteudo;
        String resposta="";
        int i = 0;
      try(
          FileReader arq = new FileReader(caminho);
          BufferedReader lerArq = new BufferedReader(arq);
         ){
                while(i< 20){
                    resposta = lerArq.readLine();
                    if(resposta.equals(alternativa)){
                        statusResposta = true;
                    }
                    i++;
                }
            
          
      } catch(IOException e){
          e.printStackTrace();
      }
      return statusResposta;
    }
    
    public static void gerarPartida(String nome, String dificuldade, int pontuacao) throws IOException, FileNotFoundException, ClassNotFoundException{
        Usuario player;
        if(nome.equals("")){
            player = new Usuario();
        } else {
            player = new Usuario(nome);
        }       
        Partida quiz = new Partida(player,pontuacao,dificuldade);
        gravarPartida(quiz);
    }
    
       
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JButton;

/**
 *
 * @author renan
 */
public class Validacoes {
    public static boolean validarResposta(String Resposta){
        if (Resposta.equals("Solar")){
            return true;
        }
        return false;
    }
    
    public static boolean ler(String caminho, String alternativa){
        boolean statusResposta = false;
        String conteudo;
        String resposta="";
        int i = 0;
      try(
          FileReader arq = new FileReader(caminho);
          BufferedReader lerArq = new BufferedReader(arq);
         ){
                while(i< 4){
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
}

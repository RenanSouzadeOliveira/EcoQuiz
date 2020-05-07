/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Novato;


import static controller.PartidaController.gerarPartida;
import static controller.PartidaController.validarResposta;
import java.awt.Cursor;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import view.JFPrincipal;

/**
 *
 * @author renan
 */
public class JFNovato9 extends javax.swing.JFrame {
    String user;
    int pontuacao;
    String dificuldade;
    Timer timer = new Timer();
    /**
     * Creates new form JFPrincipal
     */
    public JFNovato9(String nome, int pontuacao, String dificuldade) {
        initComponents();
        this.setLocationRelativeTo(null); // Centralizando JFRAME
        
        // Inserindo Logo
        ImageIcon icon = new ImageIcon("src/view/imagens/l.png");
        icon.setImage(icon.getImage().getScaledInstance(100, 100, 1));
        lblIconP.setIcon(icon);
        //Recebendo o nome do user e a pontuação da tela anterior
        this.user = nome;
        this.pontuacao = pontuacao;
        this.dificuldade = dificuldade;
        
        //Exibindo pontuacao
        lblPontuacao.setText("Pontuação: " + Integer.toString(pontuacao));
         TimerTask task = new TimerTask(){
            int tempo = 25;
            public void run(){
                tempo -= 1;
                lblCronometro.setText(Integer.toString(tempo));
                if (tempo == 0){
                    JOptionPane.showMessageDialog(null, "Parabéns: " + user + "\n" +
                    "Dificuldade: " + dificuldade + "\n" + 
                    "Pontuação: " + pontuacao);
                    gerarPartida(user,dificuldade,pontuacao);
                    JFPrincipal next = new JFPrincipal();
                    next.setVisible(true);
                    timer.cancel();
                    dispose();
                    
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1000, 1000);
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPPrincipal = new javax.swing.JPanel();
        lblEnunciado = new javax.swing.JLabel();
        JBResposta0 = new javax.swing.JButton();
        JBResposta1 = new javax.swing.JButton();
        JBResposta2 = new javax.swing.JButton();
        JBResposta3 = new javax.swing.JButton();
        lblEnunciado1 = new javax.swing.JLabel();
        lblPontuacao = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        lblCronometro = new javax.swing.JLabel();
        JPLogo = new javax.swing.JPanel();
        lblIconP = new javax.swing.JLabel();
        lblFechar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        JPPrincipal.setBackground(new java.awt.Color(144, 202, 249));

        lblEnunciado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEnunciado.setForeground(new java.awt.Color(255, 255, 255));
        lblEnunciado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnunciado.setText("ou impede o desenvolvimento da outra:");

        JBResposta0.setBackground(new java.awt.Color(128, 222, 234));
        JBResposta0.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        JBResposta0.setText("Comensalismo");
        JBResposta0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBResposta0ActionPerformed(evt);
            }
        });

        JBResposta1.setBackground(new java.awt.Color(128, 222, 234));
        JBResposta1.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        JBResposta1.setText("Amensalismo");
        JBResposta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBResposta1ActionPerformed(evt);
            }
        });

        JBResposta2.setBackground(new java.awt.Color(128, 222, 234));
        JBResposta2.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        JBResposta2.setText("Competição");
        JBResposta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBResposta2ActionPerformed(evt);
            }
        });

        JBResposta3.setBackground(new java.awt.Color(128, 222, 234));
        JBResposta3.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        JBResposta3.setText("Predação");
        JBResposta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBResposta3ActionPerformed(evt);
            }
        });

        lblEnunciado1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEnunciado1.setForeground(new java.awt.Color(255, 255, 255));
        lblEnunciado1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEnunciado1.setText("Relação ecológica entre duas espécies em que uma inibe");

        lblPontuacao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPontuacao.setForeground(new java.awt.Color(255, 255, 255));
        lblPontuacao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPontuacao.setText("Pontuação:");

        lblTempo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTempo.setForeground(new java.awt.Color(255, 255, 255));
        lblTempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTempo.setText("Tempo:");

        lblCronometro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCronometro.setForeground(new java.awt.Color(255, 255, 255));
        lblCronometro.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCronometro.setText("25");

        javax.swing.GroupLayout JPPrincipalLayout = new javax.swing.GroupLayout(JPPrincipal);
        JPPrincipal.setLayout(JPPrincipalLayout);
        JPPrincipalLayout.setHorizontalGroup(
            JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEnunciado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEnunciado1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
                    .addGroup(JPPrincipalLayout.createSequentialGroup()
                        .addComponent(lblTempo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblCronometro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JBResposta0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBResposta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBResposta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBResposta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        JPPrincipalLayout.setVerticalGroup(
            JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPrincipalLayout.createSequentialGroup()
                .addComponent(lblEnunciado1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBResposta0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBResposta1)
                .addGap(12, 12, 12)
                .addComponent(JBResposta3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCronometro, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE)
                        .addComponent(JBResposta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblTempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        JPLogo.setBackground(new java.awt.Color(187, 222, 251));

        lblIconP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblFechar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblFechar.setForeground(new java.awt.Color(13, 71, 161));
        lblFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechar.setText(" X");
        lblFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblFecharMouseEntered(evt);
            }
        });

        lblMinimizar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblMinimizar.setForeground(new java.awt.Color(13, 71, 161));
        lblMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMinimizar.setText(" -");
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout JPLogoLayout = new javax.swing.GroupLayout(JPLogo);
        JPLogo.setLayout(JPLogoLayout);
        JPLogoLayout.setHorizontalGroup(
            JPLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPLogoLayout.createSequentialGroup()
                .addComponent(lblIconP, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPLogoLayout.setVerticalGroup(
            JPLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPLogoLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(JPLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIconP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMinimizar, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                        .addComponent(lblFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(JPLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Ao Clicar no lblFechar a aplicação é encerrada
    private void lblFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseClicked
       System.exit(0);
    }//GEN-LAST:event_lblFecharMouseClicked
    //Mudando o Cursor ao passar pelo lblFechar
    private void lblFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseEntered
        lblFechar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblFecharMouseEntered
    //Ao clicar na label minimizar a janela é minimizada
    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(JFNovato9.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked
    //Ao passar o mouse sobre a label Minimizar ele é alterado.
    private void lblMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseEntered
        lblMinimizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblMinimizarMouseEntered
    // VERIFICANDO SE A RESPOSTA É A CORRETA;
    private void JBResposta0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBResposta0ActionPerformed
           if(validarResposta(JBResposta0.getText()) == true){
            pontuacao += Integer.parseInt(lblCronometro.getText());
           }
           JOptionPane.showMessageDialog(null, "Parabéns: " + this.user + "\n" +
                   "Dificuldade: " + this.dificuldade + "\n" + 
                   "Pontuação: " + this.pontuacao);
           JFPrincipal next = new JFPrincipal();
           next.setVisible(true);
           timer.cancel();
           dispose();
           gerarPartida(user,dificuldade,pontuacao);
            
    }//GEN-LAST:event_JBResposta0ActionPerformed

    private void JBResposta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBResposta1ActionPerformed
            if(validarResposta(JBResposta1.getText()) == true){
                pontuacao += Integer.parseInt(lblCronometro.getText());
            }
            JOptionPane.showMessageDialog(null, "Parabéns: " + this.user + "\n" +
                   "Dificuldade: " + this.dificuldade + "\n" + 
                   "Pontuação: " + this.pontuacao);
            JFPrincipal next = new JFPrincipal();
            next.setVisible(true);
            timer.cancel();
            dispose();
            gerarPartida(user,dificuldade,pontuacao);
    }//GEN-LAST:event_JBResposta1ActionPerformed

    private void JBResposta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBResposta2ActionPerformed
            if(validarResposta(JBResposta2.getText()) == true){
                pontuacao += Integer.parseInt(lblCronometro.getText());
            }
            JOptionPane.showMessageDialog(null, "Parabéns: " + this.user + "\n" +
                   "Dificuldade: " + this.dificuldade + "\n" + 
                   "Pontuação: " + this.pontuacao);
            JFPrincipal next = new JFPrincipal();
            next.setVisible(true);
            timer.cancel();
            dispose();
            gerarPartida(user,dificuldade,pontuacao);
    }//GEN-LAST:event_JBResposta2ActionPerformed

    
    private void JBResposta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBResposta3ActionPerformed
       if(validarResposta(JBResposta3.getText()) == true){
           pontuacao += Integer.parseInt(lblCronometro.getText());
       }
           JOptionPane.showMessageDialog(null, "Parabéns: " + this.user + "\n" +
                   "Dificuldade: " + this.dificuldade + "\n" + 
                   "Pontuação: " + this.pontuacao);
           JFPrincipal next = new JFPrincipal();
           next.setVisible(true);
           timer.cancel();
           dispose();
           gerarPartida(user,dificuldade,pontuacao);
    }//GEN-LAST:event_JBResposta3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBResposta0;
    private javax.swing.JButton JBResposta1;
    private javax.swing.JButton JBResposta2;
    private javax.swing.JButton JBResposta3;
    private javax.swing.JPanel JPLogo;
    private javax.swing.JPanel JPPrincipal;
    private javax.swing.JLabel lblCronometro;
    private javax.swing.JLabel lblEnunciado;
    private javax.swing.JLabel lblEnunciado1;
    private javax.swing.JLabel lblFechar;
    private javax.swing.JLabel lblIconP;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblPontuacao;
    private javax.swing.JLabel lblTempo;
    // End of variables declaration//GEN-END:variables
}

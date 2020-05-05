/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.Normal;

import static controller.PartidaController.validarResposta;
import java.awt.Cursor;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import view.Novato.JFNovato1;

/**
 *
 * @author renan
 */
public class JFNormal0 extends javax.swing.JFrame {
    String user;
    int pontuacao;
    String dificuldade;
    Timer timer = new Timer();
    /**
     * Creates new form JFNormal0
     */
    public JFNormal0(String nome, int pontuacao, String dificuldade) {
        initComponents();
        this.setLocationRelativeTo(null);
        
        ImageIcon icon = new ImageIcon("src/view/imagens/l.png");
        icon.setImage(icon.getImage().getScaledInstance(100, 100, 1));
        lblLogo.setIcon(icon);
        
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
                    JFNormal1 next = new JFNormal1(user,pontuacao,dificuldade);
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

        JPLogo = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblFechar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        JPPrincipal = new javax.swing.JPanel();
        lblPergunta = new javax.swing.JLabel();
        lblPergunta1 = new javax.swing.JLabel();
        JBResposta0 = new javax.swing.JButton();
        JBResposta1 = new javax.swing.JButton();
        JBResposta3 = new javax.swing.JButton();
        JBResposta2 = new javax.swing.JButton();
        lblPontuacao = new javax.swing.JLabel();
        lblTempo = new javax.swing.JLabel();
        lblCronometro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        JPLogo.setBackground(new java.awt.Color(187, 222, 251));

        lblFechar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblFechar.setForeground(new java.awt.Color(13, 71, 161));
        lblFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFechar.setText("X");
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
        lblMinimizar.setText("-");
        lblMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMinimizarMouseEntered(evt);
            }
        });

        JPPrincipal.setBackground(new java.awt.Color(144, 202, 249));

        lblPergunta.setFont(new java.awt.Font("Arial", 1, 13)); // NOI18N
        lblPergunta.setForeground(new java.awt.Color(255, 255, 255));
        lblPergunta.setText("É o termo empregado para designar a deterioração das condições ");

        lblPergunta1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPergunta1.setForeground(new java.awt.Color(255, 255, 255));
        lblPergunta1.setText("físicas, químicas e biológicas de um ecossistema:");

        JBResposta0.setText("Poluição Ambiental");
        JBResposta0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBResposta0ActionPerformed(evt);
            }
        });

        JBResposta1.setText("Aquecimento Global");
        JBResposta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBResposta1ActionPerformed(evt);
            }
        });

        JBResposta3.setText("Poluentes Aquáticos");
        JBResposta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBResposta3ActionPerformed(evt);
            }
        });

        JBResposta2.setText("Poluentes Atmosféricos");
        JBResposta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBResposta2ActionPerformed(evt);
            }
        });

        lblPontuacao.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblPontuacao.setForeground(new java.awt.Color(255, 255, 255));
        lblPontuacao.setText("Pontuação:");

        lblTempo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTempo.setForeground(new java.awt.Color(255, 255, 255));
        lblTempo.setText("Tempo:");

        lblCronometro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCronometro.setForeground(new java.awt.Color(255, 255, 255));
        lblCronometro.setText("15");

        javax.swing.GroupLayout JPPrincipalLayout = new javax.swing.GroupLayout(JPPrincipal);
        JPPrincipal.setLayout(JPPrincipalLayout);
        JPPrincipalLayout.setHorizontalGroup(
            JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPrincipalLayout.createSequentialGroup()
                .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblPergunta))
                    .addGroup(JPPrincipalLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblPergunta1)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTempo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblCronometro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBResposta2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBResposta1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBResposta0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBResposta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addComponent(lblPontuacao, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        JPPrincipalLayout.setVerticalGroup(
            JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPergunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPergunta1)
                .addGap(18, 18, 18)
                .addComponent(JBResposta0)
                .addGap(16, 16, 16)
                .addComponent(JBResposta1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBResposta2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPPrincipalLayout.createSequentialGroup()
                        .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPontuacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JBResposta3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTempo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblCronometro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout JPLogoLayout = new javax.swing.GroupLayout(JPLogo);
        JPLogo.setLayout(JPLogoLayout);
        JPLogoLayout.setHorizontalGroup(
            JPLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPLogoLayout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(JPPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPLogoLayout.setVerticalGroup(
            JPLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPLogoLayout.createSequentialGroup()
                .addGroup(JPLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMinimizar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JPPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPLogo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblFecharMouseClicked

    private void lblFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFecharMouseEntered
        lblFechar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblFecharMouseEntered

    private void lblMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseClicked
        this.setState(JFNormal0.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked

    private void lblMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseEntered
        lblMinimizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblMinimizarMouseEntered

    private void JBResposta0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBResposta0ActionPerformed
        if(validarResposta(JBResposta0.getText()) == true){
            pontuacao += Integer.parseInt(lblCronometro.getText());
           }
           JFNormal1 next = new JFNormal1(user,pontuacao,dificuldade);
           next.setVisible(true);
           timer.cancel();
           dispose();
    }//GEN-LAST:event_JBResposta0ActionPerformed

    private void JBResposta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBResposta1ActionPerformed
        if(validarResposta(JBResposta1.getText()) == true){
                pontuacao += Integer.parseInt(lblCronometro.getText());
            }
            JFNormal1 next = new JFNormal1(user,pontuacao,dificuldade);
            next.setVisible(true);
            timer.cancel();
            dispose();
    }//GEN-LAST:event_JBResposta1ActionPerformed

    private void JBResposta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBResposta3ActionPerformed
       if(validarResposta(JBResposta3.getText()) == true){
           pontuacao += Integer.parseInt(lblCronometro.getText());
       }
           JFNormal1 next = new JFNormal1(user,pontuacao,dificuldade);
           next.setVisible(true);
           timer.cancel();
           dispose();
    }//GEN-LAST:event_JBResposta3ActionPerformed

    private void JBResposta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBResposta2ActionPerformed
        if(validarResposta(JBResposta2.getText()) == true){
                pontuacao += Integer.parseInt(lblCronometro.getText());
            }
            JFNormal1 next = new JFNormal1(user,pontuacao,dificuldade);
            next.setVisible(true);
            timer.cancel();
            dispose();
    }//GEN-LAST:event_JBResposta2ActionPerformed

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
            java.util.logging.Logger.getLogger(JFNormal0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFNormal0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFNormal0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFNormal0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFNormal0().setVisible(true);
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
    private javax.swing.JLabel lblFechar;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblPergunta;
    private javax.swing.JLabel lblPergunta1;
    private javax.swing.JLabel lblPontuacao;
    private javax.swing.JLabel lblTempo;
    // End of variables declaration//GEN-END:variables
}

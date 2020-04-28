/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Cursor;
import javax.swing.ImageIcon;

/**
 *
 * @author renan
 */
public class JFDificulty extends javax.swing.JFrame {

    /**
     * Creates new form JFPrincipal
     */
    public JFDificulty() {
        initComponents();
        this.setLocationRelativeTo(null); // Centralizando JFRAME
        
        // Inserindo Logo
        ImageIcon icon = new ImageIcon("src/view/imagens/l.png");
        icon.setImage(icon.getImage().getScaledInstance(100, 100, 1));
        lblIconP.setIcon(icon);
        
        ImageIcon seta = new ImageIcon("src/view/imagens/setaEsquerda.png");
        seta.setImage(seta.getImage().getScaledInstance(35, 35, 1));
        lblVoltar.setIcon(seta);
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
        lblEscolhaDificuldade = new javax.swing.JLabel();
        JBNovato = new javax.swing.JButton();
        JBNormal = new javax.swing.JButton();
        JBEspecialista = new javax.swing.JButton();
        JBGenio = new javax.swing.JButton();
        JBCranio = new javax.swing.JButton();
        JPLogo = new javax.swing.JPanel();
        lblIconP = new javax.swing.JLabel();
        lblFechar = new javax.swing.JLabel();
        lblMinimizar = new javax.swing.JLabel();
        lblVoltar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        JPPrincipal.setBackground(new java.awt.Color(144, 202, 249));

        lblEscolhaDificuldade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblEscolhaDificuldade.setForeground(new java.awt.Color(255, 255, 255));
        lblEscolhaDificuldade.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEscolhaDificuldade.setText("Escolha a Dificuldade que deseja jogar:");

        JBNovato.setBackground(new java.awt.Color(128, 222, 234));
        JBNovato.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        JBNovato.setText("Novato");
        JBNovato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBNovatoActionPerformed(evt);
            }
        });

        JBNormal.setBackground(new java.awt.Color(128, 222, 234));
        JBNormal.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        JBNormal.setText("Normal");

        JBEspecialista.setBackground(new java.awt.Color(128, 222, 234));
        JBEspecialista.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        JBEspecialista.setText("Especialista");

        JBGenio.setBackground(new java.awt.Color(128, 222, 234));
        JBGenio.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        JBGenio.setText("Gênio");

        JBCranio.setBackground(new java.awt.Color(128, 222, 234));
        JBCranio.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        JBCranio.setText("Crânio");

        javax.swing.GroupLayout JPPrincipalLayout = new javax.swing.GroupLayout(JPPrincipal);
        JPPrincipal.setLayout(JPPrincipalLayout);
        JPPrincipalLayout.setHorizontalGroup(
            JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEscolhaDificuldade, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE)
            .addGroup(JPPrincipalLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBEspecialista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBCranio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBGenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBNormal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBNovato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPPrincipalLayout.setVerticalGroup(
            JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPrincipalLayout.createSequentialGroup()
                .addComponent(lblEscolhaDificuldade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(JBNovato)
                .addGap(11, 11, 11)
                .addComponent(JBNormal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBEspecialista)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBGenio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBCranio)
                .addContainerGap(25, Short.MAX_VALUE))
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

        lblVoltar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVoltarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVoltarMouseEntered(evt);
            }
        });

        javax.swing.GroupLayout JPLogoLayout = new javax.swing.GroupLayout(JPLogo);
        JPLogo.setLayout(JPLogoLayout);
        JPLogoLayout.setHorizontalGroup(
            JPLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPLogoLayout.createSequentialGroup()
                .addComponent(lblIconP, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblVoltar)
                .addGap(10, 10, 10)
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
                        .addComponent(lblFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblVoltar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
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
        this.setState(JFDificulty.ICONIFIED);
    }//GEN-LAST:event_lblMinimizarMouseClicked
    //Ao passar o mouse sobre a label Minimizar ele é alterado.
    private void lblMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMinimizarMouseEntered
        lblMinimizar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblMinimizarMouseEntered
    //Ao clickar na label volta para a home
    private void lblVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMouseClicked
        JFPrincipal voltar = new JFPrincipal();
        voltar.setVisible(true);
        dispose();
    }//GEN-LAST:event_lblVoltarMouseClicked
    // Ao passar o mouse sobre a label altera o cursor;
    private void lblVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVoltarMouseEntered
        lblVoltar.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lblVoltarMouseEntered

    private void JBNovatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBNovatoActionPerformed
        JFNovato0 fase0 = new JFNovato0 ();
        fase0.setVisible(true);
        dispose();
    }//GEN-LAST:event_JBNovatoActionPerformed

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
    private javax.swing.JButton JBCranio;
    private javax.swing.JButton JBEspecialista;
    private javax.swing.JButton JBGenio;
    private javax.swing.JButton JBNormal;
    private javax.swing.JButton JBNovato;
    private javax.swing.JPanel JPLogo;
    private javax.swing.JPanel JPPrincipal;
    private javax.swing.JLabel lblEscolhaDificuldade;
    private javax.swing.JLabel lblFechar;
    private javax.swing.JLabel lblIconP;
    private javax.swing.JLabel lblMinimizar;
    private javax.swing.JLabel lblVoltar;
    // End of variables declaration//GEN-END:variables
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacao;

import DAO.GatoDAO;
import DTO.GatoDTO;
import java.awt.FontFormatException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dsm2
 */
public class PaginaInicial extends javax.swing.JFrame {

    /**
     * Creates new form PaginaInicial
     */
    public PaginaInicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel13 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JLabel();
        btnEst = new javax.swing.JLabel();
        btnCfg = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnPerfil = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pagina Inicial");
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/homeClicked.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeClicked(evt);
            }
        });

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/cadastroNotClicked.png"))); // NOI18N
        btnCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCadastroMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCadastroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCadastroMouseExited(evt);
            }
        });

        btnEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/estatisticasNotClicked.png"))); // NOI18N
        btnEst.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstMouseExited(evt);
            }
        });

        btnCfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/configuraçaoNotClicked.png"))); // NOI18N
        btnCfg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCfgMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCfgMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCfgMouseExited(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(153, 255, 153));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo_branca(1) 1(2).png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/RelatorionotClicked.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnEst, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCfg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnCadastro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(50, 50, 50)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addContainerGap())))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel7)
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(btnCadastro)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(btnEst)
                .addGap(18, 18, 18)
                .addComponent(btnCfg)
                .addContainerGap(452, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 1080));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1646, 0, 290, 1080));

        jPanel12.setBackground(new java.awt.Color(13, 13, 14));
        jPanel12.setPreferredSize(new java.awt.Dimension(1191, 1080));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Bem vindo de volta,");
        jPanel12.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 610, 110));

        jLabel32.setBackground(new java.awt.Color(255, 191, 27));
        jLabel32.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 191, 27));
        jLabel32.setText("Bernardo");
        jPanel12.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 90, 280, 110));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/unsplash_CEx86maLUSc-removebg-preview 1.png"))); // NOI18N
        jPanel12.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 530, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Group 20.png"))); // NOI18N
        jPanel12.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 760, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/unsplash_CEx86maLUSc-removebg-preview 1.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel12.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 530, -1, -1));

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/RelatorionotClicked.png"))); // NOI18N
        btnPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPerfilMouseExited(evt);
            }
        });
        jPanel12.add(btnPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(-390, 390, 372, -1));
        jPanel12.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, -1, -1));

        jLabel8.setText("jLabel8");
        jPanel12.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        getContentPane().add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 0, 1270, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCfgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCfgMouseExited
        // TODO add your handling code here:

        btnCfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/configuraçaoNotClicked.png")));
    }//GEN-LAST:event_btnCfgMouseExited

    private void btnCfgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCfgMouseEntered
        // TODO add your handling code here:

        btnCfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/configuraçao.png")));
    }//GEN-LAST:event_btnCfgMouseEntered

    private void btnCfgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCfgMouseClicked
        // TODO add your handling code here:
        dispose();
        Config conf = new Config();
        conf.setVisible(true);
       
    }//GEN-LAST:event_btnCfgMouseClicked

    private void btnEstMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstMouseExited
        // TODO add your handling code here:

        btnEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/estatisticasNotClicked.png")));
    }//GEN-LAST:event_btnEstMouseExited

    private void btnEstMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstMouseEntered
        // TODO add your handling code here:

        btnEst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/estatisticasClicked.png")));
    }//GEN-LAST:event_btnEstMouseEntered

    private void btnPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseExited
        // TODO add your handling code here:

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/RelatorionotClicked.png")));
    }//GEN-LAST:event_btnPerfilMouseExited

    private void btnPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseEntered
        // TODO add your handling code here:

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Relatorioclicked.png")));
    }//GEN-LAST:event_btnPerfilMouseEntered

    private void btnCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseExited
        // TODO add your handling code here:

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cadastroNotClicked.png")));
    }//GEN-LAST:event_btnCadastroMouseExited

    private void btnCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseEntered
        // TODO add your handling code here:

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cadastro.png")));
    }//GEN-LAST:event_btnCadastroMouseEntered

    private void btnCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseClicked
        // TODO add your handling code here:
       dispose();
        CadastroDono cadd = new CadastroDono();
        new CadastroDono().setVisible(true);


    }//GEN-LAST:event_btnCadastroMouseClicked

    private void HomeClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_HomeClicked

    private void btnPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseClicked
        // TODO add your handling code here:
        dispose(); // Fecha a janela atual

        try {
            new Relatorio().setVisible(true); // Cria e exibe uma nova instância de Relatorio
        } catch (SQLException ex) {
            Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnPerfilMouseClicked

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
        // TODO add your handling code here:
       jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Relatorioclicked.png")));
        
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        // TODO add your handling code here:
        
         jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/RelatorionotClicked.png")));
        
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        
        dispose();
        try {
            new Relatorio().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jLabel5MouseClicked

    private void btnEstMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstMouseClicked
        // TODO add your handling code here:
        
        dispose();
        new Estatistica().setVisible(true);
       
        
    }//GEN-LAST:event_btnEstMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
         dispose();
        Login log = new Login();
        new Login().setVisible(true);


    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnCadastro;
    private javax.swing.JLabel btnCfg;
    private javax.swing.JLabel btnEst;
    private javax.swing.JLabel btnPerfil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visualizacao;

import DAO.DonoDAO;
import DTO.DonoDTO;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author dsm2
 */
public class CadastroDono extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDono
     */
    public CadastroDono() {
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

        jPanel2 = new javax.swing.JPanel();
        btnHome = new javax.swing.JLabel();
        btnCadastro = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtNomeDono = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtCPF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtEnderecoDono = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        boxSexo = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        boxEstado = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        txtCidade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnPerfil = new javax.swing.JLabel();
        btnEstatistica = new javax.swing.JLabel();
        btnCfg = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/homeNotClicked.png"))); // NOI18N
        btnHome.setToolTipText("");
        btnHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHomeHomeClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHomeMouseExited(evt);
            }
        });
        jPanel2.add(btnHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 256, -1, -1));

        btnCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/cadastro.png"))); // NOI18N
        btnCadastro.setText("jLabel2");
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
        jPanel2.add(btnCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 334, 322, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/logo_branca(1) 1(2).png"))); // NOI18N
        jLabel7.setText("jLabel7");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 300, -1));

        jPanel3.setBackground(new java.awt.Color(13, 13, 14));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 610, -1, -1));

        jPanel1.setBackground(new java.awt.Color(53, 53, 53));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(53, 53, 53), 5, true));
        jPanel1.setPreferredSize(new java.awt.Dimension(1191, 1080));

        jLabel9.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Nome");

        txtNomeDono.setBackground(new java.awt.Color(53, 53, 53));
        txtNomeDono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtNomeDono.setForeground(new java.awt.Color(255, 255, 255));
        txtNomeDono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(195, 194, 194), 2, true));
        txtNomeDono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeDonoActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CPF");

        txtCPF.setBackground(new java.awt.Color(53, 53, 53));
        txtCPF.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtCPF.setForeground(new java.awt.Color(255, 255, 255));
        txtCPF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(195, 194, 194), 2));
        txtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCPFActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Telefone");

        txtTelefone.setBackground(new java.awt.Color(53, 53, 53));
        txtTelefone.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtTelefone.setForeground(new java.awt.Color(255, 255, 255));
        txtTelefone.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });

        txtEmail.setBackground(new java.awt.Color(53, 53, 53));
        txtEmail.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(255, 255, 255));
        txtEmail.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtEnderecoDono.setBackground(new java.awt.Color(53, 53, 53));
        txtEnderecoDono.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtEnderecoDono.setForeground(new java.awt.Color(255, 255, 255));
        txtEnderecoDono.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtEnderecoDono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEnderecoDonoActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Sexo");

        boxSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Feminino", "Outros" }));
        boxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxSexoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Estado");

        boxEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal", "Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará", "Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte", "Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" }));

        jLabel4.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cidade");

        txtCidade.setBackground(new java.awt.Color(53, 53, 53));
        txtCidade.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        txtCidade.setForeground(new java.awt.Color(255, 255, 255));
        txtCidade.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        txtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCidadeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email");

        jLabel6.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Endereço");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Detalhes Básicos.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/gato_prop2.png"))); // NOI18N

        btnSalvar.setBackground(new java.awt.Color(255, 191, 27));
        btnSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("Salvar e continuar");
        btnSalvar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 191, 27), 5, true));
        btnSalvar.setContentAreaFilled(false);
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(482, 482, 482)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9)
                                .addComponent(txtCPF)
                                .addComponent(txtNomeDono)
                                .addComponent(txtTelefone)
                                .addComponent(txtEmail)
                                .addComponent(txtEnderecoDono, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 316, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(boxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(170, 170, 170))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addComponent(txtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(boxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(boxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomeDono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2)
                        .addGap(10, 10, 10)
                        .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(txtEnderecoDono, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)))
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 0, 1280, 1080));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(382, 1120));

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

        btnEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/estatisticasNotClicked.png"))); // NOI18N
        btnEstatistica.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEstatisticaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEstatisticaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEstatisticaMouseExited(evt);
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

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEstatistica, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCfg, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(412, 412, 412)
                .addComponent(btnPerfil)
                .addGap(18, 18, 18)
                .addComponent(btnEstatistica)
                .addGap(18, 18, 18)
                .addComponent(btnCfg)
                .addContainerGap(452, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 382, 1080));

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 266, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1080, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1660, 0, 266, 1080));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeHomeClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeHomeClicked
        // TODO add your handling code here:

        dispose();
        PaginaInicial pg = new PaginaInicial();
        pg.setVisible(true);
    }//GEN-LAST:event_btnHomeHomeClicked

    private void btnHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseEntered
        // TODO add your handling code here:

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/homeClicked.png")));
    }//GEN-LAST:event_btnHomeMouseEntered

    private void btnHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHomeMouseExited
        // TODO add your handling code here:

        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/homeNotClicked.png")));
    }//GEN-LAST:event_btnHomeMouseExited

    private void btnCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastroMouseClicked

    private void btnCadastroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastroMouseEntered

    private void btnCadastroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCadastroMouseExited
        // TODO add your handling code here:

    }//GEN-LAST:event_btnCadastroMouseExited

    private void btnPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseEntered
        // TODO add your handling code here:

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Relatorioclicked.png")));
    }//GEN-LAST:event_btnPerfilMouseEntered

    private void btnPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseExited
        // TODO add your handling code here:

        btnPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/RelatorionotClicked.png")));
    }//GEN-LAST:event_btnPerfilMouseExited

    private void btnEstatisticaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticaMouseEntered
        // TODO add your handling code here:

        btnEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/estatisticasClicked.png")));
    }//GEN-LAST:event_btnEstatisticaMouseEntered

    private void btnEstatisticaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticaMouseExited
        // TODO add your handling code here:

        btnEstatistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/estatisticasNotClicked.png")));
    }//GEN-LAST:event_btnEstatisticaMouseExited

    private void btnCfgMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCfgMouseEntered
        // TODO add your handling code here:

        btnCfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/configuraçao.png")));
    }//GEN-LAST:event_btnCfgMouseEntered

    private void btnCfgMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCfgMouseExited
        // TODO add your handling code here:

        btnCfg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/NotClicked/configuraçaoNotClicked.png")));
    }//GEN-LAST:event_btnCfgMouseExited

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseExited

    private void txtNomeDonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeDonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeDonoActionPerformed

    private void txtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCPFActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEnderecoDonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEnderecoDonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEnderecoDonoActionPerformed

    private void boxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_boxSexoActionPerformed

    private void txtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCidadeActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:

        String nomeDono,CPF,cidade,email,telefone,endereco,estado,sexo;

        DonoDTO don = new DonoDTO();
        nomeDono = txtNomeDono.getText();
        CPF=txtCPF.getText();
        cidade=txtCidade.getText();
        email=txtEmail.getText();
        telefone=txtTelefone.getText();
        endereco=txtEnderecoDono.getText();

        Object selectedEstado = boxEstado.getSelectedItem();
        if (selectedEstado != null) {
            don.setEstado(selectedEstado.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Você tem que adicionar um estado! ");
        }

        Object selectedSexo = boxSexo.getSelectedItem();
        if (selectedSexo != null) {
            don.setSexo(boxSexo.getSelectedItem().toString());
        } else {
            JOptionPane.showMessageDialog(null, "Voce tem que selecionar um sexo! ");
        }
        
        don.setNomeDono(nomeDono);
        don.setCPF(CPF);
        don.setCidade(cidade);
        don.setEmail(email);
        don.setTelefone(telefone);
        don.setEndereco(endereco);
        
        DonoDAO objdonodao = new DonoDAO();
        objdonodao.cadastrarDono(don);
        
        /* 
         don.setNomeDono(txtNomeDono.getText());
         don.setCPF(txtCPF.getText());
         don.setCidade(txtCidade.getText());
         don.setEmail(txtEmail.getText());
         don.setTelefone(txtTelefone.getText());
         don.setEndereco(txtEnderecoDono.getText());

         Object selectedEstado = boxEstado.getSelectedItem();
         if (selectedEstado != null) {
         don.setEstado(selectedEstado.toString());
         } else {
         JOptionPane.showMessageDialog(null, "Você tem que adicionar um estado! ");
         }
        
         Object selectedSexo = boxSexo.getSelectedItem();
         if (selectedSexo != null) {
         don.setSexo(boxSexo.getSelectedItem().toString());
         } else {
         JOptionPane.showMessageDialog(null, "Voce tem que selecionar um sexo! ");
         }

         try {
         don.cadastrarDono();
         } catch (SQLException ex) {
         Logger.getLogger(CadastroDono.class.getName()).log(Level.SEVERE, null, ex);
         }
         */
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPerfilMouseClicked
          dispose(); // Fecha a janela atual

        try {
            new Relatorio().setVisible(true); // Cria e exibe uma nova instância de Relatorio
        } catch (SQLException ex) {
            Logger.getLogger(PaginaInicial.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_btnPerfilMouseClicked

    private void btnEstatisticaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEstatisticaMouseClicked
        // TODO add your handling code here
           dispose();
        Estatistica est = new Estatistica();
        est.setVisible(true);
    }//GEN-LAST:event_btnEstatisticaMouseClicked

    private void btnCfgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCfgMouseClicked
          dispose();
        
          Config cfg = new Config();
        cfg.setVisible(true);
    }//GEN-LAST:event_btnCfgMouseClicked

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
            java.util.logging.Logger.getLogger(CadastroDono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDono.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroDono().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox boxEstado;
    private javax.swing.JComboBox boxSexo;
    private javax.swing.JLabel btnCadastro;
    private javax.swing.JLabel btnCfg;
    private javax.swing.JLabel btnEstatistica;
    private javax.swing.JLabel btnHome;
    private javax.swing.JLabel btnPerfil;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEnderecoDono;
    private javax.swing.JTextField txtNomeDono;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables
}

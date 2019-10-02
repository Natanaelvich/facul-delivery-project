package views;

import AppPackage.AnimationClass;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Janlea extends javax.swing.JFrame {

    public Janlea() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Lateral = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel20Navegador = new javax.swing.JLabel();
        jLabel21Calculator = new javax.swing.JLabel();
        jLabel22Musica = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1Lateral.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1Lateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1Lateral.setPreferredSize(new java.awt.Dimension(290, 555));
        jPanel1Lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(250, 162, 66));
        jLabel1.setText("Usuario");
        jPanel1Lateral.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(250, 162, 66));
        jLabel2.setText("Senha");
        jPanel1Lateral.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_User_96px_2.png"))); // NOI18N
        jPanel1Lateral.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, -1, 100));

        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(153, 153, 153));
        jTextField2.setBorder(null);
        jPanel1Lateral.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 160, 30));
        jPanel1Lateral.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 190, 40));
        jPanel1Lateral.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 190, 40));

        jPasswordField1.setBackground(new java.awt.Color(255, 255, 255));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(153, 153, 153));
        jPasswordField1.setBorder(null);
        jPanel1Lateral.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, 170, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_customer_32px_1.png"))); // NOI18N
        jPanel1Lateral.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Key_32px.png"))); // NOI18N
        jPanel1Lateral.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Menu_32px.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1Lateral.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Enter_OFF.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Enter_ON.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Enter_ON.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Enter_ON.png"))); // NOI18N
        jPanel1Lateral.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 130, 40));

        jLabel20Navegador.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Globe_32px.png"))); // NOI18N
        jPanel1Lateral.add(jLabel20Navegador, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 140, -1, -1));

        jLabel21Calculator.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Calculator_32px.png"))); // NOI18N
        jPanel1Lateral.add(jLabel21Calculator, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 60, -1, -1));

        jLabel22Musica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Musical_Notes_32px.png"))); // NOI18N
        jPanel1Lateral.add(jLabel22Musica, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 100, -1, -1));

        getContentPane().add(jPanel1Lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 555));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Notas");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        jLabel13.setText("Data");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel15.setText("Hora");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, -1, -1));

        jLabel16.setText("Configurações");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, -1, -1));

        jLabel17.setText("Drive");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 360, -1, -1));

        jLabel18.setText("Compartilhamento");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 360, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Idea_96px.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 180, 150));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Today_96px.png"))); // NOI18N
        jLabel8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel8MouseMoved(evt);
            }
        });
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8MouseExited(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 180, 150));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Clock_96px.png"))); // NOI18N
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel9MouseMoved(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 180, 150));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Maintenance_96px.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 180, 150));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Google_Drive_96px.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 180, 150));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Handshake_96px.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 180, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 75, 760, 480));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setToolTipText("");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 97, 36), 1, true));
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 22, 320, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Search_32px_2.png"))); // NOI18N
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Multiply_32px.png"))); // NOI18N
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 80));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        AnimationClass internet = new AnimationClass();
        internet.jLabelXRight(-40, 10, 10, 5, jLabel21Calculator);
        internet.jLabelXLeft(10, -40, 10, 5, jLabel21Calculator);

        internet.jLabelXRight(-40, 10, 10, 5, jLabel20Navegador);
        internet.jLabelXLeft(10, -40, 10, 5, jLabel20Navegador);

        internet.jLabelXRight(-40, 10, 10, 5, jLabel22Musica);
        internet.jLabelXLeft(10, -40, 10, 5, jLabel22Musica);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_OPTION;
        int res = JOptionPane.showConfirmDialog(null, "REALMENTE DESEJA SAIR?", "SAIR", dialog);
        if (res == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        this.setState(Janlea.ICONIFIED);
    }//GEN-LAST:event_jLabel20MouseClicked

    //aimando ao mover mouse em painel central
    private void jLabel8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseMoved
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseExited
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel8MouseExited

    private void jLabel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseMoved
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel9MouseMoved

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }

    private void jLabel11MouseMoved(java.awt.event.MouseEvent evt) {
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Janlea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new Janlea().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel20Navegador;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel21Calculator;
    private javax.swing.JLabel jLabel22Musica;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1Lateral;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

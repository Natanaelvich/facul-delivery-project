package views;

import javax.swing.JOptionPane;

public class TelaDeLogin extends javax.swing.JFrame {

    public TelaDeLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2Login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField1User = new javax.swing.JTextField();
        jTextField2Senha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel9NaoTemCadastro = new javax.swing.JLabel();
        jLabel10BTNcadastro = new javax.swing.JLabel();
        jSeparator5SeparadorBTNcadastro = new javax.swing.JSeparator();
        jPanelSlider1 = new diu.swe.habib.JPanelSlider.JPanelSlider();
        jPanel2Logo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3Cadastro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField1User1 = new javax.swing.JTextField();
        jTextField1User2 = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2Login.setBackground(new java.awt.Color(255, 51, 255));
        jPanel2Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setText("Usuario");
        jPanel2Login.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Senha");
        jPanel2Login.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2Login.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 190, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2Login.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 355, 190, 30));

        jTextField1User.setBackground(new java.awt.Color(255, 102, 255));
        jTextField1User.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1User.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1User.setBorder(null);
        jPanel2Login.add(jTextField1User, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 190, 40));

        jTextField2Senha.setBackground(new java.awt.Color(255, 102, 255));
        jTextField2Senha.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2Senha.setForeground(new java.awt.Color(102, 102, 102));
        jTextField2Senha.setBorder(null);
        jPanel2Login.add(jTextField2Senha, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 314, 190, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Multiply_32px.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2Login.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, -1, -1));

        jButton1.setBackground(new java.awt.Color(102, 0, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Enter_OFF.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2Login.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 130, 40));

        jLabel9NaoTemCadastro.setBackground(new java.awt.Color(255, 102, 255));
        jLabel9NaoTemCadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9NaoTemCadastro.setForeground(new java.awt.Color(51, 0, 51));
        jLabel9NaoTemCadastro.setText("Se não estiver cadastratado clique aqui ");
        jPanel2Login.add(jLabel9NaoTemCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        jLabel10BTNcadastro.setBackground(new java.awt.Color(153, 0, 153));
        jLabel10BTNcadastro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10BTNcadastro.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10BTNcadastro.setText("CADASTRAR");
        jLabel10BTNcadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10BTNcadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10BTNcadastroMouseClicked(evt);
            }
        });
        jPanel2Login.add(jLabel10BTNcadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 500, -1, -1));

        jSeparator5SeparadorBTNcadastro.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5SeparadorBTNcadastro.setForeground(new java.awt.Color(0, 0, 0));
        jPanel2Login.add(jSeparator5SeparadorBTNcadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 515, 80, 10));

        jPanel1.add(jPanel2Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 410, 560));

        jPanelSlider1.setBorder(null);

        jPanel2Logo.setBackground(new java.awt.Color(204, 0, 204));
        jPanel2Logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fatia-de-pizza.png"))); // NOI18N
        jPanel2Logo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, -1));

        jPanelSlider1.add(jPanel2Logo, "card3");

        jPanel3Cadastro.setBackground(new java.awt.Color(255, 0, 204));
        jPanel3Cadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Nome");
        jPanel3Cadastro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 0, 102));
        jLabel5.setText("Email");
        jPanel3Cadastro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 0, 102));
        jLabel6.setText("Telefone");
        jPanel3Cadastro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Senha");
        jPanel3Cadastro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 0, 102));
        jLabel8.setText("Confirmar Senha");
        jPanel3Cadastro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jFormattedTextField1.setBackground(new java.awt.Color(255, 102, 255));
        jFormattedTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jFormattedTextField1.setText("   (99)9 9999-9999");
        jPanel3Cadastro.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 160, 30));

        jPasswordField1.setBackground(new java.awt.Color(255, 102, 255));
        jPasswordField1.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField1.setText("jPasswordField1");
        jPanel3Cadastro.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 190, 30));

        jPasswordField2.setBackground(new java.awt.Color(255, 102, 255));
        jPasswordField2.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField2.setText("jPasswordField2");
        jPanel3Cadastro.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 190, 30));

        jButton2.setBackground(new java.awt.Color(102, 0, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Cadastrar");
        jButton2.setBorder(null);
        jButton2.setOpaque(false);
        jButton2.setRolloverEnabled(true);
        jPanel3Cadastro.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 130, 40));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3Cadastro.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 190, -1));

        jTextField1User1.setBackground(new java.awt.Color(255, 102, 255));
        jTextField1User1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1User1.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1User1.setBorder(null);
        jPanel3Cadastro.add(jTextField1User1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 190, 40));

        jTextField1User2.setBackground(new java.awt.Color(255, 102, 255));
        jTextField1User2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1User2.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1User2.setBorder(null);
        jPanel3Cadastro.add(jTextField1User2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 190, 40));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3Cadastro.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 190, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/voltar-seta.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel3Cadastro.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 40, -1));

        jPanelSlider1.add(jPanel3Cadastro, "card2");

        jPanel1.add(jPanelSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 380, 580));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-4, 0, 790, 560));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        int dialog = JOptionPane.YES_NO_OPTION;
        int res = JOptionPane.showConfirmDialog(null, "REALMENTE DESEJA SAIR?", "SAIR", dialog);
        if (res == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (jTextField1User.getText().equals("joao") && jTextField2Senha.getText().equals("123")) {
            JanelaPrinci janelaPrinci = new JanelaPrinci();
            this.dispose();
            janelaPrinci.setVisible(true);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jLabel10BTNcadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10BTNcadastroMouseClicked

        jPanelSlider1.nextPanel(10, jPanel3Cadastro, rootPaneCheckingEnabled);
        jLabel9NaoTemCadastro.setVisible(false);
        jLabel10BTNcadastro.setVisible(false);
        jSeparator5SeparadorBTNcadastro.setVisible(false);

    }//GEN-LAST:event_jLabel10BTNcadastroMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        jPanelSlider1.nextPanel(10, jPanel2Logo, rootPaneCheckingEnabled);
         jLabel9NaoTemCadastro.setVisible(true);
        jLabel10BTNcadastro.setVisible(true);
        jSeparator5SeparadorBTNcadastro.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel10BTNcadastro;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel9NaoTemCadastro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2Login;
    private javax.swing.JPanel jPanel2Logo;
    private javax.swing.JPanel jPanel3Cadastro;
    private diu.swe.habib.JPanelSlider.JPanelSlider jPanelSlider1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5SeparadorBTNcadastro;
    private javax.swing.JTextField jTextField1User;
    private javax.swing.JTextField jTextField1User1;
    private javax.swing.JTextField jTextField1User2;
    private javax.swing.JTextField jTextField2Senha;
    // End of variables declaration//GEN-END:variables
}

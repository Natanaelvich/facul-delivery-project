package views;

import Dao.UserDao;
import entites.Usuario;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

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
        jLabel11UserAdnSenhaIncorret = new javax.swing.JLabel();
        jPanelSlider1 = new diu.swe.habib.JPanelSlider.JPanelSlider();
        jPanel2Logo = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3Cadastro = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jFormattedTextField1Telefone = new javax.swing.JFormattedTextField();
        jPasswordField1PassCadastro = new javax.swing.JPasswordField();
        jPasswordField2PassConfirm = new javax.swing.JPasswordField();
        jButton2CadastrarUser = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField1UserCadastro = new javax.swing.JTextField();
        jTextField1Email = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel11ErroSenha = new javax.swing.JLabel();
        jLabel11UserExist = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2Login.setBackground(new java.awt.Color(216, 216, 216));
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
        jPanel2Login.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 355, 190, 10));

        jTextField1User.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1User.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1User.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1User.setBorder(null);
        jPanel2Login.add(jTextField1User, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 190, 40));

        jTextField2Senha.setBackground(new java.awt.Color(255, 255, 255));
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

        jLabel11UserAdnSenhaIncorret.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11UserAdnSenhaIncorret.setForeground(new java.awt.Color(255, 0, 0));
        jPanel2Login.add(jLabel11UserAdnSenhaIncorret, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, -1));

        jPanel1.add(jPanel2Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 410, 560));

        jPanelSlider1.setBorder(null);

        jPanel2Logo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2Logo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/fatia-de-pizza.png"))); // NOI18N
        jPanel2Logo.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 240, -1));

        jPanelSlider1.add(jPanel2Logo, "card3");

        jPanel3Cadastro.setBackground(new java.awt.Color(230, 230, 230));
        jPanel3Cadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("Nome");
        jPanel3Cadastro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("Email");
        jPanel3Cadastro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 51, 51));
        jLabel6.setText("Telefone");
        jPanel3Cadastro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 51, 51));
        jLabel7.setText("Senha");
        jPanel3Cadastro.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("Confirmar Senha");
        jPanel3Cadastro.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));

        jFormattedTextField1Telefone.setBackground(new java.awt.Color(204, 204, 204));
        jFormattedTextField1Telefone.setBorder(null);
        jFormattedTextField1Telefone.setForeground(new java.awt.Color(51, 51, 51));
        try {
            jFormattedTextField1Telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1Telefone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel3Cadastro.add(jFormattedTextField1Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 190, 30));

        jPasswordField1PassCadastro.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField1PassCadastro.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField1PassCadastro.setBorder(null);
        jPanel3Cadastro.add(jPasswordField1PassCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 190, 30));

        jPasswordField2PassConfirm.setBackground(new java.awt.Color(204, 204, 204));
        jPasswordField2PassConfirm.setForeground(new java.awt.Color(0, 0, 0));
        jPasswordField2PassConfirm.setBorder(null);
        jPasswordField2PassConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField2PassConfirmActionPerformed(evt);
            }
        });
        jPanel3Cadastro.add(jPasswordField2PassConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 190, 30));

        jButton2CadastrarUser.setBackground(new java.awt.Color(102, 0, 102));
        jButton2CadastrarUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2CadastrarUser.setForeground(new java.awt.Color(255, 51, 51));
        jButton2CadastrarUser.setText("Cadastrar");
        jButton2CadastrarUser.setBorder(null);
        jButton2CadastrarUser.setOpaque(false);
        jButton2CadastrarUser.setRolloverEnabled(true);
        jButton2CadastrarUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2CadastrarUserMouseClicked(evt);
            }
        });
        jPanel3Cadastro.add(jButton2CadastrarUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 130, 40));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3Cadastro.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 190, -1));

        jTextField1UserCadastro.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1UserCadastro.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1UserCadastro.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1UserCadastro.setBorder(null);
        jPanel3Cadastro.add(jTextField1UserCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 190, 30));

        jTextField1Email.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1Email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1Email.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1Email.setBorder(null);
        jPanel3Cadastro.add(jTextField1Email, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 190, 30));

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

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3Cadastro.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 190, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3Cadastro.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 190, 10));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3Cadastro.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 190, 10));

        jLabel11ErroSenha.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11ErroSenha.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3Cadastro.add(jLabel11ErroSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 230, 20));

        jLabel11UserExist.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11UserExist.setForeground(new java.awt.Color(255, 0, 0));
        jPanel3Cadastro.add(jLabel11UserExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, -1, -1));

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

    //login
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //verificando se esta cadastrado
        boolean exist = UserDao.getUserAndSenha(jTextField1User.getText(), jTextField2Senha.getText());
        if (exist) {
            JanelaPrinci janelaPrinci = new JanelaPrinci();
            this.dispose();
            janelaPrinci.setVisible(true);
        } else {
            jLabel11UserAdnSenhaIncorret.setText("Nome ou senha INCORRETOS");
        }

    }//GEN-LAST:event_jButton1ActionPerformed


    private void jLabel10BTNcadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10BTNcadastroMouseClicked

        jPanelSlider1.nextPanel(10, jPanel3Cadastro, rootPaneCheckingEnabled);
        jLabel9NaoTemCadastro.setVisible(false);
        jLabel10BTNcadastro.setVisible(false);
        jSeparator5SeparadorBTNcadastro.setVisible(false);

    }//GEN-LAST:event_jLabel10BTNcadastroMouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        jPanelSlider1.nextPanel(10, jPanel2Logo, rootPaneCheckingEnabled);
        jLabel9NaoTemCadastro.setVisible(true);
        jLabel10BTNcadastro.setVisible(true);
        jSeparator5SeparadorBTNcadastro.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    //cadastrando usuario
    private void jButton2CadastrarUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2CadastrarUserMouseClicked
        String nome = jTextField1UserCadastro.getText();
        String email = jTextField1Email.getText();
        String telefone = jFormattedTextField1Telefone.getText().replace("(", "").replace(")", "").replace("-","");
        String senha = jPasswordField1PassCadastro.getText();
        String senhaConfir = jPasswordField2PassConfirm.getText();
        System.out.println(telefone.length());
        System.out.println(telefone);

        if (nome.equals("") || email.equals("") || telefone.equals("") || senhaConfir.equals("") || senhaConfir.equals("")) {
            jLabel11ErroSenha.setText("Preencha todos os campos");
        } else {

            //verificando se as senhas confirmam
            if (senha.equals(senhaConfir)) {
                Usuario user = new Usuario(nome, email, telefone, senha);
                //verificando se usuario existe
                boolean userExist = UserDao.getUser(user);
                if (userExist) {
                    jLabel11UserExist.setText("Já existe esse usuário");
                } else {
                    //mudando para logo
                    jLabel11ErroSenha.setVisible(false);
                    jLabel11UserExist.setVisible(false);
                    //salvando usuario
                    UserDao.SalvarUser(user);
                    jPanelSlider1.nextPanel(10, jPanel2Logo, rootPaneCheckingEnabled);
                    jLabel9NaoTemCadastro.setVisible(true);
                    jLabel10BTNcadastro.setVisible(true);
                    jSeparator5SeparadorBTNcadastro.setVisible(true);
                }

            } else {
                jLabel11ErroSenha.setVisible(true);
                jLabel11ErroSenha.setText("As senhas não coincidem");
            }
        }
    }//GEN-LAST:event_jButton2CadastrarUserMouseClicked

    private void jPasswordField2PassConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField2PassConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField2PassConfirmActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked


    }//GEN-LAST:event_jButton1MouseClicked

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
        java.awt.EventQueue.invokeLater(() -> {
            new TelaDeLogin().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2CadastrarUser;
    private javax.swing.JFormattedTextField jFormattedTextField1Telefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel10BTNcadastro;
    private javax.swing.JLabel jLabel11ErroSenha;
    private javax.swing.JLabel jLabel11UserAdnSenhaIncorret;
    private javax.swing.JLabel jLabel11UserExist;
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
    private javax.swing.JPasswordField jPasswordField1PassCadastro;
    private javax.swing.JPasswordField jPasswordField2PassConfirm;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator5SeparadorBTNcadastro;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField1Email;
    private javax.swing.JTextField jTextField1User;
    private javax.swing.JTextField jTextField1UserCadastro;
    private javax.swing.JTextField jTextField2Senha;
    // End of variables declaration//GEN-END:variables
}

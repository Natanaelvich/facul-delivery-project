package views;

import Dao.UserDao;
import static Dao.UserDao.getUserID;
import entites.Usuario;

public class CaixaDeEdicaoDadosUser extends javax.swing.JDialog {

    JanelaPrinci janelaPrinci = new JanelaPrinci();

    public CaixaDeEdicaoDadosUser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        preencherDadosUser();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1UserTela = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1IconUser = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jFormattedTextField1TelefoneEDI = new javax.swing.JFormattedTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jTextField1UserCadastroEDI = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField1UserEMailEDI = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField1UserSenhaEdi = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1Fechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(698, 408));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1UserTela.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1UserTela.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(51, 51, 51), 5, true));
        jPanel1UserTela.setPreferredSize(new java.awt.Dimension(698, 408));
        jPanel1UserTela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nome");
        jPanel1UserTela.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Telefone");
        jPanel1UserTela.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Senha");
        jPanel1UserTela.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 270, -1, -1));

        jLabel1IconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/do-utilizador.png"))); // NOI18N
        jPanel1UserTela.add(jLabel1IconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("EDITAR DADOS");
        jPanel1UserTela.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/editardados.png"))); // NOI18N
        jLabel10.setText("Salvar Dados");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1UserTela.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Email");
        jPanel1UserTela.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 190, -1, -1));

        jFormattedTextField1TelefoneEDI.setBackground(new java.awt.Color(204, 204, 204));
        jFormattedTextField1TelefoneEDI.setBorder(null);
        jFormattedTextField1TelefoneEDI.setForeground(new java.awt.Color(51, 51, 51));
        try {
            jFormattedTextField1TelefoneEDI.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1TelefoneEDI.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1UserTela.add(jFormattedTextField1TelefoneEDI, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 190, 30));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1UserTela.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 190, 10));

        jTextField1UserCadastroEDI.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1UserCadastroEDI.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1UserCadastroEDI.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1UserCadastroEDI.setBorder(null);
        jPanel1UserTela.add(jTextField1UserCadastroEDI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1UserTela.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 190, -1));

        jTextField1UserEMailEDI.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1UserEMailEDI.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1UserEMailEDI.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1UserEMailEDI.setBorder(null);
        jPanel1UserTela.add(jTextField1UserEMailEDI, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 190, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1UserTela.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 190, -1));

        jTextField1UserSenhaEdi.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1UserSenhaEdi.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1UserSenhaEdi.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1UserSenhaEdi.setBorder(null);
        jPanel1UserTela.add(jTextField1UserSenhaEdi, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 190, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1UserTela.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 330, 190, 10));

        jLabel1Fechar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1Fechar.setText("x");
        jLabel1Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1FecharMouseClicked(evt);
            }
        });
        jPanel1UserTela.add(jLabel1Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        getContentPane().add(jPanel1UserTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 698, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1FecharMouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1FecharMouseClicked

    //atualizando usuario
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        String nome = jTextField1UserCadastroEDI.getText(),email = jTextField1UserEMailEDI.getText(),
        senha = jTextField1UserSenhaEdi.getText(), 
        telefone = jFormattedTextField1TelefoneEDI.getText().replace("(", "").replace(")", "").replace("-","");
        int id = getUserID(TelaDeLogin.jTextField1User.getText(), TelaDeLogin.jTextField2Senha.getText());
        
        UserDao.atualizarUser(new Usuario(id,nome, email, telefone, senha));
        TelaDeUsuario.preencherDadosUser();
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void preencherDadosUser(){
        Usuario user = UserDao.userDados();
        jTextField1UserCadastroEDI.setText(user.getNome());
        jTextField1UserEMailEDI.setText(user.getEmail());
        jFormattedTextField1TelefoneEDI.setText(user.getTelefone());
        jTextField1UserSenhaEdi.setText(user.getSenha());
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
            java.util.logging.Logger.getLogger(CaixaDeEdicaoDadosUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            CaixaDeEdicaoDadosUser dialog = new CaixaDeEdicaoDadosUser(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextField1TelefoneEDI;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel1Fechar;
    private javax.swing.JLabel jLabel1IconUser;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1UserTela;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField1UserCadastroEDI;
    private javax.swing.JTextField jTextField1UserEMailEDI;
    private javax.swing.JTextField jTextField1UserSenhaEdi;
    // End of variables declaration//GEN-END:variables
}

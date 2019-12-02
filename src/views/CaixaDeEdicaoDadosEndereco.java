package views;

import Dao.EnderecoDao;
import entites.Endereco;

public class CaixaDeEdicaoDadosEndereco extends javax.swing.JDialog {

    JanelaPrinci janelaPrinci = new JanelaPrinci();

    public CaixaDeEdicaoDadosEndereco(java.awt.Frame parent, boolean modal) {
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
        jTextField1EnderecoBairroEdit = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField1EnderecoNumerEdit = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jTextField1EnderecoComplementoEdit = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel1Fechar = new javax.swing.JLabel();
        jTextField1EnderecoRuaEdit = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();

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
        jLabel3.setText("Bairro");
        jPanel1UserTela.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Rua");
        jPanel1UserTela.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Complemento");
        jPanel1UserTela.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, -1, -1));

        jLabel1IconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pino-de-localizacao 128px.png"))); // NOI18N
        jPanel1UserTela.add(jLabel1IconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("EDITAR ENDEREÇO");
        jPanel1UserTela.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/editardados.png"))); // NOI18N
        jLabel10.setText("Salvar Endereco");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1UserTela.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Numero");
        jPanel1UserTela.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, -1, -1));

        jTextField1EnderecoBairroEdit.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1EnderecoBairroEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1EnderecoBairroEdit.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1EnderecoBairroEdit.setBorder(null);
        jPanel1UserTela.add(jTextField1EnderecoBairroEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 190, 30));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1UserTela.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 190, -1));

        jTextField1EnderecoNumerEdit.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1EnderecoNumerEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1EnderecoNumerEdit.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1EnderecoNumerEdit.setBorder(null);
        jPanel1UserTela.add(jTextField1EnderecoNumerEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 190, 30));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1UserTela.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, 190, -1));

        jTextField1EnderecoComplementoEdit.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1EnderecoComplementoEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1EnderecoComplementoEdit.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1EnderecoComplementoEdit.setBorder(null);
        jPanel1UserTela.add(jTextField1EnderecoComplementoEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 440, 30));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1UserTela.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 330, 440, 10));

        jLabel1Fechar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1Fechar.setText("x");
        jLabel1Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1FecharMouseClicked(evt);
            }
        });
        jPanel1UserTela.add(jLabel1Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        jTextField1EnderecoRuaEdit.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1EnderecoRuaEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField1EnderecoRuaEdit.setForeground(new java.awt.Color(102, 102, 102));
        jTextField1EnderecoRuaEdit.setBorder(null);
        jPanel1UserTela.add(jTextField1EnderecoRuaEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 190, 30));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1UserTela.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 190, -1));

        getContentPane().add(jPanel1UserTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 698, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1FecharMouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1FecharMouseClicked
    
    //attulizando endereco
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        String bairro = jTextField1EnderecoBairroEdit.getText(),rua = jTextField1EnderecoRuaEdit.getText(),
        numero = jTextField1EnderecoNumerEdit.getText(),complemento = jTextField1EnderecoComplementoEdit.getText();
        
        EnderecoDao.atulizandoEndereco(bairro, rua, numero, complemento);
        TelaDeUsuario.preencherDadosUser();
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

    private void preencherDadosUser(){
        Endereco endereco = EnderecoDao.getEnderecoUSER();
        jTextField1EnderecoBairroEdit.setText(endereco.getBairro());
        jTextField1EnderecoRuaEdit.setText(endereco.getRua());
        jTextField1EnderecoNumerEdit.setText(endereco.getNumero());
        jTextField1EnderecoComplementoEdit.setText(endereco.getComplemento());
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
            java.util.logging.Logger.getLogger(CaixaDeEdicaoDadosEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            CaixaDeEdicaoDadosEndereco dialog = new CaixaDeEdicaoDadosEndereco(new javax.swing.JFrame(), true);
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
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JTextField jTextField1EnderecoBairroEdit;
    private javax.swing.JTextField jTextField1EnderecoComplementoEdit;
    private javax.swing.JTextField jTextField1EnderecoNumerEdit;
    private javax.swing.JTextField jTextField1EnderecoRuaEdit;
    // End of variables declaration//GEN-END:variables
}

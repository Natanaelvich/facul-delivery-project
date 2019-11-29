package views;

import views.estabelecimentos.ProdutosPitstop;

public class CaixaDeCadastroEndereco extends javax.swing.JDialog {

    JanelaPrinci janelaPrinci = new JanelaPrinci();

    public CaixaDeCadastroEndereco(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1AreaCadastro = new javax.swing.JPanel();
        jLabel1Fechar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1Bairro = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField2Rua = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jTextField3Complemento = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jTextField4Numero = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(698, 408));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1AreaCadastro.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1AreaCadastro.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 5, true));
        jPanel1AreaCadastro.setMinimumSize(new java.awt.Dimension(698, 408));
        jPanel1AreaCadastro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1Fechar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1Fechar.setText("x");
        jLabel1Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1FecharMouseClicked(evt);
            }
        });
        jPanel1AreaCadastro.add(jLabel1Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Complemento");
        jPanel1AreaCadastro.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Bairro");
        jPanel1AreaCadastro.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Rua");
        jPanel1AreaCadastro.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Numero");
        jPanel1AreaCadastro.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jTextField1Bairro.setBackground(new java.awt.Color(204, 204, 204));
        jTextField1Bairro.setBorder(null);
        jPanel1AreaCadastro.add(jTextField1Bairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, 210, 40));
        jPanel1AreaCadastro.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 210, 10));

        jTextField2Rua.setBackground(new java.awt.Color(204, 204, 204));
        jTextField2Rua.setBorder(null);
        jPanel1AreaCadastro.add(jTextField2Rua, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 310, 40));
        jPanel1AreaCadastro.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 310, 10));

        jTextField3Complemento.setBackground(new java.awt.Color(204, 204, 204));
        jTextField3Complemento.setBorder(null);
        jPanel1AreaCadastro.add(jTextField3Complemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 300, 40));
        jPanel1AreaCadastro.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, 300, 10));

        jTextField4Numero.setBackground(new java.awt.Color(204, 204, 204));
        jTextField4Numero.setBorder(null);
        jPanel1AreaCadastro.add(jTextField4Numero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 140, 40));
        jPanel1AreaCadastro.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 140, 10));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Cadastrar");
        jButton1.setBorder(null);
        jPanel1AreaCadastro.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 250, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Cadastre seu endereço de entrega (isso aparecerá apenas uma vez)");
        jPanel1AreaCadastro.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        getContentPane().add(jPanel1AreaCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

   
    private void jLabel1FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1FecharMouseClicked
         //verificando se as janelas de produtos estao ativas
        if (ProdutosPitstop.ativo) {
            ProdutosPitstop.qtdcarrinho();
        }
        ProdutosPitstop.qtdcarrinho();
        if (ProdutosPontes.ativo) {
            ProdutosPontes.qtdcarrinho();
        }
        dispose();
    }//GEN-LAST:event_jLabel1FecharMouseClicked
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaixaDeCadastroEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            CaixaDeCadastroEndereco dialog = new CaixaDeCadastroEndereco(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Fechar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1AreaCadastro;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextField1Bairro;
    private javax.swing.JTextField jTextField2Rua;
    private javax.swing.JTextField jTextField3Complemento;
    private javax.swing.JTextField jTextField4Numero;
    // End of variables declaration//GEN-END:variables
}

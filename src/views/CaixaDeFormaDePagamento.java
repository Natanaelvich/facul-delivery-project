package views;

import Dao.PedidosDao;
import Dao.UserDao;

public class CaixaDeFormaDePagamento extends javax.swing.JDialog {

    public CaixaDeFormaDePagamento(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupFormPagamentoOPT = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1FecharCaixaCompra = new javax.swing.JLabel();
        jLabel3CartaoNome = new javax.swing.JLabel();
        jLabel5CartaoIcon = new javax.swing.JLabel();
        jRadioButton1CartaoOPT = new javax.swing.JRadioButton();
        jLabel3DinheiroNome = new javax.swing.JLabel();
        jLabel5DinheiroIcon = new javax.swing.JLabel();
        jRadioButton1DiheiroOPT = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1FecharCaixaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Multiply_32px.png"))); // NOI18N
        jLabel1FecharCaixaCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1FecharCaixaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1FecharCaixaCompraMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1FecharCaixaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel3CartaoNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3CartaoNome.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3CartaoNome.setText("Cartão de Crédito");
        jPanel1.add(jLabel3CartaoNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel5CartaoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/cartao-de-credito.png"))); // NOI18N
        jPanel1.add(jLabel5CartaoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, -1, -1));

        buttonGroupFormPagamentoOPT.add(jRadioButton1CartaoOPT);
        jRadioButton1CartaoOPT.setSelected(true);
        jPanel1.add(jRadioButton1CartaoOPT, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, -1, -1));

        jLabel3DinheiroNome.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3DinheiroNome.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3DinheiroNome.setText("Dinheiro");
        jPanel1.add(jLabel3DinheiroNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, -1, -1));

        jLabel5DinheiroIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/notas.png"))); // NOI18N
        jPanel1.add(jLabel5DinheiroIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        buttonGroupFormPagamentoOPT.add(jRadioButton1DiheiroOPT);
        jPanel1.add(jRadioButton1DiheiroOPT, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ok.png"))); // NOI18N
        jLabel1.setText("Finalizar");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1FecharCaixaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1FecharCaixaCompraMouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1FecharCaixaCompraMouseClicked

    //verificando forma de pagamento e confirmando
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        int optPag;
        if(jRadioButton1CartaoOPT.isSelected()){
            optPag = 1;
        } else{
            optPag = 2;
        }
        for (int i = 0; i < JanelaPrinci.produtos.size(); i++) {
            PedidosDao.salvarPedido(UserDao.getUserID(TelaDeLogin.jTextField1User.getText(), TelaDeLogin.jTextField2Senha.getText()), JanelaPrinci.produtos.get(i).getId(),optPag);
        }
        CaixaDeCarrinho.limparCarrinho();
        dispose();
    }//GEN-LAST:event_jLabel1MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaixaDeFormaDePagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            CaixaDeFormaDePagamento dialog = new CaixaDeFormaDePagamento(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroupFormPagamentoOPT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1FecharCaixaCompra;
    private javax.swing.JLabel jLabel3CartaoNome;
    private javax.swing.JLabel jLabel3DinheiroNome;
    private javax.swing.JLabel jLabel5CartaoIcon;
    private javax.swing.JLabel jLabel5DinheiroIcon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1CartaoOPT;
    private javax.swing.JRadioButton jRadioButton1DiheiroOPT;
    // End of variables declaration//GEN-END:variables
}

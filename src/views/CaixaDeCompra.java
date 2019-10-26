package views;

import entites.Produto;

public class CaixaDeCompra extends javax.swing.JDialog {

    public CaixaDeCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        if (JanelaPrinci.produtos.size() == 5) {
            jLabel5AdicionarCarrinho.setVisible(false);
            jLabel6AdicionarCarrinhoIcon.setVisible(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1FecharCaixaCompra = new javax.swing.JLabel();
        jLabel2IconProduto = new javax.swing.JLabel();
        jLabel3NomeProduto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2Preço = new javax.swing.JLabel();
        jLabel2Igredientes = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5AdicionarCarrinho = new javax.swing.JLabel();
        jLabel6AdicionarCarrinhoIcon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2Preço1 = new javax.swing.JLabel();

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

        jLabel2IconProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/comida-rapida.png"))); // NOI18N
        jPanel1.add(jLabel2IconProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3NomeProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3NomeProduto.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3NomeProduto.setText("....");
        jPanel1.add(jLabel3NomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Preço  : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jLabel2Preço.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2Preço.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2Preço.setText("....");
        jPanel1.add(jLabel2Preço, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, -1, -1));

        jLabel2Igredientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2Igredientes.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2Igredientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2Igredientes.setText(".....");
        jLabel2Igredientes.setToolTipText("");
        jLabel2Igredientes.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2Igredientes.setAutoscrolls(true);
        jLabel2Igredientes.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true), "Igredientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18), new java.awt.Color(102, 102, 102))); // NOI18N
        jPanel1.add(jLabel2Igredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 220, 160));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ok.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 325, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Confirmar Pedido");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, -1, -1));

        jLabel5AdicionarCarrinho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5AdicionarCarrinho.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5AdicionarCarrinho.setText("Adicionar ao carrinho");
        jLabel5AdicionarCarrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5AdicionarCarrinho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5AdicionarCarrinhoMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel5AdicionarCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel6AdicionarCarrinhoIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/adicionar-ao-carrinho.png"))); // NOI18N
        jPanel1.add(jLabel6AdicionarCarrinhoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 325, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/money.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 225, -1, -1));

        jLabel2Preço1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2Preço1.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2Preço1.setText("R$");
        jPanel1.add(jLabel2Preço1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 412));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1FecharCaixaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1FecharCaixaCompraMouseClicked
        dispose();
    }//GEN-LAST:event_jLabel1FecharCaixaCompraMouseClicked

    private void jLabel5AdicionarCarrinhoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5AdicionarCarrinhoMouseClicked
        JanelaPrinci.produtos.add(new Produto(jLabel3NomeProduto.getText(), Double.valueOf(jLabel2Preço.getText()), "kkkkkkk", 1));
        JanelaPrinci.qtdcarrinho();
        if (ProdutosPitstop.ativo) {
            ProdutosPitstop.qtdcarrinho();
        }
        ProdutosPitstop.qtdcarrinho();
        if (ProdutosPontes.ativo) {
            ProdutosPontes.qtdcarrinho();
        }

        JanelaPrinci.jLabel9QuantiCarrinho.setText("kkk");
        dispose();
    }//GEN-LAST:event_jLabel5AdicionarCarrinhoMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaixaDeCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            CaixaDeCompra dialog = new CaixaDeCompra(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1FecharCaixaCompra;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel2IconProduto;
    public javax.swing.JLabel jLabel2Igredientes;
    public javax.swing.JLabel jLabel2Preço;
    public javax.swing.JLabel jLabel2Preço1;
    public javax.swing.JLabel jLabel3NomeProduto;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5AdicionarCarrinho;
    private javax.swing.JLabel jLabel6AdicionarCarrinhoIcon;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

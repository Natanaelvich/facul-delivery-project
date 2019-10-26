package views;

public class CaixaDeCarrinhoInterna extends javax.swing.JPanel {

    public CaixaDeCarrinhoInterna() {
        initComponents();
        System.out.println("sim");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4CarrinhoIcon = new javax.swing.JPanel();
        jLabel9QuantiCarrinho = new javax.swing.JLabel();
        jLabel7CarrinhoTelaInicial = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4CarrinhoIcon.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4CarrinhoIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4CarrinhoIconMouseClicked(evt);
            }
        });
        jPanel4CarrinhoIcon.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9QuantiCarrinho.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9QuantiCarrinho.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9QuantiCarrinho.setText("#");
        jLabel9QuantiCarrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4CarrinhoIcon.add(jLabel9QuantiCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, 40));

        jLabel7CarrinhoTelaInicial.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/carrinho.png"))); // NOI18N
        jLabel7CarrinhoTelaInicial.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7CarrinhoTelaInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7CarrinhoTelaInicialMouseClicked(evt);
            }
        });
        jPanel4CarrinhoIcon.add(jLabel7CarrinhoTelaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        add(jPanel4CarrinhoIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 90, 80));
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7CarrinhoTelaInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7CarrinhoTelaInicialMouseClicked
        CaixaDeCarrinho caixaDeCarrinho = new CaixaDeCarrinho(new JanelaPrinci(), true);
        caixaDeCarrinho.setVisible(true);
    }//GEN-LAST:event_jLabel7CarrinhoTelaInicialMouseClicked

    private void jPanel4CarrinhoIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4CarrinhoIconMouseClicked

    }//GEN-LAST:event_jPanel4CarrinhoIconMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel7CarrinhoTelaInicial;
    public static javax.swing.JLabel jLabel9QuantiCarrinho;
    private static javax.swing.JPanel jPanel4CarrinhoIcon;
    // End of variables declaration//GEN-END:variables
}

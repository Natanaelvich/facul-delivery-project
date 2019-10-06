package views;

public class CaixaDeCompra extends javax.swing.JDialog {

    public CaixaDeCompra(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.jScrollPane2CaixaCompra.getVerticalScrollBar().setUnitIncrement(20);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2CaixaCompra = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1FecharCaixaCompra = new javax.swing.JLabel();
        jLabel2IconProduto = new javax.swing.JLabel();
        jLabel3NomeProduto = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2Preço = new javax.swing.JLabel();
        jLabel2Igredientes = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2CaixaCompra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1FecharCaixaCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Multiply_32px.png"))); // NOI18N
        jLabel1FecharCaixaCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1FecharCaixaCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1FecharCaixaCompraMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1FecharCaixaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        jLabel2IconProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/comida-rapida.png"))); // NOI18N
        jPanel1.add(jLabel2IconProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));

        jLabel3NomeProduto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3NomeProduto.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3NomeProduto.setText("....");
        jPanel1.add(jLabel3NomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Preço  : ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        jLabel2Preço.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2Preço.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2Preço.setText(".....");
        jPanel1.add(jLabel2Preço, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel2Igredientes.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2Igredientes.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2Igredientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2Igredientes.setText(".....");
        jLabel2Igredientes.setToolTipText("");
        jLabel2Igredientes.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2Igredientes.setAutoscrolls(true);
        jPanel1.add(jLabel2Igredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 180, 130));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Ingredientes : ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, -5, 490, 500));

        jScrollPane2CaixaCompra.setViewportView(jPanel3);

        getContentPane().add(jScrollPane2CaixaCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 520, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1FecharCaixaCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1FecharCaixaCompraMouseClicked
       dispose();      
    }//GEN-LAST:event_jLabel1FecharCaixaCompraMouseClicked

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
    public javax.swing.JLabel jLabel2IconProduto;
    public javax.swing.JLabel jLabel2Igredientes;
    public javax.swing.JLabel jLabel2Preço;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel3NomeProduto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2CaixaCompra;
    // End of variables declaration//GEN-END:variables
}

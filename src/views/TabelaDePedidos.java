package views;

import Dao.PedidosDao;

public class TabelaDePedidos extends javax.swing.JFrame {

    public TabelaDePedidos() {
        initComponents();
        PedidosDao.addRowsTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1DadosPedidos = new javax.swing.JTable();
        jLabel1Fechar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 1, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1DadosPedidos.setBackground(new java.awt.Color(255, 255, 255));
        jTable1DadosPedidos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1DadosPedidos.setForeground(new java.awt.Color(51, 51, 51));
        jTable1DadosPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pedido", "Preço", "Data", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1DadosPedidos.setGridColor(new java.awt.Color(102, 102, 102));
        jTable1DadosPedidos.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jTable1DadosPedidos.setSelectionForeground(new java.awt.Color(51, 51, 51));
        jScrollPane1.setViewportView(jTable1DadosPedidos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 530, 360));

        jLabel1Fechar.setBackground(new java.awt.Color(51, 51, 51));
        jLabel1Fechar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1Fechar.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1Fechar.setText("X");
        jLabel1Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1FecharMouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1FecharMouseClicked
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
            java.util.logging.Logger.getLogger(TabelaDePedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> {
            new TabelaDePedidos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1Fechar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1DadosPedidos;
    // End of variables declaration//GEN-END:variables
}

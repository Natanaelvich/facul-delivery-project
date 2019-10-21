package views;

import entites.Produto;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CaixaDeCarrinho extends javax.swing.JDialog {

    public CaixaDeCarrinho(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        if (ProdutosPitstop.produtos.size() > 0) {
            jPanel1Vazio.setVisible(false);
            addnewProduto();
            if (ProdutosPitstop.produtos.size() > 2) {
                jPanel3aumen.setPreferredSize(new Dimension(678, 550));
                if (ProdutosPitstop.produtos.size() > 3) {
                    jPanel3aumen.setPreferredSize(new Dimension(678, 750));
                    if (ProdutosPitstop.produtos.size() > 4) {
                        jPanel3aumen.setPreferredSize(new Dimension(678, 850));
                    }
                }
            }
        } else {
            jPanel1Vazio.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1Vazio = new javax.swing.JPanel();
        jLabel1Nada = new javax.swing.JLabel();
        jLabel1Fechar = new javax.swing.JLabel();
        jScrollPane1Lista = new javax.swing.JScrollPane();
        jPanel3aumen = new javax.swing.JPanel();
        jLabel1Fechar1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(698, 408));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1Vazio.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1Vazio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 5, true));
        jPanel1Vazio.setMinimumSize(new java.awt.Dimension(698, 408));
        jPanel1Vazio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1Nada.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1Nada.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1Nada.setText("Vazio");
        jPanel1Vazio.add(jLabel1Nada, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jLabel1Fechar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1Fechar.setText("x");
        jLabel1Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1FecharMouseClicked(evt);
            }
        });
        jPanel1Vazio.add(jLabel1Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 0, -1, -1));

        getContentPane().add(jPanel1Vazio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 410));

        jScrollPane1Lista.setBorder(null);

        jPanel3aumen.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3aumen.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 5, true));
        jPanel3aumen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1Fechar1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1Fechar1.setText("x");
        jLabel1Fechar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1Fechar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1Fechar1MouseClicked(evt);
            }
        });
        jPanel3aumen.add(jLabel1Fechar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, -1));

        jScrollPane1Lista.setViewportView(jPanel3aumen);

        getContentPane().add(jScrollPane1Lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 700, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void addnewProduto() {
        int posiYP = 30;
        for (int i = 0; i < ProdutosPitstop.produtos.size(); i++) {

            JPanel jPanel3Carac = new javax.swing.JPanel();
            jPanel3Carac.setBackground(new java.awt.Color(204, 204, 204));
            jPanel3Carac.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
            jPanel3Carac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            jPanel3aumen.add(jPanel3Carac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, posiYP, 480, 140));

            JLabel jLabel1NomeP = new javax.swing.JLabel();
            jLabel1NomeP.setFont(new java.awt.Font("Tahoma", 0, 18));
            jLabel1NomeP.setForeground(new java.awt.Color(102, 102, 102));
            jLabel1NomeP.setText("Descrição  : " + ProdutosPitstop.produtos.get(i).getDescricao());
            jPanel3Carac.add(jLabel1NomeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
            //preco
            JLabel preco = new javax.swing.JLabel();
            preco.setFont(new java.awt.Font("Tahoma", 0, 18));
            preco.setForeground(new java.awt.Color(102, 102, 102));
            preco.setText("Preco  : " + ProdutosPitstop.produtos.get(i).getPreco());
            jPanel3Carac.add(preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

            //delete
            JLabel delete = new javax.swing.JLabel();
            delete.setFont(new java.awt.Font("Tahoma", 0, 24));
            delete.setForeground(new java.awt.Color(102, 102, 102));
            delete.setText("x");
            delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            Produto p = ProdutosPitstop.produtos.get(i);
            delete.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                 jPanel3Carac.setVisible(false);
                 ProdutosPitstop.produtos.remove(p);
                }
            });

            jPanel3Carac.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 5, -1, -1));

            posiYP += 160;
        }

    }
    private void jLabel1FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1FecharMouseClicked
        ProdutosPitstop.qtdcarrinho();
        dispose();
    }//GEN-LAST:event_jLabel1FecharMouseClicked

    private void jLabel1Fechar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1Fechar1MouseClicked
        ProdutosPitstop.qtdcarrinho();
        dispose();
    }//GEN-LAST:event_jLabel1Fechar1MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaixaDeCarrinho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            CaixaDeCarrinho dialog = new CaixaDeCarrinho(new javax.swing.JFrame(), true);
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
    private javax.swing.JLabel jLabel1Fechar;
    private javax.swing.JLabel jLabel1Fechar1;
    private javax.swing.JLabel jLabel1Nada;
    private javax.swing.JPanel jPanel1Vazio;
    private javax.swing.JPanel jPanel3aumen;
    private javax.swing.JScrollPane jScrollPane1Lista;
    // End of variables declaration//GEN-END:variables
}

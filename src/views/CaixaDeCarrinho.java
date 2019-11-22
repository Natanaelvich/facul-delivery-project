package views;

import Dao.PedidosDao;
import Dao.UserDao;
import entites.Produto;
import java.awt.Dimension;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CaixaDeCarrinho extends javax.swing.JDialog {

    JanelaPrinci janelaPrinci = new JanelaPrinci();

    public CaixaDeCarrinho(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.jScrollPane1Lista.getVerticalScrollBar().setUnitIncrement(15);

        if (JanelaPrinci.produtos.size() > 0) {
            jPanel1Vazio.setVisible(false);
            addnewProduto();
            if (JanelaPrinci.produtos.size() > 2) {
                jPanel3aumen.setPreferredSize(new Dimension(678, 550));
                jPanel3aumen.add(jLabel2ConfirTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));
                jPanel3aumen.add(jLabel4confirICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 495, -1, -1));
                jPanel3aumen.add(jLabel2CanceTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 500, -1, -1));
                jPanel3aumen.add(jLabel4CanceIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 495, -1, -1));
                if (JanelaPrinci.produtos.size() > 3) {
                    jPanel3aumen.setPreferredSize(new Dimension(678, 750));
                    jPanel3aumen.add(jLabel2ConfirTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, -1, -1));
                    jPanel3aumen.add(jLabel4confirICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 695, -1, -1));
                    jPanel3aumen.add(jLabel2CanceTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 700, -1, -1));
                    jPanel3aumen.add(jLabel4CanceIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 695, -1, -1));
                    if (JanelaPrinci.produtos.size() > 4) {
                        jPanel3aumen.setPreferredSize(new Dimension(678, 900));
                        jPanel3aumen.add(jLabel2ConfirTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 850, -1, -1));
                        jPanel3aumen.add(jLabel4confirICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 845, -1, -1));
                        jPanel3aumen.add(jLabel2CanceTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 850, -1, -1));
                        jPanel3aumen.add(jLabel4CanceIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 845, -1, -1));
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
        jLabel2ConfirTEXT = new javax.swing.JLabel();
        jLabel4confirICON = new javax.swing.JLabel();
        jLabel2CanceTEXT = new javax.swing.JLabel();
        jLabel4CanceIcon = new javax.swing.JLabel();

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

        jLabel2ConfirTEXT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2ConfirTEXT.setForeground(new java.awt.Color(0, 204, 0));
        jLabel2ConfirTEXT.setText("Confirmar Pedidos");
        jLabel2ConfirTEXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2ConfirTEXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2ConfirTEXTMouseClicked(evt);
            }
        });
        jPanel3aumen.add(jLabel2ConfirTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel4confirICON.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/ok.png"))); // NOI18N
        jPanel3aumen.add(jLabel4confirICON, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 350, -1, -1));

        jLabel2CanceTEXT.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2CanceTEXT.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2CanceTEXT.setText("Cancelar Todos");
        jLabel2CanceTEXT.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2CanceTEXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2CanceTEXTMouseClicked(evt);
            }
        });
        jPanel3aumen.add(jLabel2CanceTEXT, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));

        jLabel4CanceIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/erro.png"))); // NOI18N
        jPanel3aumen.add(jLabel4CanceIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 350, -1, -1));

        jScrollPane1Lista.setViewportView(jPanel3aumen);

        getContentPane().add(jScrollPane1Lista, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 700, 410));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addnewProduto() {
        int posiYP = 30;
        for (int i = 0; i < JanelaPrinci.produtos.size(); i++) {

            JPanel jPanel3Carac = new javax.swing.JPanel();
            jPanel3Carac.setBackground(new java.awt.Color(204, 204, 204));
            jPanel3Carac.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 102, 102), 3, true));
            jPanel3Carac.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
            jPanel3aumen.add(jPanel3Carac, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, posiYP, 480, 140));

            JLabel jLabel1NomeP = new javax.swing.JLabel();
            jLabel1NomeP.setFont(new java.awt.Font("Tahoma", 0, 18));
            jLabel1NomeP.setForeground(new java.awt.Color(102, 102, 102));
            jLabel1NomeP.setText("Descrição  : " + JanelaPrinci.produtos.get(i).getDescricao());
            jPanel3Carac.add(jLabel1NomeP, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, -1, -1));
            //preco
            JLabel preco = new javax.swing.JLabel();
            preco.setFont(new java.awt.Font("Tahoma", 0, 18));
            preco.setForeground(new java.awt.Color(102, 102, 102));
            preco.setText("Preco  : " + JanelaPrinci.produtos.get(i).getPreco());
            jPanel3Carac.add(preco, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

            //delete
            JLabel delete = new javax.swing.JLabel();
            delete.setFont(new java.awt.Font("Tahoma", 0, 24));
            delete.setForeground(new java.awt.Color(102, 102, 102));
            delete.setText("x");
            delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            Produto p = JanelaPrinci.produtos.get(i);
            delete.addMouseListener(new java.awt.event.MouseAdapter() {
                @Override
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    jPanel3Carac.setVisible(false);
                    JanelaPrinci.produtos.remove(p);
                }
            });

            jPanel3Carac.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 5, -1, -1));

            posiYP += 160;
        }

    }
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

    private void jLabel1Fechar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1Fechar1MouseClicked
         //verificando se as janelas de produtos estao ativas
        if (ProdutosPitstop.ativo) {
            ProdutosPitstop.qtdcarrinho();
        }
        ProdutosPitstop.qtdcarrinho();
        if (ProdutosPontes.ativo) {
            ProdutosPontes.qtdcarrinho();
        }
        dispose();
    }//GEN-LAST:event_jLabel1Fechar1MouseClicked

    private void jLabel2CanceTEXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2CanceTEXTMouseClicked
        JanelaPrinci.produtos.clear();
         //verificando se as janelas de produtos estao ativas
        if (ProdutosPitstop.ativo) {
            ProdutosPitstop.qtdcarrinho();
        }
        ProdutosPitstop.qtdcarrinho();
        if (ProdutosPontes.ativo) {
            ProdutosPontes.qtdcarrinho();
        }
        dispose();
    }//GEN-LAST:event_jLabel2CanceTEXTMouseClicked

    //salvando pedidos
    private void jLabel2ConfirTEXTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2ConfirTEXTMouseClicked
        for (int i = 0; i < JanelaPrinci.produtos.size(); i++) {
            PedidosDao.salvarPedido(UserDao.getUserID(TelaDeLogin.jTextField1User.getText(), TelaDeLogin.jTextField2Senha.getText()), JanelaPrinci.produtos.get(i).getId());
        }
        dispose();
    }//GEN-LAST:event_jLabel2ConfirTEXTMouseClicked

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
    private javax.swing.JLabel jLabel2CanceTEXT;
    private javax.swing.JLabel jLabel2ConfirTEXT;
    private javax.swing.JLabel jLabel4CanceIcon;
    private javax.swing.JLabel jLabel4confirICON;
    private javax.swing.JPanel jPanel1Vazio;
    private javax.swing.JPanel jPanel3aumen;
    private javax.swing.JScrollPane jScrollPane1Lista;
    // End of variables declaration//GEN-END:variables
}

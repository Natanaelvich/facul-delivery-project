package views;

import AppPackage.AnimationClass;
import entites.Produto;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JanelaPrinci extends javax.swing.JFrame {

    public static ArrayList<Produto> produtos = new ArrayList<>();

    public JanelaPrinci() {
        initComponents();
        this.setLocationRelativeTo(null);
        desableHoverEmpresas();
        this.jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);
    }

    private void desableHoverEmpresas() {
        jLabel25_1.setVisible(false);
        jLabel31_2.setVisible(false);
        jLabel32_3.setVisible(false);
        jLabel33_4.setVisible(false);
        jLabel34_5.setVisible(false);
        jLabel35_6.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelSlider2 = new diu.swe.habib.JPanelSlider.JPanelSlider();
        jPanel2inicioLogo = new javax.swing.JPanel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel7Iconlogo = new javax.swing.JLabel();
        jPanel1Lateral = new javax.swing.JPanel();
        jLabel6MenuDeslizar = new javax.swing.JLabel();
        jLabel21User = new javax.swing.JLabel();
        jLabel22Deslogar = new javax.swing.JLabel();
        jLabel7inicio = new javax.swing.JLabel();
        jLabel7pedidos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel26PitStop = new javax.swing.JLabel();
        jLabel27Pontes = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel25_1 = new javax.swing.JLabel();
        jLabel31_2 = new javax.swing.JLabel();
        jLabel32_3 = new javax.swing.JLabel();
        jLabel33_4 = new javax.swing.JLabel();
        jLabel34_5 = new javax.swing.JLabel();
        jLabel35_6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel20Minimizar = new javax.swing.JLabel();
        jLabel21Fechar = new javax.swing.JLabel();
        jLabel7NomeEmpresa = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel9QuantiCarrinho = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(1050, 687));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1050, 687));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelSlider2.setBorder(null);

        jPanel2inicioLogo.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2inicioLogo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator8.setBackground(new java.awt.Color(255, 51, 51));
        jSeparator8.setForeground(new java.awt.Color(255, 51, 51));
        jSeparator8.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jPanel2inicioLogo.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 620, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 130)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 51));
        jLabel8.setText("AiFurbe");
        jPanel2inicioLogo.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 440, 150));

        jLabel7Iconlogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/IconLogo.png"))); // NOI18N
        jPanel2inicioLogo.add(jLabel7Iconlogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 150, 160, 140));

        jPanelSlider2.add(jPanel2inicioLogo, "card2");

        getContentPane().add(jPanelSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 79, 760, 610));

        jPanel1Lateral.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1Lateral.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1Lateral.setPreferredSize(new java.awt.Dimension(290, 555));
        jPanel1Lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6MenuDeslizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Menu_32px.png"))); // NOI18N
        jLabel6MenuDeslizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6MenuDeslizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel6MenuDeslizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel6MenuDeslizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MenuDeslizarMouseClicked(evt);
            }
        });
        jPanel1Lateral.add(jLabel6MenuDeslizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel21User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_customer_32px_1.png"))); // NOI18N
        jLabel21User.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21UserMouseClicked(evt);
            }
        });
        jPanel1Lateral.add(jLabel21User, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 23, -1, -1));

        jLabel22Deslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sair.png"))); // NOI18N
        jPanel1Lateral.add(jLabel22Deslogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 27, -1, -1));

        jLabel7inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/botao-inicio.png"))); // NOI18N
        jLabel7inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7inicioMouseClicked(evt);
            }
        });
        jPanel1Lateral.add(jLabel7inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 23, -1, -1));

        jLabel7pedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/escolhas.png"))); // NOI18N
        jLabel7pedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7pedidos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7pedidosMouseClicked(evt);
            }
        });
        jPanel1Lateral.add(jLabel7pedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 23, -1, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pizzariaICON.png"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 660, -1, -1));

        jLabel26PitStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pizzariaICON.png"))); // NOI18N
        jLabel26PitStop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26PitStop.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel26PitStopMouseMoved(evt);
            }
        });
        jLabel26PitStop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel26PitStopMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel26PitStopMouseExited(evt);
            }
        });
        jPanel5.add(jLabel26PitStop, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel27Pontes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Hamburgueria_1.png"))); // NOI18N
        jLabel27Pontes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27Pontes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel27PontesMouseMoved(evt);
            }
        });
        jLabel27Pontes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27PontesMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27PontesMouseExited(evt);
            }
        });
        jPanel5.add(jLabel27Pontes, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pizzariaICON.png"))); // NOI18N
        jLabel28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pizzariaICON.png"))); // NOI18N
        jLabel29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pizzariaICON.png"))); // NOI18N
        jLabel30.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, -1, -1));
        jPanel5.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 750, 130, 10));
        jPanel5.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 130, 10));
        jPanel5.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 130, 10));
        jPanel5.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 130, 10));
        jPanel5.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, 130, 10));
        jPanel5.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, 130, 10));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Pizzaria PitStop");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 720, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Pizzaria PitStop");
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Pontes");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setText("Pizzaria PitStop");
        jPanel5.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 102, 102));
        jLabel22.setText("Pizzaria PitStop");
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(102, 102, 102));
        jLabel23.setText("Pizzaria PitStop");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        jLabel25_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/silhueta-de-forma-circular.png"))); // NOI18N
        jPanel5.add(jLabel25_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 40, 90, -1));

        jLabel31_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/silhueta-de-forma-circular.png"))); // NOI18N
        jPanel5.add(jLabel31_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 170, -1, -1));

        jLabel32_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/silhueta-de-forma-circular.png"))); // NOI18N
        jPanel5.add(jLabel32_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 290, -1, -1));

        jLabel33_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/silhueta-de-forma-circular.png"))); // NOI18N
        jPanel5.add(jLabel33_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 410, -1, -1));

        jLabel34_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/silhueta-de-forma-circular.png"))); // NOI18N
        jPanel5.add(jLabel34_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 530, -1, -1));

        jLabel35_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/silhueta-de-forma-circular.png"))); // NOI18N
        jPanel5.add(jLabel35_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 650, -1, -1));

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 230, 940));

        jScrollPane1.setViewportView(jPanel3);

        jPanel1Lateral.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 290, 620));

        getContentPane().add(jPanel1Lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 690));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20Minimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel20Minimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20Minimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MinimizarMouseClicked(evt);
            }
        });
        jPanel4.add(jLabel20Minimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        jLabel21Fechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Multiply_32px.png"))); // NOI18N
        jLabel21Fechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21Fechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21FecharMouseClicked(evt);
            }
        });
        jPanel4.add(jLabel21Fechar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        jLabel7NomeEmpresa.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel7NomeEmpresa.setForeground(new java.awt.Color(102, 102, 102));
        jLabel7NomeEmpresa.setText("Inicio");
        jPanel4.add(jLabel7NomeEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jSeparator7.setBackground(new java.awt.Color(102, 102, 102));
        jSeparator7.setForeground(new java.awt.Color(102, 102, 102));
        jPanel4.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 300, 10));

        jLabel9QuantiCarrinho.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9QuantiCarrinho.setForeground(new java.awt.Color(204, 0, 0));
        jLabel9QuantiCarrinho.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.add(jLabel9QuantiCarrinho, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 10, -1, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 80));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void qtdcarrinho() {
        if (produtos.size() > 0) {
            jLabel9QuantiCarrinho.setText(Integer.toString(produtos.size()));
            System.out.println("sim");
        } else {
            jLabel9QuantiCarrinho.setText("0");
        }
    }
    private void jLabel6MenuDeslizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MenuDeslizarMouseClicked
        AnimationClass animatioOPT = new AnimationClass();

        animatioOPT.jLabelXLeft(300, 70, 5, 5, jLabel21User);
        animatioOPT.jLabelXRight(70, 300, 5, 5, jLabel21User);

        animatioOPT.jLabelXLeft(350, 110, 5, 5, jLabel22Deslogar);
        animatioOPT.jLabelXRight(110, 350, 5, 5, jLabel22Deslogar);

        animatioOPT.jLabelXLeft(400, 150, 5, 5, jLabel7inicio);
        animatioOPT.jLabelXRight(150, 400, 5, 5, jLabel7inicio);
        
        animatioOPT.jLabelXLeft(450, 190, 5, 5, jLabel7pedidos);
        animatioOPT.jLabelXRight(190, 450, 5, 5, jLabel7pedidos);
    }//GEN-LAST:event_jLabel6MenuDeslizarMouseClicked

    private void jLabel21FecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21FecharMouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int res = JOptionPane.showConfirmDialog(null, "REALMENTE DESEJA SAIR?", "SAIR", dialog);
        if (res == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel21FecharMouseClicked

    private void jLabel20MinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MinimizarMouseClicked
        this.setState(JanelaPrinci.ICONIFIED);
    }//GEN-LAST:event_jLabel20MinimizarMouseClicked

    private void jLabel26PitStopMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26PitStopMouseMoved
        jLabel25_1.setVisible(true);
    }//GEN-LAST:event_jLabel26PitStopMouseMoved

    private void jLabel26PitStopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26PitStopMouseExited
        jLabel25_1.setVisible(false);
    }//GEN-LAST:event_jLabel26PitStopMouseExited

    private void jLabel27PontesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27PontesMouseMoved
        jLabel31_2.setVisible(true);
    }//GEN-LAST:event_jLabel27PontesMouseMoved

    private void jLabel27PontesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27PontesMouseExited
        jLabel31_2.setVisible(false);
    }//GEN-LAST:event_jLabel27PontesMouseExited

//GEN-FIRST:event_jLabel8MouseMoved

//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel26PitStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26PitStopMouseClicked
        ProdutosPitstop produtosPitstops = new ProdutosPitstop();
        jPanelSlider2.add(produtosPitstops);
        jPanelSlider2.nextPanel(10, produtosPitstops, rootPaneCheckingEnabled);
        jLabel7NomeEmpresa.setText("PitStop");
    }//GEN-LAST:event_jLabel26PitStopMouseClicked

    private void jLabel27PontesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27PontesMouseClicked
        ProdutosPontes produtosPontes = new ProdutosPontes();
        jPanelSlider2.add(produtosPontes);
        jPanelSlider2.nextPanel(10, produtosPontes, rootPaneCheckingEnabled);
        jLabel7NomeEmpresa.setText("Pontes");

    }//GEN-LAST:event_jLabel27PontesMouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked


    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked

    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel7inicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7inicioMouseClicked
        jPanelSlider2.nextPanel(10, jPanel2inicioLogo, rootPaneCheckingEnabled);
        jLabel7NomeEmpresa.setText("Inicio");
    }//GEN-LAST:event_jLabel7inicioMouseClicked

    private void jLabel21UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21UserMouseClicked
        TelaDeUsuario telaDeUsuario = new TelaDeUsuario();
        jPanelSlider2.add(telaDeUsuario);
        jPanelSlider2.nextPanel(10, telaDeUsuario, rootPaneCheckingEnabled);

    }//GEN-LAST:event_jLabel21UserMouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked

    }//GEN-LAST:event_jPanel4MouseClicked

    //mostrar pedidos realizados
    private void jLabel7pedidosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7pedidosMouseClicked
        TabelaDePedidosEStatus tdpes = new TabelaDePedidosEStatus();
        jPanelSlider2.add(tdpes);
        jPanelSlider2.nextPanel(10, tdpes, rootPaneCheckingEnabled);
        jLabel7NomeEmpresa.setText("Pedidos");
    }//GEN-LAST:event_jLabel7pedidosMouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaPrinci.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new JanelaPrinci().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20Minimizar;
    private javax.swing.JLabel jLabel21Fechar;
    private javax.swing.JLabel jLabel21User;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel22Deslogar;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25_1;
    private javax.swing.JLabel jLabel26PitStop;
    private javax.swing.JLabel jLabel27Pontes;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31_2;
    private javax.swing.JLabel jLabel32_3;
    private javax.swing.JLabel jLabel33_4;
    private javax.swing.JLabel jLabel34_5;
    private javax.swing.JLabel jLabel35_6;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6MenuDeslizar;
    private javax.swing.JLabel jLabel7Iconlogo;
    private javax.swing.JLabel jLabel7NomeEmpresa;
    private javax.swing.JLabel jLabel7inicio;
    private javax.swing.JLabel jLabel7pedidos;
    private javax.swing.JLabel jLabel8;
    public static transient javax.swing.JLabel jLabel9QuantiCarrinho;
    private javax.swing.JPanel jPanel1Lateral;
    private javax.swing.JPanel jPanel2inicioLogo;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private diu.swe.habib.JPanelSlider.JPanelSlider jPanelSlider2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    // End of variables declaration//GEN-END:variables
}

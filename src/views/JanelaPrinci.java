package views;

import AppPackage.AnimationClass;
import java.awt.Color;
import javax.swing.JOptionPane;

public class JanelaPrinci extends javax.swing.JFrame {
    
    public JanelaPrinci() {
        initComponents();
        this.setLocationRelativeTo(null);
        desableHoverEmpresas();
        this.jScrollPane2Produtos.getVerticalScrollBar().setUnitIncrement(20);
        this.jScrollPane2ProdutosPontes.getVerticalScrollBar().setUnitIncrement(20);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2Produtos = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel8Pizza1 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jScrollPane2ProdutosPontes = new javax.swing.JScrollPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel8Pizza2 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel1Lateral = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21User = new javax.swing.JLabel();
        jLabel22Deslogar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel26PitStop = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
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
        jTextField1 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelSlider2.setBorder(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/tenda.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, 440));

        jPanelSlider2.add(jPanel2, "card2");

        jScrollPane2Produtos.setBorder(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(730, 1299));
        jPanel1.setPreferredSize(new java.awt.Dimension(760, 1299));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 102, 102));
        jLabel13.setText("Romeu e Julieta");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 480, -1, -1));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/PIZZA-ROMEU-E-JULIETA-800x480.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7MouseMoved(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 330, 180, 150));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/portuguesa.png"))); // NOI18N
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel9MouseMoved(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 180, 150));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/muçarela.png"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel10MouseMoved(evt);
            }
        });
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 180, 150));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Frango-com-catupiry1.png"))); // NOI18N
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel11MouseMoved(evt);
            }
        });
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel11MouseExited(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 180, 150));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/napolitana.png"))); // NOI18N
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel12MouseMoved(evt);
            }
        });
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel12MouseExited(evt);
            }
        });
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 180, 150));

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/coxinha.png"))); // NOI18N
        jLabel24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel24.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel24MouseMoved(evt);
            }
        });
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel24MouseExited(evt);
            }
        });
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 180, 150));

        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pastel.png"))); // NOI18N
        jLabel26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel26.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel26MouseMoved(evt);
            }
        });
        jLabel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel26MouseExited(evt);
            }
        });
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 710, 180, 150));

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/coxinhaDecopo.png"))); // NOI18N
        jLabel32.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel32.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel32MouseMoved(evt);
            }
        });
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel32MouseExited(evt);
            }
        });
        jPanel1.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 700, 200, 160));

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/agua.png"))); // NOI18N
        jLabel34.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel34.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel34MouseMoved(evt);
            }
        });
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel34MouseExited(evt);
            }
        });
        jPanel1.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 1100, 180, 150));

        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/suco-de-laranja.png"))); // NOI18N
        jLabel36.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel36.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel36MouseMoved(evt);
            }
        });
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel36MouseExited(evt);
            }
        });
        jPanel1.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 1100, 180, 150));

        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/coca.png"))); // NOI18N
        jLabel38.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel38.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel38MouseMoved(evt);
            }
        });
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel38MouseExited(evt);
            }
        });
        jPanel1.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1100, 180, 150));

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 102, 51));
        jLabel40.setText("Bebidas");
        jPanel1.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 950, -1, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 102, 51));
        jLabel42.setText("Pizzas");
        jPanel1.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jSeparator7.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1050, 510, 10));

        jSeparator8.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 510, 10));

        jSeparator9.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 510, 10));

        jSeparator10.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 690, 510, 10));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Portuguesa");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(102, 102, 102));
        jLabel16.setText("Muçarela");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(102, 102, 102));
        jLabel17.setText("Coxinha de copo");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 870, -1, -1));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 102, 102));
        jLabel18.setText(" Napolitana");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(102, 102, 102));
        jLabel43.setText("Frango com catupiry");
        jPanel1.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(102, 102, 102));
        jLabel25.setText("Coxinha de Frango");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 860, -1, -1));

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(102, 102, 102));
        jLabel31.setText("Água");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 1270, -1, -1));

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 102, 51));
        jLabel44.setText("Salgados");
        jPanel1.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, -1, -1));

        jSeparator11.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 910, 510, 10));

        jSeparator12.setForeground(new java.awt.Color(153, 153, 153));
        jPanel1.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 910, 510, 10));

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(102, 102, 102));
        jLabel33.setText("Pastel");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 860, -1, -1));

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(102, 102, 102));
        jLabel45.setText("Refri");
        jPanel1.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1270, -1, -1));

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(102, 102, 102));
        jLabel46.setText("Suco");
        jPanel1.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 1270, -1, -1));

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(102, 102, 102));
        jLabel47.setText("Suco");
        jPanel1.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 1270, -1, -1));

        jLabel8Pizza1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8Pizza1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/PizzaMexicana.png"))); // NOI18N
        jLabel8Pizza1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8Pizza1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8Pizza1MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel8Pizza1MouseMoved(evt);
            }
        });
        jLabel8Pizza1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8Pizza1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel8Pizza1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, 150));

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(102, 102, 102));
        jLabel48.setText("Pizza Mexicana");
        jPanel1.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jScrollPane2Produtos.setViewportView(jPanel1);

        jPanelSlider2.add(jScrollPane2Produtos, "card2");

        jScrollPane2ProdutosPontes.setBorder(null);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setMinimumSize(new java.awt.Dimension(730, 1299));
        jPanel6.setPreferredSize(new java.awt.Dimension(760, 1299));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/portuguesa.png"))); // NOI18N
        jLabel37.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel37.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel37MouseMoved(evt);
            }
        });
        jLabel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel37MouseExited(evt);
            }
        });
        jPanel6.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 180, 150));

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/muçarela.png"))); // NOI18N
        jLabel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel39.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel39MouseMoved(evt);
            }
        });
        jLabel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel39MouseExited(evt);
            }
        });
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 180, 150));

        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Frango-com-catupiry1.png"))); // NOI18N
        jLabel41.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel41.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel41MouseMoved(evt);
            }
        });
        jLabel41.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel41MouseExited(evt);
            }
        });
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 180, 150));

        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/coxinha.png"))); // NOI18N
        jLabel50.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel50.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel50MouseMoved(evt);
            }
        });
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel50MouseExited(evt);
            }
        });
        jPanel6.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 700, 180, 150));

        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pastel.png"))); // NOI18N
        jLabel51.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel51.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel51MouseMoved(evt);
            }
        });
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel51MouseExited(evt);
            }
        });
        jPanel6.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 710, 180, 150));

        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/coxinhaDecopo.png"))); // NOI18N
        jLabel52.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel52.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel52MouseMoved(evt);
            }
        });
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel52MouseExited(evt);
            }
        });
        jPanel6.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 700, 200, 160));

        jLabel54.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/suco-de-laranja.png"))); // NOI18N
        jLabel54.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel54.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel54MouseMoved(evt);
            }
        });
        jLabel54.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel54MouseExited(evt);
            }
        });
        jPanel6.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 1100, 180, 150));

        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/coca.png"))); // NOI18N
        jLabel55.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel55.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel55MouseMoved(evt);
            }
        });
        jLabel55.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel55MouseExited(evt);
            }
        });
        jPanel6.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1100, 180, 150));

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 102, 51));
        jLabel56.setText("Bebidas");
        jPanel6.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 950, -1, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 102, 51));
        jLabel57.setText("Pizzas");
        jPanel6.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jSeparator13.setForeground(new java.awt.Color(153, 153, 153));
        jPanel6.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1050, 510, 10));

        jSeparator14.setForeground(new java.awt.Color(153, 153, 153));
        jPanel6.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, 510, 10));

        jSeparator15.setForeground(new java.awt.Color(153, 153, 153));
        jPanel6.add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 510, 10));

        jSeparator16.setForeground(new java.awt.Color(153, 153, 153));
        jPanel6.add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 690, 510, 10));

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(102, 102, 102));
        jLabel58.setText("Portuguesa");
        jPanel6.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, -1, -1));

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(102, 102, 102));
        jLabel59.setText("Muçarela");
        jPanel6.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 280, -1, -1));

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(102, 102, 102));
        jLabel60.setText("Coxinha de copo");
        jPanel6.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 870, -1, -1));

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(102, 102, 102));
        jLabel62.setText("Frango com catupiry");
        jPanel6.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(102, 102, 102));
        jLabel63.setText("Coxinha de Frango");
        jPanel6.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 860, -1, -1));

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 102, 51));
        jLabel65.setText("Salgados");
        jPanel6.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, -1, -1));

        jSeparator17.setForeground(new java.awt.Color(153, 153, 153));
        jPanel6.add(jSeparator17, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 910, 510, 10));

        jSeparator18.setForeground(new java.awt.Color(153, 153, 153));
        jPanel6.add(jSeparator18, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 910, 510, 10));

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(102, 102, 102));
        jLabel66.setText("Pastel");
        jPanel6.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 860, -1, -1));

        jLabel67.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(102, 102, 102));
        jLabel67.setText("Refri");
        jPanel6.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1270, -1, -1));

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(102, 102, 102));
        jLabel68.setText("Suco");
        jPanel6.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 1270, -1, -1));

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(102, 102, 102));
        jLabel69.setText("Suco");
        jPanel6.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 1270, -1, -1));

        jLabel8Pizza2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8Pizza2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/PizzaMexicana.png"))); // NOI18N
        jLabel8Pizza2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8Pizza2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel8Pizza2MouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel8Pizza2MouseMoved(evt);
            }
        });
        jLabel8Pizza2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel8Pizza2MouseExited(evt);
            }
        });
        jPanel6.add(jLabel8Pizza2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 180, 150));

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(102, 102, 102));
        jLabel70.setText("Pizza Mexicana");
        jPanel6.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jScrollPane2ProdutosPontes.setViewportView(jPanel6);

        jPanelSlider2.add(jScrollPane2ProdutosPontes, "card2");

        getContentPane().add(jPanelSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 79, 760, 475));

        jPanel1Lateral.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1Lateral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        jPanel1Lateral.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1Lateral.setPreferredSize(new java.awt.Dimension(290, 555));
        jPanel1Lateral.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Menu_32px.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1Lateral.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jLabel21User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_customer_32px_1.png"))); // NOI18N
        jPanel1Lateral.add(jLabel21User, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 23, -1, -1));

        jLabel22Deslogar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/sair.png"))); // NOI18N
        jPanel1Lateral.add(jLabel22Deslogar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 27, -1, -1));

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

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/Hamburgueria_1.png"))); // NOI18N
        jLabel27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel27.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel27MouseMoved(evt);
            }
        });
        jLabel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel27MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel27MouseExited(evt);
            }
        });
        jPanel5.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

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

        jPanel1Lateral.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 290, 490));

        getContentPane().add(jPanel1Lateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setBackground(new java.awt.Color(255, 255, 255));
        jTextField1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(153, 153, 153));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jTextField1.setToolTipText("");
        jTextField1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(242, 97, 36), 1, true));
        jPanel4.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(135, 22, 320, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Search_32px_2.png"))); // NOI18N
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, -1));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/icons8_Multiply_32px.png"))); // NOI18N
        jLabel21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 760, 80));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        AnimationClass animatioOPT = new AnimationClass();
        
        animatioOPT.jLabelXLeft(300, 70, 5, 5, jLabel21User);
        animatioOPT.jLabelXRight(70, 300, 5, 5, jLabel21User);
        
        animatioOPT.jLabelXLeft(350, 110, 5, 5, jLabel22Deslogar);
        animatioOPT.jLabelXRight(110, 350, 5, 5, jLabel22Deslogar);
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        int dialog = JOptionPane.YES_NO_OPTION;
        int res = JOptionPane.showConfirmDialog(null, "REALMENTE DESEJA SAIR?", "SAIR", dialog);
        if (res == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
        this.setState(JanelaPrinci.ICONIFIED);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel26PitStopMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26PitStopMouseMoved
        jLabel25_1.setVisible(true);
    }//GEN-LAST:event_jLabel26PitStopMouseMoved

    private void jLabel26PitStopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26PitStopMouseExited
        jLabel25_1.setVisible(false);
    }//GEN-LAST:event_jLabel26PitStopMouseExited

    private void jLabel27MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseMoved
        jLabel31_2.setVisible(true);
    }//GEN-LAST:event_jLabel27MouseMoved

    private void jLabel27MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseExited
        jLabel31_2.setVisible(false);
    }//GEN-LAST:event_jLabel27MouseExited

    private void jLabel38MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel38MouseExited

    private void jLabel38MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel38MouseMoved

    private void jLabel36MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel36MouseExited

    private void jLabel36MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel36MouseMoved

    private void jLabel34MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel34MouseExited

    private void jLabel34MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel34MouseMoved

    private void jLabel32MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel32MouseExited

    private void jLabel32MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel32MouseMoved

    private void jLabel26MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MouseExited

    private void jLabel26MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel26MouseMoved

    private void jLabel24MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseExited

    private void jLabel24MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MouseMoved

    private void jLabel12MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseExited
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel12MouseExited

    private void jLabel12MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseMoved
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel12MouseMoved

    private void jLabel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseExited
        // TODO add your handling code here:
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel11MouseExited

    private void jLabel11MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseMoved
        // TODO add your handling code here:
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel11MouseMoved

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel10MouseExited

    private void jLabel10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseMoved
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel10MouseMoved

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel9MouseExited

    private void jLabel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseMoved
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel9MouseMoved

//GEN-FIRST:event_jLabel8MouseMoved
 
//GEN-LAST:event_jLabel8MouseMoved

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        // TODO add your handling code here:
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseMoved
        // TODO add your handling code here:
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel7MouseMoved

    private void jLabel8Pizza1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8Pizza1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8Pizza1MouseDragged

    private void jLabel8Pizza1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8Pizza1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8Pizza1MouseMoved

    private void jLabel8Pizza1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8Pizza1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8Pizza1MouseExited

    private void jLabel26PitStopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel26PitStopMouseClicked
        // TODO add your handling code here:
        jPanelSlider2.nextPanel(10, jScrollPane2Produtos, rootPaneCheckingEnabled);
                
    }//GEN-LAST:event_jLabel26PitStopMouseClicked

    private void jLabel37MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel37MouseMoved

    private void jLabel37MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel37MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel37MouseExited

    private void jLabel39MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel39MouseMoved

    private void jLabel39MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel39MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel39MouseExited

    private void jLabel41MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel41MouseMoved

    private void jLabel41MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel41MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel41MouseExited

    private void jLabel50MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel50MouseMoved

    private void jLabel50MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel50MouseExited

    private void jLabel51MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel51MouseMoved

    private void jLabel51MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel51MouseExited

    private void jLabel52MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel52MouseMoved

    private void jLabel52MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel52MouseExited

    private void jLabel54MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel54MouseMoved

    private void jLabel54MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel54MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel54MouseExited

    private void jLabel55MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel55MouseMoved

    private void jLabel55MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel55MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel55MouseExited

    private void jLabel8Pizza2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8Pizza2MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8Pizza2MouseDragged

    private void jLabel8Pizza2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8Pizza2MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8Pizza2MouseMoved

    private void jLabel8Pizza2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8Pizza2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8Pizza2MouseExited

    private void jLabel27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel27MouseClicked
        // TODO add your handling code here:
        jPanelSlider2.nextPanel(10, jScrollPane2ProdutosPontes, rootPaneCheckingEnabled);
        
    }//GEN-LAST:event_jLabel27MouseClicked

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
        // TODO add your handling code here:
        Produtos produtosClass = new Produtos();
        jPanelSlider2.add(produtosClass);
        jPanelSlider2.nextPanel(10, produtosClass, rootPaneCheckingEnabled);
        
    }//GEN-LAST:event_jLabel28MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
        // TODO add your handling code here:
        ProdutosXtudo produtosClass = new ProdutosXtudo();
        jPanelSlider2.add(produtosClass);
        jPanelSlider2.nextPanel(10, produtosClass, rootPaneCheckingEnabled);
    }//GEN-LAST:event_jLabel29MouseClicked

   
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel21User;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel22Deslogar;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel25_1;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel26PitStop;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel31_2;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel32_3;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel33_4;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel34_5;
    private javax.swing.JLabel jLabel35_6;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel8Pizza1;
    private javax.swing.JLabel jLabel8Pizza2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1Lateral;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private diu.swe.habib.JPanelSlider.JPanelSlider jPanelSlider2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2Produtos;
    private javax.swing.JScrollPane jScrollPane2ProdutosPontes;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

package views;

import Dao.UserDao;
import entites.Usuario;

public class TelaDeUsuario extends javax.swing.JPanel {

    public TelaDeUsuario() {
        initComponents();
        preencherDadosUser();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1UserTela = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1EmailUser = new javax.swing.JLabel();
        jLabel2NomeUser = new javax.swing.JLabel();
        jLabel6Telefone = new javax.swing.JLabel();
        jLabel1IconUser = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1UserTela.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1UserTela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nome");
        jPanel1UserTela.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Telefone");
        jPanel1UserTela.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Email");
        jPanel1UserTela.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 370, -1, -1));

        jLabel1EmailUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1EmailUser.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1EmailUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1EmailUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1UserTela.add(jLabel1EmailUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 420, -1, -1));

        jLabel2NomeUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2NomeUser.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2NomeUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2NomeUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1UserTela.add(jLabel2NomeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel6Telefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6Telefone.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6Telefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6Telefone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1UserTela.add(jLabel6Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, -1, -1));

        jLabel1IconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/do-utilizador.png"))); // NOI18N
        jPanel1UserTela.add(jLabel1IconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        add(jPanel1UserTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 610));
    }// </editor-fold>//GEN-END:initComponents

    //preencher campos com dados do usuario
    private void preencherDadosUser(){
        Usuario user = UserDao.userDados();
        jLabel2NomeUser.setText(user.getNome());
        jLabel1EmailUser.setText(user.getEmail());
        jLabel6Telefone.setText(user.getTelefone());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1EmailUser;
    private javax.swing.JLabel jLabel1IconUser;
    private javax.swing.JLabel jLabel2NomeUser;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6Telefone;
    private javax.swing.JPanel jPanel1UserTela;
    // End of variables declaration//GEN-END:variables
}

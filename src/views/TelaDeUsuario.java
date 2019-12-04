package views;

import Dao.EnderecoDao;
import Dao.UserDao;
import entites.Endereco;
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
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1NumEndereco = new javax.swing.JLabel();
        jLabel2BairroEndereco = new javax.swing.JLabel();
        jLabel6RuaEndereco = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1UserTela.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1UserTela.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nome");
        jPanel1UserTela.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Telefone");
        jPanel1UserTela.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Email");
        jPanel1UserTela.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));

        jLabel1EmailUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1EmailUser.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1EmailUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1EmailUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1UserTela.add(jLabel1EmailUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        jLabel2NomeUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2NomeUser.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2NomeUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2NomeUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1UserTela.add(jLabel2NomeUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, -1, -1));

        jLabel6Telefone.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6Telefone.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6Telefone.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6Telefone.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1UserTela.add(jLabel6Telefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        jLabel1IconUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/do-utilizador.png"))); // NOI18N
        jPanel1UserTela.add(jLabel1IconUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, -1, -1));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Endereço");
        jPanel1UserTela.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, -1));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1UserTela.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 20, 260));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("DADOS");
        jPanel1UserTela.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Bairro");
        jPanel1UserTela.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Rua");
        jPanel1UserTela.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Numero");
        jPanel1UserTela.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, -1, -1));

        jLabel1NumEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1NumEndereco.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1NumEndereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1NumEndereco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1UserTela.add(jLabel1NumEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 470, -1, -1));

        jLabel2BairroEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2BairroEndereco.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2BairroEndereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2BairroEndereco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1UserTela.add(jLabel2BairroEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        jLabel6RuaEndereco.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6RuaEndereco.setForeground(new java.awt.Color(102, 102, 102));
        jLabel6RuaEndereco.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6RuaEndereco.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1UserTela.add(jLabel6RuaEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/pino-de-localizacao.png"))); // NOI18N
        jLabel9.setText("Editar Endereço");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1UserTela.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 530, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 51, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imgs/editardados.png"))); // NOI18N
        jLabel10.setText("Editar Dados");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1UserTela.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, -1, -1));

        add(jPanel1UserTela, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 760, 610));
    }// </editor-fold>//GEN-END:initComponents

    //abrindo janela de ediçao de dados usuario
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        JanelaPrinci jp = new JanelaPrinci();
        CaixaDeEdicaoDadosUser cdedu = new CaixaDeEdicaoDadosUser(jp, true);
        cdedu.setVisible(true);

    }//GEN-LAST:event_jLabel10MouseClicked

    //abrindo janela de edição dados endereço
    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        JanelaPrinci jp = new JanelaPrinci();
        CaixaDeEdicaoDadosEndereco cdede = new CaixaDeEdicaoDadosEndereco(jp, true);
        cdede.setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    //preencher campos com dados do usuario
    public static void preencherDadosUser() {
        Usuario user = UserDao.userDados();
        jLabel2NomeUser.setText(user.getNome());
        jLabel1EmailUser.setText(user.getEmail());
        jLabel6Telefone.setText(user.getTelefone());
        System.out.println(user);

        Endereco endereco = EnderecoDao.getEnderecoUSER();
        jLabel2BairroEndereco.setText(endereco.getBairro());
        jLabel6RuaEndereco.setText(endereco.getRua());
        jLabel1NumEndereco.setText(endereco.getNumero());
        System.out.println(endereco);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel1EmailUser;
    private javax.swing.JLabel jLabel1IconUser;
    public static javax.swing.JLabel jLabel1NumEndereco;
    private javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel2BairroEndereco;
    public static javax.swing.JLabel jLabel2NomeUser;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    public static javax.swing.JLabel jLabel6RuaEndereco;
    public static javax.swing.JLabel jLabel6Telefone;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1UserTela;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}

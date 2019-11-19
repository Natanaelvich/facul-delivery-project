package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import views.TabelaDePedidos;
import views.TelaDeLogin;

public class PedidosDao {

    //salvando pedido no banco
    public static void salvarPedido(int id_user, int id_produto) {
        Connection conn = ConnectDao.getConnection();

        String sql = "INSERT INTO pedido (id_usuario,id_produto,created_at,status) VALUES (?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id_user);
            preparedStatement.setInt(2, id_produto);
            preparedStatement.setTimestamp(3, new java.sql.Timestamp(java.util.Calendar.getInstance().getTimeInMillis()));
            preparedStatement.setString(4, "Pendente");
            preparedStatement.execute();

            ConnectDao.closeConnection(conn);
            ConnectDao.closeConnectionPrepare(preparedStatement);
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //add dados da table de pedidos
    public static void  addRowsTable() {


        try {
            Connection conn =  ConnectDao.getConnection();
            
            Statement statement = conn.createStatement();
            ResultSet res = statement.executeQuery("select usuario.nome,produto.descricao , produto.preco , empresa.nome from pedido , usuario , produto, empresa where pedido.id_usuario= usuario.id AND empresa.nome = "+UserDao.getUserID(TelaDeLogin.jTextField1User.getText(), TelaDeLogin.jTextField2Senha.getText()));
            DefaultTableModel dtm = (DefaultTableModel)  TabelaDePedidos.jTable1DadosPedidos.getModel();
             dtm.setNumRows(0);
            while(res.next()){           
                dtm.addRow(new Object[]{
                  res.getString("descricao"),
                  res.getInt("preco"),
                  res.getInt("endereco_id")
                
            });
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
           

    }
}

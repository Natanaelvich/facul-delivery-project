package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import views.TabelaDePedidos;

public class PedidosDao {

    public static void salvarPedido(int id_user, int id_produto) {
        Connection conn = ConnectDao.getConnection();

        String sql = "INSERT INTO pedido (id_usuario,id_produto,created_at) VALUES (?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id_user);
            preparedStatement.setInt(2, id_produto);
            preparedStatement.setTimestamp(3, new java.sql.Timestamp(java.util.Calendar.getInstance().getTimeInMillis()));
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
            ResultSet res = statement.executeQuery("SELECT * FROM pedidos");
            DefaultTableModel dtm = (DefaultTableModel)  TabelaDePedidos.jTable1DadosPedidos.getModel();
             dtm.setNumRows(0);
            while(res.next()){           
                dtm.addRow(new Object[]{
                  res.getInt("descricao"),
                  res.getString("nome"),
                  res.getString("telefone"),
                  res.getInt("endereco_id")
                
            });
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
           

    }
}

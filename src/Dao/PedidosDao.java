package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import views.TabelaDePedidosEStatus;

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
            ResultSet res = statement.executeQuery("SELECT pr.descricao, pr.preco,"
                                                    + " pe.created_at, pe.status "
                                                    + "from pedido pe\n" +
                                                    "join usuario u\n" +
                                                    "on u.id = pe.id_usuario\n" +
                                                    "join produto pr\n" +
                                                    "on pr.id = pe.id_produto where u.id = 4"
                                                    + " order by pe.created_at;");
            DefaultTableModel dtm = (DefaultTableModel)  TabelaDePedidosEStatus.jTable1DadosPedidos.getModel();
            dtm.setNumRows(0);
            while(res.next()){           
                dtm.addRow(new Object[]{
                  res.getString("descricao"),
                  res.getDouble("preco"),
                  res.getString("created_at"),
                  res.getString("status")
            });
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
           

    }
}

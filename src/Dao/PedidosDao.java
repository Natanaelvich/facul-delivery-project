package Dao;

import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import views.TabelaDePedidosEStatus;
import views.TelaDeLogin;

public class PedidosDao {

    //salvando pedido no banco
    public static void salvarPedido(int id_user, int id_produto, int optPag) {
        Connection conn = ConnectDao.getConnection();

        String sql = "INSERT INTO pedido (id_usuario,id_produto,created_at,status,forma_pagamento_id) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id_user);
            preparedStatement.setInt(2, id_produto);
            preparedStatement.setTimestamp(3, new java.sql.Timestamp(java.util.Calendar.getInstance().getTimeInMillis()));
            preparedStatement.setString(4, "Pendente");
            preparedStatement.setInt(5, optPag);
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
                                                    + " pe.created_at, pe.status, "
                                                    + " em.nome  from pedido pe" +
                                                    " join usuario u" +
                                                    " on u.id = pe.id_usuario" +
                                                    " join produto pr" +
                                                    " on pr.id = pe.id_produto "
                                                    + " join empresa em" +
                                                    " on em.id = pr.empresa_id "
                                                    + " where u.id = "+TelaDeLogin.idUSER
                                                    + " order by pe.created_at;");
            DefaultTableModel dtm = (DefaultTableModel)  TabelaDePedidosEStatus.jTable1DadosPedidos.getModel();
            //mudando cor da coluna de status
            DefaultTableCellRenderer corAzul = new DefaultTableCellRenderer() {
            @Override
            public void setValue(Object value) {
                setForeground(Color.BLUE);
                super.setValue(value);
            }
        };
            DefaultTableCellRenderer corLaranja = new DefaultTableCellRenderer() {
            @Override
            public void setValue(Object value) {
                setForeground(new Color(246,102,13));
                super.setValue(value);
            }
        };
            
            DefaultTableCellRenderer corVerde = new DefaultTableCellRenderer() {
            @Override
            public void setValue(Object value) {
                setForeground(new Color(9,193,27));
                super.setValue(value);
            }
        };
            TabelaDePedidosEStatus.jTable1DadosPedidos.getColumnModel().getColumn(3).setCellRenderer(corAzul);
            TabelaDePedidosEStatus.jTable1DadosPedidos.getColumnModel().getColumn(0).setCellRenderer(corLaranja);
            TabelaDePedidosEStatus.jTable1DadosPedidos.getColumnModel().getColumn(1).setCellRenderer(corVerde);
            ////////////////////////////////
            dtm.setNumRows(0);
            while(res.next()){           
                dtm.addRow(new Object[]{
                  res.getString("descricao"),
                  res.getDouble("preco"),
                  res.getString("created_at"),
                  res.getString("status"),
                  res.getString("nome")
            });
            }
        } catch (SQLException ex) {
            Logger.getLogger(PedidosDao.class.getName()).log(Level.SEVERE, null, ex);
        }
           

    }
}

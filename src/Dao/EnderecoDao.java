package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import views.TelaDeLogin;

public class EnderecoDao {

    //verificar se usuario tem endereco cadastrado
    public static boolean verificarEnderecoUser() {
        Connection conn = ConnectDao.getConnection();
        String sql =    "SELECT * FROM endereco_user WHERE id_user "
                        + "= " + UserDao.getUserID(TelaDeLogin.jTextField1User.getText(),
                        TelaDeLogin.jTextField2Senha.getText());
        
        ResultSet res;
        boolean resultado = false;
        try {
            Statement statement = conn.createStatement();
            res = statement.executeQuery(sql);
            resultado = res.next();
            ConnectDao.closeConnection(conn);
            ConnectDao.closeConnectionStatement(statement);
            ConnectDao.closeConnectionPrepare(res);

        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultado;
    }
    
    //salvando endereco
    public static void salvarEndereco(String bairro,String rua,String numero,String complemento){
        
        
        Connection conn = ConnectDao.getConnection();
        String sql = "INSERT INTO endereco_user (bairro,rua,numero,complemento,id_user) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, bairro);
            preparedStatement.setString(2, rua);
            preparedStatement.setString(3, numero);
            preparedStatement.setString(4, complemento);
            preparedStatement.setInt(5, UserDao.getUserID(TelaDeLogin.jTextField1User.getText(),TelaDeLogin.jTextField2Senha.getText()));
            preparedStatement.execute();
            //fechando conexoes
            ConnectDao.closeConnection(conn);
            ConnectDao.closeConnectionPrepare(preparedStatement);
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

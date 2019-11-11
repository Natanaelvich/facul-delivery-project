package Dao;

import entites.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDao {

    private static Connection conn;

    public static void SalvarUser(Usuario user) {
        conn = ConnectDao.getConnection();
        String sql = "INSERT INTO usuario (nome,email,telefone,senha) VALUES (?,?,?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1, user.getNome());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getTelefone());
            preparedStatement.setString(4, user.getSenha());
            preparedStatement.execute();
            
            ConnectDao.closeConnection(conn);
            ConnectDao.closeConnectionPrepare(preparedStatement);
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public static boolean  getByIdUser(){
    
    return  true;
    }
}

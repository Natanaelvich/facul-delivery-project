package Dao;

import javax.swing.table.DefaultTableModel;
import views.TabelaDePedidos;

public class TabelaDao {
    
    
    public static void  addTable(){
        DefaultTableModel model = (DefaultTableModel) TabelaDePedidos.jTable1DadosPedidos.getModel();
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JlVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u10092957137
 */
public class VendedorController extends AbstractTableModel {
     private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public JlVendedor getBean(int row) {
        return (JlVendedor) lista.get(row);
    }
    
     @Override
    public int getRowCount() {
        return lista.size();
    }

     @Override
    public int getColumnCount() {
        return 5;
    }

     @Override
    public Object getValueAt(int row, int column) {
        JlVendedor jlVendedor = (JlVendedor) lista.get(row);
        if (column == 0) {
           return jlVendedor.getJlIdVendedor();
        } 
        if (column == 1) {
           return jlVendedor.getJlNome();
        } 
        if (column == 2) {
           return jlVendedor.getJlCpf();
        } 
        if (column == 3) {
           return jlVendedor.getJlDataNasc();
        } 
        return null;
    }

     @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Cpf";
        }
        if (column == 3) {
            return "Data de Nascimento";
        }
         if (column == 4) {
            return "Email";
        }
        return "";
    }

     @Override
    public void fireTableDataChanged() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

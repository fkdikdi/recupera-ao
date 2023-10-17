/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.JlProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u10092957137
 */
public class ProdutosController extends AbstractTableModel {
    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public JlProduto getBean(int row) {
        return (JlProduto) lista.get(row);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int column) {
        JlProduto jlProduto = (JlProduto) lista.get(row);
        if (column == 0) {
           return jlProduto.getJlIdProduto();
        } 
        if (column == 1) {
           return jlProduto.getJlNome();
        } 
        if (column == 2) {
           return jlProduto.getJlDescricao();
        } 
        if (column == 3) {
           return jlProduto.getJlPreco();
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
            return "Descricao";
        }
        if (column == 3) {
            return "Preco";
        }
        return "";
    }
    
}

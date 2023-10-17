/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Date;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author u10092957137
 */
public class Util {
     public static void habilitar(boolean valor, JComponent ... vetComp) {
        for (int i = 0; i <vetComp.length; i++){
        vetComp[i].setEnabled(valor);
        }
        
    }
    public static void limparCampos(JComponent ... vetComp) {
        for (int i = 0; i < vetComp.length; i++) {
            ((JTextField)vetComp[i]).setText("");
            
        }
    }
    
    public static void mensagem(String mensagem) {
         JOptionPane.showMessageDialog(null, mensagem);
    }
    public static boolean perguntar(String mensagem) {
               int resp = JOptionPane.showConfirmDialog(null, "Confirma exclusão ?",
                "Pergunta", JOptionPane.YES_NO_OPTION);
               JOptionPane.showConfirmDialog(null, mensagem,
                       "Exclusão" , JOptionPane.YES_NO_OPTION);
               return false;
    }
    public static int strInt(String cad) {
        return 0;
        
    }
    public static String intStr(int num) {
        return "";
        
    }
    public static double strDouble(String cad) {
        return 0;
        
    }
    public static String doubleStr(double num){
    return "";
    }
    public static Date strDat(String cad) {
        return null;
        
    }
 public static String dateStr(Date data){
 return"";
 }

    public static Date strDate(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

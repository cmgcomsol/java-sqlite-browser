/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spreadsheet;

import sqlite.*;
import forms.*;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author geo
 */
public class Spreadsheet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*TestSqlite sql=new TestSqlite();
        sql.setVisible(true);*/
 /*FileSelector sqlitefile=new FileSelector();
        sqlitefile.setVisible(true);*/
 /*JFileChooser ch=new JFileChooser();
        ch.setDialogTitle("Select the sqlite database");
        
        ch.setAcceptAllFileFilterUsed(false); 
        
       
        //FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt"); 
        ch.addChoosableFileFilter(new FileNameExtensionFilter("Sqlite3 files", "sqlite")); 
        
        
        int result=ch.showOpenDialog(null);
        if(result==JFileChooser.APPROVE_OPTION){
            System.out.println(ch.getSelectedFile().getAbsoluteFile());
        }*/
 
        FormMain frm=new FormMain();
        frm.setVisible(true);
    }

}

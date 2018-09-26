/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author geo
 */
public class FormMain extends javax.swing.JFrame {

    /**
     * Creates new form FormMain
     */
    private Connection connection = null;
    private DefaultListModel<String> model = new DefaultListModel();
    private DefaultTableModel tmodel = new DefaultTableModel();
    List<String> recentFiles;
    String Db;

    public FormMain() {
        initComponents();

        ImageIcon img = new ImageIcon(getClass().getClassLoader().getResource("resources/sqlite-icon-128-128.png"));
        this.setIconImage(img.getImage());

        this.listTables.setModel(model);
        this.setTitle("Hello Halloween Sqlite DB Browser");

        updateRecentFilesMenuEntry();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTables = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableData = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        labelTable = new javax.swing.JLabel();
        labelCol = new javax.swing.JLabel();
        labelRow = new javax.swing.JLabel();
        textCellValue = new java.awt.TextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        menuitemOpenDB = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuItemRecent1 = new javax.swing.JMenuItem();
        menuItemRecent2 = new javax.swing.JMenuItem();
        menuItemRecent3 = new javax.swing.JMenuItem();
        menuItemRecent4 = new javax.swing.JMenuItem();
        menuItemRecent5 = new javax.swing.JMenuItem();
        menuTable = new javax.swing.JMenu();
        menuItemNewTable = new javax.swing.JMenuItem();
        menuItemDeleteTable = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        menuItemAddColumn = new javax.swing.JMenuItem();
        menuItemAddRow = new javax.swing.JMenuItem();
        menuExit = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Sqlite Browser");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        listTables.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listTables.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listTablesValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listTables);

        tableData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tableData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableDataMouseClicked(evt);
            }
        });
        tableData.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                tableDataInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        tableData.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                tableDataVetoableChange(evt);
            }
        });
        jScrollPane2.setViewportView(tableData);

        textCellValue.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                textCellValueInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        textCellValue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textCellValueActionPerformed(evt);
            }
        });
        textCellValue.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                textCellValuePropertyChange(evt);
            }
        });
        textCellValue.addTextListener(new java.awt.event.TextListener() {
            public void textValueChanged(java.awt.event.TextEvent evt) {
                textCellValueTextValueChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labelRow, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(labelCol, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textCellValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {labelCol, labelRow, labelTable});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelTable, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCol, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelRow, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textCellValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {labelCol, labelRow, labelTable});

        menuFile.setText("File");

        menuitemOpenDB.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        menuitemOpenDB.setText("Open Db...");
        menuitemOpenDB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuitemOpenDBMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuitemOpenDBMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuitemOpenDBMouseEntered(evt);
            }
        });
        menuFile.add(menuitemOpenDB);
        menuFile.add(jSeparator1);

        menuItemRecent1.setText("jMenuItem2");
        menuItemRecent1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuItemRecent1MousePressed(evt);
            }
        });
        menuFile.add(menuItemRecent1);

        menuItemRecent2.setText("jMenuItem3");
        menuItemRecent2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuItemRecent2MousePressed(evt);
            }
        });
        menuFile.add(menuItemRecent2);

        menuItemRecent3.setText("jMenuItem5");
        menuItemRecent3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuItemRecent3MousePressed(evt);
            }
        });
        menuFile.add(menuItemRecent3);

        menuItemRecent4.setText("jMenuItem4");
        menuItemRecent4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuItemRecent4MousePressed(evt);
            }
        });
        menuFile.add(menuItemRecent4);

        menuItemRecent5.setText("jMenuItem2");
        menuItemRecent5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuItemRecent5MousePressed(evt);
            }
        });
        menuFile.add(menuItemRecent5);

        jMenuBar1.add(menuFile);

        menuTable.setText("Table");
        menuTable.setEnabled(false);

        menuItemNewTable.setText("New table");
        menuItemNewTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuItemNewTableMousePressed(evt);
            }
        });
        menuTable.add(menuItemNewTable);

        menuItemDeleteTable.setText("Delete table");
        menuItemDeleteTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuItemDeleteTableMousePressed(evt);
            }
        });
        menuTable.add(menuItemDeleteTable);
        menuTable.add(jSeparator2);

        menuItemAddColumn.setText("Add column");
        menuItemAddColumn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuItemAddColumnMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuItemAddColumnMouseClicked(evt);
            }
        });
        menuTable.add(menuItemAddColumn);

        menuItemAddRow.setText("Add row");
        menuItemAddRow.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuItemAddRowMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                menuItemAddRowMouseReleased(evt);
            }
        });
        menuTable.add(menuItemAddRow);

        jMenuBar1.add(menuTable);

        menuExit.setText("Exit");
        menuExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menuExitMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menuExitMouseEntered(evt);
            }
        });
        jMenuBar1.add(menuExit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 513, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuExitMouseClicked

    private void menuExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_menuExitMouseEntered

    private void menuExitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuExitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_menuExitMousePressed

    private void listTablesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listTablesValueChanged
        // TODO add your handling code here:
        System.out.println(this.listTables.getSelectedValue());
        this.labelTable.setText(this.listTables.getSelectedValue());
        updateTable();
    }//GEN-LAST:event_listTablesValueChanged

    private void tableDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableDataMouseClicked
        // TODO add your handling code here:
        Integer row = this.tableData.getSelectedRow();
        Integer col = this.tableData.getSelectedColumn();
        this.labelRow.setText("ROW : " + row.toString());
        this.labelCol.setText("COL : " + col.toString());
        
        if (this.tableData.getValueAt(row,col)!=null) {
            this.textCellValue.setText(this.tableData.getValueAt(row, col).toString());
        }
        this.textCellValue.requestFocus();
    }//GEN-LAST:event_tableDataMouseClicked

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        System.out.println("Form Window Closed");


    }//GEN-LAST:event_formWindowClosed

    private void menuitemOpenDBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuitemOpenDBMouseEntered
        // TODO add your handling code here:
        System.out.println("Mouse Entered");
    }//GEN-LAST:event_menuitemOpenDBMouseEntered

    private void menuitemOpenDBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuitemOpenDBMouseClicked
        // TODO add your handling code here:
        //not working
    }//GEN-LAST:event_menuitemOpenDBMouseClicked

    private void menuitemOpenDBMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuitemOpenDBMousePressed
        // TODO add your handling code here:
        System.out.println("Mouse pressed");
        JFileChooser ch = new JFileChooser();
        ch.setDialogTitle("Select the sqlite databases");

        ch.setAcceptAllFileFilterUsed(false);

        //FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt");
        ch.addChoosableFileFilter(new FileNameExtensionFilter("Sqlite3 files", "sqlite"));

        int result = ch.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            System.out.println(ch.getSelectedFile().getAbsoluteFile());
            this.Db = ch.getSelectedFile().getAbsoluteFile().toString();
            openDb(this.Db);
        }

    }//GEN-LAST:event_menuitemOpenDBMousePressed

    private void menuItemRecent1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemRecent1MousePressed
        // TODO add your handling code here:
        openDb(this.menuItemRecent1.getText());
    }//GEN-LAST:event_menuItemRecent1MousePressed

    private void menuItemRecent2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemRecent2MousePressed
        // TODO add your handling code here:
        openDb(this.menuItemRecent2.getText());
    }//GEN-LAST:event_menuItemRecent2MousePressed

    private void menuItemRecent3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemRecent3MousePressed
        // TODO add your handling code here:
        openDb(this.menuItemRecent3.getText());
    }//GEN-LAST:event_menuItemRecent3MousePressed

    private void menuItemRecent4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemRecent4MousePressed
        // TODO add your handling code here:
        openDb(this.menuItemRecent4.getText());
    }//GEN-LAST:event_menuItemRecent4MousePressed

    private void menuItemRecent5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemRecent5MousePressed
        // TODO add your handling code here:
        openDb(this.menuItemRecent5.getText());
    }//GEN-LAST:event_menuItemRecent5MousePressed

    private void tableDataInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_tableDataInputMethodTextChanged
        // TODO add your handling code here:
        System.out.println("Something changed in table" + evt.getText().toString());

    }//GEN-LAST:event_tableDataInputMethodTextChanged

    private void textCellValueInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_textCellValueInputMethodTextChanged
        // TODO add your handling code here:
        System.out.println("Something changed in textedit");
    }//GEN-LAST:event_textCellValueInputMethodTextChanged

    private void textCellValuePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_textCellValuePropertyChange
        // TODO add your handling code here:
        System.out.println("Some property changed in textedit");
    }//GEN-LAST:event_textCellValuePropertyChange

    private void textCellValueTextValueChanged(java.awt.event.TextEvent evt) {//GEN-FIRST:event_textCellValueTextValueChanged
        // TODO add your handling code here:
        System.out.println("textvalue changed in textedit");
        if (tableData.getModel().getRowCount() < 1) {
            System.out.println("Not enough rows!!!");
            return;
        }

        Integer row = this.tableData.getSelectedRow();
        Integer col = this.tableData.getSelectedColumn();

        tableData.setValueAt(textCellValue.getText(), row, col);
    }//GEN-LAST:event_textCellValueTextValueChanged

    private void textCellValueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textCellValueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textCellValueActionPerformed

    private void tableDataVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_tableDataVetoableChange
        // TODO add your handling code here:
        System.out.println("vetoablechange in table");
    }//GEN-LAST:event_tableDataVetoableChange

    private void menuItemNewTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemNewTableMousePressed
        // TODO add your handling code here:
        String newTableName = JOptionPane.showInputDialog("Please proved a name for table");
        if (newTableName.length() < 1) {
            System.out.println("Are you joking~~~");
            return;
        }
        try {
            Statement stmt = connection.createStatement();
            stmt.setQueryTimeout(10);
            String sql = "create table " + newTableName + " (id integer primary key)";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            model.addElement(newTableName);

        } catch (Exception e) {
            System.out.println("There was an error: " + e.toString());
        }

    }//GEN-LAST:event_menuItemNewTableMousePressed

    private void menuItemDeleteTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemDeleteTableMousePressed
        // TODO add your handling code here:
        System.out.println(this.listTables.getSelectedValue());

        if (this.listTables.getSelectedValue() == "null") {

            return;
        }
        Integer ch = JOptionPane.showConfirmDialog(this, "Are you sure to delete table " + this.listTables.getSelectedValue(), "Warning", JOptionPane.OK_CANCEL_OPTION);
        System.out.println(ch);

        if (ch != 0) {
            System.out.println("Cancelled deletion by user");
            return;
        }

        String sql = "drop table " + this.listTables.getSelectedValue();
        System.out.println(sql);
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Now opening Db " + this.Db);
            openDb(this.Db);

        } catch (Exception e) {
            System.out.println(e.toString());
        }


    }//GEN-LAST:event_menuItemDeleteTableMousePressed

    private void menuItemAddColumnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemAddColumnMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_menuItemAddColumnMouseClicked

    private void menuItemAddColumnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemAddColumnMousePressed
        // TODO add your handling code here:
        if (this.listTables.getSelectedValue() == null) {
            return;
        }

        String newColumnName = JOptionPane.showInputDialog("Please provide a column details for table \nCOLUMN_NAME TYPE");
        if (newColumnName.length() < 1) {
            return;
        }

        String sql = "alter table " + this.listTables.getSelectedValue() + " add column " + newColumnName;
        System.out.println(sql);
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Now adding column to table ");
            openDb(this.Db);

        } catch (Exception e) {
            System.out.println(e.toString());
        }

    }//GEN-LAST:event_menuItemAddColumnMousePressed

    private void menuItemAddRowMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemAddRowMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuItemAddRowMousePressed

    private void menuItemAddRowMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuItemAddRowMouseReleased
        /**
         * Adding row to selected table.
         */

        if (this.listTables.getSelectedValue() == null) {
            return;
        }

        String sql = "insert into " + this.listTables.getSelectedValue() + "(rowid) values(null) ";
        System.out.println(sql);
        try {
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Now adding row to table ");
            updateTable();

        } catch (Exception e) {
            System.out.println(e.toString());
        }


    }//GEN-LAST:event_menuItemAddRowMouseReleased

    private void updateTable() {
        try {
            Statement stmt = this.connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT rowid,* FROM " + this.listTables.getSelectedValue());
            ResultSetMetaData md = rs.getMetaData();

            tmodel = new DefaultTableModel();

            for (int i = 1; i <= md.getColumnCount(); i++) {
                tmodel.addColumn(md.getColumnName(i));
            }

            while (rs.next()) {
                //ArrayList<Object> row = new ArrayList<Object>();
                Object[] row = new Object[md.getColumnCount()];
                /*System.out.println("here ");*/
                for (int i = 1; i <= md.getColumnCount(); i++) {
                    //System.out.println("counter "+i);
                    row[i - 1] = rs.getString(i);
                    //System.out.println("counter after ");
                }

                tmodel.addRow(row);
            }

            tableData.setModel(tmodel);

        } catch (SQLException e) {
            // if the error message is "out of memory", 
            // it probably means no database file is found
            System.err.println(e.getMessage());
        }

    }

    private List<String> getRecentFiles() {
        List<String> records = new ArrayList<String>();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("recentfiles.cfg"));
            String line;
            while ((line = reader.readLine()) != null) {
                records.add(line);
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("No recentfiles found.");
            System.out.println(e);
        }

        return records;
    }

    private void updateRecentFilesMenuEntry() {
        this.menuItemRecent1.setVisible(false);
        this.menuItemRecent2.setVisible(false);
        this.menuItemRecent3.setVisible(false);
        this.menuItemRecent4.setVisible(false);
        this.menuItemRecent5.setVisible(false);

        recentFiles = this.getRecentFiles();
        System.out.println("Size of recent files" + recentFiles.size());

        if (recentFiles.size() >= 1) {
            System.out.println(recentFiles.get(0));
            this.menuItemRecent1.setText(recentFiles.get(0));
            this.menuItemRecent1.setVisible(true);
        }

        if (recentFiles.size() >= 2) {
            this.menuItemRecent2.setText(recentFiles.get(1));
            this.menuItemRecent2.setVisible(true);
        }

        if (recentFiles.size() >= 3) {
            this.menuItemRecent3.setText(recentFiles.get(2));
            this.menuItemRecent3.setVisible(true);
        }

        if (recentFiles.size() >= 4) {
            this.menuItemRecent4.setText(recentFiles.get(3));
            this.menuItemRecent4.setVisible(true);
        }

        if (recentFiles.size() >= 5) {
            this.menuItemRecent5.setText(recentFiles.get(4));
            this.menuItemRecent5.setVisible(true);
        }
    }

    private void openDb(String db) {
        Db = db;
        model = new DefaultListModel();

        try {
            this.connection = DriverManager.getConnection("jdbc:sqlite:" + db);
            Statement statement = this.connection.createStatement();
            //statement.executeUpdate("insert into person values(2, 'yui')");
            ResultSet rs = statement.executeQuery("SELECT * FROM sqlite_master WHERE type='table'");
            System.out.println(rs.getMetaData());
            ResultSetMetaData md = rs.getMetaData();
            System.out.println("Column names...");
            for (int i = 1; i <= md.getColumnCount(); i++) {
                System.out.print("COL : ");
                System.out.print(i);
                System.out.println(md.getColumnName(i));
            }
            System.out.println(this.listTables.getModel().getSize());

            System.out.println("Table names...");
            while (rs.next()) {
                /*
                    System.out.println("here1");
                    System.out.print("COL 1 : ");
                    System.out.println(rs.getString(1));
                    System.out.print("COL 2 : ");
                    System.out.println(rs.getString(2));
                    System.out.print("COL 3 : ");
                    System.out.println(rs.getString(3));*/
                model.addElement(rs.getString(3));
                /*System.out.print("COL 4 : ");
                    System.out.println(rs.getString(4));

                    System.out.println("here2");*/

            }
            listTables.setModel(model);

            tmodel = new DefaultTableModel(); //new model for blank table            
            tableData.setModel(tmodel);//new model set;

            menuTable.setEnabled(true);

            if (recentFiles.contains(db)) {
                recentFiles.remove(db);
            }

            try {
                System.out.println("Working Directory = " + System.getProperty("user.dir"));
                PrintWriter file = new PrintWriter("recentfiles.cfg");
                file.println(db);
                for (int i = 0; i < recentFiles.size(); i++) {
                    file.println(recentFiles.get(i));
                }
                file.close();
            } catch (Exception e) {
                System.out.println("Error while writing recent files.");
                System.out.println(e);
            }

            updateRecentFilesMenuEntry();

        } catch (SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JLabel labelCol;
    private javax.swing.JLabel labelRow;
    private javax.swing.JLabel labelTable;
    private javax.swing.JList<String> listTables;
    private javax.swing.JMenu menuExit;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenuItem menuItemAddColumn;
    private javax.swing.JMenuItem menuItemAddRow;
    private javax.swing.JMenuItem menuItemDeleteTable;
    private javax.swing.JMenuItem menuItemNewTable;
    private javax.swing.JMenuItem menuItemRecent1;
    private javax.swing.JMenuItem menuItemRecent2;
    private javax.swing.JMenuItem menuItemRecent3;
    private javax.swing.JMenuItem menuItemRecent4;
    private javax.swing.JMenuItem menuItemRecent5;
    private javax.swing.JMenu menuTable;
    private javax.swing.JMenuItem menuitemOpenDB;
    private javax.swing.JTable tableData;
    private java.awt.TextField textCellValue;
    // End of variables declaration//GEN-END:variables
}

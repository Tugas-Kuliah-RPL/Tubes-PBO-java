/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;
import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.logging.*;


public class ButtonFileReader extends AbstractCellEditor implements TableCellRenderer, TableCellEditor {
    private JButton button;
    private JTable table;
    private int row, column;

    public ButtonFileReader() {
        button = new JButton("Lihat File");
        button.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Opening file reader...");
                JFileChooser fileChooser = new JFileChooser();
                try {
                      String filePath = System.getProperty("user.dir") + "/src/files/"+ table.getValueAt(row, 4);
                String command = "rundll32 url.dll,FileProtocolHandler \"" + filePath + "\"";
                Runtime.getRuntime().exec(command);
                } catch (IOException ex) {
                    System.out.println(ex.getMessage());
                    Logger.getLogger(ButtonFileReader.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                                                   boolean isSelected, boolean hasFocus,
                                                   int row, int column) {
        this.table = table;
        this.row = row;
        this.column = column;
        return button;
    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
                                                 boolean isSelected, int row, int column) {
        this.table = table;
        this.row = row;
        this.column = column;
        return button;
    }

    @Override
    public Object getCellEditorValue() {
        return null;
    }
}
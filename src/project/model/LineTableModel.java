
package project.model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class LineTableModel extends AbstractTableModel {
     private String[] cloNames = {"Item Name", "Item Price", "Count", "Item Total"};
      private ArrayList<InvoiceLine> Lines;
 
    public LineTableModel(ArrayList<InvoiceLine> Lines) {
        this.Lines = Lines;
    }
 
    @Override
    public int getRowCount() {
        return Lines.size();
    }
 
    @Override
    public int getColumnCount() {
        return cloNames.length;
    }
 
    @Override
    public Object getValueAt(int row, int cloume) {
 
        InvoiceLine inv = Lines.get(row);
        switch (cloume) {
            case 0:
                return inv.getItemName();
            case 1:
                return inv.getItemPrice();
            case 2:
                return inv.getCount();
            case 3:
                return inv.getItemTotal();
 
        }
        return null;
    }
 
    @Override
    public String getColumnName(int column) {
        return cloNames[column];
    }
 
    
    public ArrayList<InvoiceLine> getInvoices() {
        return Lines;
    }
}
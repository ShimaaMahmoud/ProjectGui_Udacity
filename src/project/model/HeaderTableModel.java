package project.model;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class HeaderTableModel extends AbstractTableModel {
    private String[] closNames = {"Invoice Num", "Customer Name", "Invoice Date", "Total"};
    private ArrayList<InvoiceHeader> invoices;
 
    public HeaderTableModel(ArrayList<InvoiceHeader> invoices) {
        this.closNames = closNames;
        this.invoices = invoices;
    }
 
    @Override
    public int getRowCount() {
        return invoices.size();
    }
 
    @Override
    public int getColumnCount() {
        return closNames.length;
    }
 
    @Override
    public Object getValueAt(int row, int clo) {
 
        InvoiceHeader invoice = invoices.get(row);
        switch (clo) {
            case 0:
                return invoice.getInvNum();
            case 1:
                return invoice.getCusName();
            case 2:
                return invoice.getInvDate();
            case 3:
                return invoice.getInvTotal();
        }
        return null;
    }
 
    @Override
    public String getColumnName(int column) {
        return closNames[column]; 
    }
 
    public ArrayList<InvoiceHeader> getInvoices() {
        return invoices;
    }

}



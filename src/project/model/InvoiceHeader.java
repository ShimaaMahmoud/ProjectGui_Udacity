package project.model;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {

    private int invoiceNum;
    private Date invoiceDate;
    private String customerName;
    private double invoiceTotal;
    private ArrayList<InvoiceLine> lines;

    public InvoiceHeader(int invNum, Date invDate, String cusName) {
        this.invoiceNum = invNum;
        this.invoiceDate = invDate;
        this.customerName = cusName;
    }

    public int getInvNum() {
        return invoiceNum;
    }

    public void setInvNum(int invNum) {
        this.invoiceNum = invNum;
    }

    public Date getInvDate() {
        return invoiceDate;
    }

    public void setInvDate(Date invDate) {
        this.invoiceDate = invDate;
    }

    public String getCusName() {
        return customerName;
    }

    public void setCusName(String cusName) {
        this.customerName = cusName;
    }

    public double getInvTotal() {
        return invoiceTotal;
    }

    public void setInvTotal(double invTotal) {
        this.invoiceTotal = invTotal;
    }

    public ArrayList<InvoiceLine> getLines() {
        if (lines == null) {
            lines = new ArrayList<>();
        }
        return lines;
    }

    public void setLines(ArrayList<InvoiceLine> lines) {
        this.lines = lines;
    }
    public void addline(InvoiceLine line)
    {
        getLines().add(line);
        setInvTotal(getInvTotal()+line.getItemTotal());
    }

    
}
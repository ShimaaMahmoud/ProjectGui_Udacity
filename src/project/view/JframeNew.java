
package project.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import project.model.HeaderTableModel;
import project.model.LineTableModel;
import project.model.InvoiceHeader;
import project.model.InvoiceLine;


public class JframeNew extends javax.swing.JFrame implements ActionListener, ListSelectionListener {

    public JframeNew() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        headerTable = new javax.swing.JTable();
        headerTable.getSelectionModel().addListSelectionListener(this);
        jButton1 = new javax.swing.JButton();
        jButton1.addActionListener(this);
        jButton2 = new javax.swing.JButton();
        jButton2.addActionListener(this);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lineTable = new javax.swing.JTable();
        InvNumber = new javax.swing.JLabel();
        CustomerNameF = new javax.swing.JTextField();
        InvDtF = new javax.swing.JTextField();
        InvTotal = new javax.swing.JLabel();
        insertItemBtn = new javax.swing.JButton();
        insertItemBtn.addActionListener(this);
        jButton4 = new javax.swing.JButton();
        jButton4.addActionListener(this);
        jLabel5 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadFileMenuItem = new javax.swing.JMenuItem();
        loadFileMenuItem.addActionListener(this);
        saveFileMenuItem = new javax.swing.JMenuItem();
        saveFileMenuItem.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        headerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        headerTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(headerTable);

        jButton1.setText("Create New Invoice");
        jButton1.setActionCommand("CreateInv");

        jButton2.setText("Delete Invoice");
        jButton2.setActionCommand("DeleteInv");

        jLabel1.setText("Invoice Num.");

        jLabel2.setText("Invoice Date");

        jLabel3.setText("Customer Name");

        jLabel4.setText("Invoice Total");

        lineTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(lineTable);

        CustomerNameF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CustomerNameFActionPerformed(evt);
            }
        });

        InvDtF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InvDtFActionPerformed(evt);
            }
        });

        insertItemBtn.setText("Save");
        insertItemBtn.setActionCommand("InsertItem");

        jButton4.setText("Delete Item");
        jButton4.setActionCommand("DeleteItem");

        jLabel5.setText("Invoice Tabel");

        jMenu1.setText("File");

        loadFileMenuItem.setText("Load File");
        loadFileMenuItem.setActionCommand("L");
        loadFileMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadFileMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadFileMenuItem);

        saveFileMenuItem.setText("Save");
        saveFileMenuItem.setActionCommand("S");
        jMenu1.add(saveFileMenuItem);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(InvDtF)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(InvTotal)
                                            .addComponent(InvNumber))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(CustomerNameF)))
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jButton1)
                        .addGap(77, 77, 77)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 342, Short.MAX_VALUE)
                        .addComponent(insertItemBtn)
                        .addGap(56, 56, 56)
                        .addComponent(jButton4)
                        .addGap(92, 92, 92)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(InvNumber)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(InvDtF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(CustomerNameF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(InvTotal))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(insertItemBtn)
                            .addComponent(jButton4)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InvDtFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InvDtFActionPerformed
       
    }//GEN-LAST:event_InvDtFActionPerformed

    private void CustomerNameFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CustomerNameFActionPerformed
    }//GEN-LAST:event_CustomerNameFActionPerformed

    private void loadFileMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadFileMenuItemActionPerformed
        try {
               loadFiless();
           } catch (Exception ex) {
               ex.printStackTrace();
           }
    }//GEN-LAST:event_loadFileMenuItemActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeNew().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CustomerNameF;
    private javax.swing.JTextField InvDtF;
    private javax.swing.JLabel InvNumber;
    private javax.swing.JLabel InvTotal;
    private javax.swing.JTable headerTable;
    private javax.swing.JButton insertItemBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable lineTable;
    private javax.swing.JMenuItem loadFileMenuItem;
    private javax.swing.JMenuItem saveFileMenuItem;
    // End of variables declaration//GEN-END:variables

    private ArrayList<InvoiceHeader> filesData = new ArrayList<>();
    private HeaderTableModel headerTableModel;
    private LineTableModel lineTableModel;
    private SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
    private CreateInvoicePopup Popup;
    
    @Override
    public void actionPerformed(ActionEvent e) {
     if (e.getActionCommand().equals("S")) {
           saveDataaa();
       } else if (e.getActionCommand().equals("CreateInv")) {
           createInvoice();
       } else if (e.getActionCommand().equals("DeleteInv")) {
           deleteInvoce();
       } else if (e.getActionCommand().equals("CreateItem")) {
           createItemnew();
       } else if (e.getActionCommand().equals("DeleteItem")) {
           deleteItemnew();}
         else if (e.getActionCommand().equals("createinvOK")){
             CreateinvOK();
                   
                   }
              else if (e.getActionCommand().equals("createinvcancel")){
CreateinvCancel();
           
              }
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
         headerTableRowSelected();
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
    private InvoiceHeader findByNum(int num) {
        for (InvoiceHeader header : filesData) {
            if (header.getInvNum() == num) {
                return header;
            }
        }
        return null;
    }
    private void loadFiless() throws Exception {
        filesData.clear();
        JOptionPane.showMessageDialog(this, "Please select Invoice header file", "Invoice Header", JOptionPane.WARNING_MESSAGE);
        JFileChooser fc = new JFileChooser();
        int option = fc.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fc.getSelectedFile();
            FileReader fr = new FileReader(selectedFile);
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            while ((line = br.readLine()) != null) {
                String[] headerSegments = line.split(",");
                String invNumStr = headerSegments[0];
                String invDateStr = headerSegments[1]; // "20-12-2020"
                String custName = headerSegments[2];
                int invNum = Integer.parseInt(invNumStr);
                Date invDate = df.parse(invDateStr);
                InvoiceHeader header = new InvoiceHeader(invNum, invDate, custName);
                filesData.add(header);
            }
            br.close();
            fr.close();
            System.out.println("check");
            JOptionPane.showMessageDialog(this, "Please select Invoice lines file", "Invoice Lines", JOptionPane.WARNING_MESSAGE);
            option = fc.showOpenDialog(this);
            if (option == JFileChooser.APPROVE_OPTION) {
                selectedFile = fc.getSelectedFile();
                fr = new FileReader(selectedFile);
                br = new BufferedReader(fr);
                line = null;
                while ((line = br.readLine()) != null) {
                    String[] lineSegments = line.split(",");
                    String invNumStr = lineSegments[0];
                    String item = lineSegments[1]; // "20-12-2020"
                    String priceStr = lineSegments[2];
                    String countStr = lineSegments[3];
                    int invNum = Integer.parseInt(invNumStr);
                    double price = Double.parseDouble(priceStr);
                    int count = Integer.parseInt(countStr);
                    InvoiceHeader header = findByNum(invNum);
                    InvoiceLine invLine = new InvoiceLine(item, price, count, header);
                    header.addline(invLine);
                }
                br.close();
                fr.close();
                headerTableModel = new HeaderTableModel(filesData);
                headerTable.setModel(headerTableModel);
                headerTable.validate();
            }
        }
    }
    
    
    private void headerTableRowSelected() {
        int indexrow=headerTable.getSelectedRow();
        if(indexrow>=0)
        {
        int selectedRow= headerTable.getSelectedRow();
        InvoiceHeader row= headerTableModel.getInvoices().get(selectedRow);
        CustomerNameF.setText(row.getCusName());
        InvDtF.setText(row.getInvDate().toString());
        InvNumber.setText(""+row.getInvNum());
        InvTotal.setText(""+row.getInvTotal());
        ArrayList<InvoiceLine>lines=row.getLines();
        lineTableModel=new LineTableModel(lines);
        lineTable.setModel(lineTableModel);
        lineTableModel.fireTableDataChanged();
        }
    }        
    
    private void saveDataaa() {}
    
    private void createInvoice() {
         Popup=new CreateInvoicePopup(this);
         Popup.setVisible(true);
         Popup.setSize(200, 100);
    }
    
    private void deleteInvoce() {}
    
    private void createItemnew() {}
    
    private void deleteItemnew() {}

    private void CreateinvOK() {
        
        String custName=Popup.getCustNameField().getText();
        String invDateStr=Popup.getInvDateField().getText();
        Date invDate= new Date();
        try {
            invDate=df.parse(invDateStr);
        } catch (ParseException ex) {
            
        }
        Popup.setVisible(false);
        
        InvoiceHeader newinvheader=new InvoiceHeader(getMaxInvNum()+1, invDate, custName);
        filesData.add(newinvheader);
        headerTableModel.fireTableDataChanged();
        System.out.println("shhhhhhhhhhhhhhhhhhhhh");
        
    }
    private int getMaxInvNum()
    {
        int num=0;
        for(InvoiceHeader header :filesData)
        {
            if(header.getInvNum()>num)
                    {
                        num=header.getInvNum();
                    }
        }
        return num;
    }

    private void CreateinvCancel() {
        
    }
    
}

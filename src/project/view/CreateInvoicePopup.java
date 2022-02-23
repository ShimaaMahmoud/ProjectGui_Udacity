
package project.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class CreateInvoicePopup  extends JDialog{
    
    private JTextField CustNameField;
       private JTextField invDateField;
    private JLabel custNameLbl;
    private JLabel invDateLbl;
    private JButton OKButton;
    private JButton CancelButton;
   

    public CreateInvoicePopup(JframeNew jframe) {
        custNameLbl=new JLabel("customer Name");
        CustNameField = new JTextField(20);
        invDateField =  new JTextField (20);
       invDateLbl =  new JLabel("invoice Date");
        OKButton = new JButton("OK");
        OKButton.setActionCommand("createinvOK");
         CancelButton =new JButton("Cancel");
        CancelButton.setActionCommand("createinvcancel");
        OKButton.addActionListener(jframe);
        
         CancelButton.addActionListener(jframe);

        setLayout(new GridLayout(3, 2));
        
                add(invDateLbl);

        add(invDateField);
         add(custNameLbl);
         add(CustNameField);
        add(OKButton);
        add(CancelButton);
       
       
    }

    public JTextField getCustNameField() {
        return CustNameField;
    }

    public JTextField getInvDateField() {
        return invDateField;
    }

    public JLabel getInvDateLbl() {
        return invDateLbl;
    }

   
 

    

    
}

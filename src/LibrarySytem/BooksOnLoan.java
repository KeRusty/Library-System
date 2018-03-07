/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySytem;

import java.io.IOException;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chathu
 */
public class BooksOnLoan extends javax.swing.JFrame {

    Vector vectortitle = new Vector();
    SetOfBooks set = new SetOfBooks();
    String title;
    String borrower;
    SetOfMembers set2 = new SetOfMembers();
    
    
    
    public BooksOnLoan() {       
        initComponents();
        loadingTable();
        
        try {
            set = (SetOfBooks) SerialKiller.Deserialize("SetOfBooks.txt");
            set2 = (SetOfMembers) SerialKiller.Deserialize("SetOfMembers.txt");          
            
        } catch (IOException ex) {
            Logger.getLogger(BooksOnLoan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BooksOnLoan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        BookLoanTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        memberNameText = new javax.swing.JTextField();
        loanBookButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        scrollPane = new java.awt.ScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BookLoanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ISBN", "Book Name", "Author", "Borrower"
            }
        ));
        BookLoanTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookLoanTableMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BookLoanTableMouseExited(evt);
            }
        });
        jScrollPane1.setViewportView(BookLoanTable);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Loan A Book");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibrarySytem/images/icons8-approve-64.png"))); // NOI18N

        jLabel3.setText("Member Name");

        loanBookButton.setText("Loan Book");
        loanBookButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loanBookButtonMouseClicked(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearButtonMouseClicked(evt);
            }
        });
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });

        scrollPane.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(memberNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(loanBookButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(clearButton)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(backButton)))
                                .addGap(46, 46, 46)
                                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(memberNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loanBookButton)
                    .addComponent(clearButton)
                    .addComponent(backButton))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearButtonActionPerformed

    private void loanBookButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loanBookButtonMouseClicked
        int maximumLimit;
        Vector bookTitle = vectortitle;
        Iterator i = bookTitle.iterator();
        
        while(i.hasNext())
        {
            int x = set.maxBook(set,memberNameText.getText());
            if(x<=2)
            {
                maximumLimit = set.maxBook(set,memberNameText.getText());
                title = (String) i.next();
                borrower = memberNameText.getText();
                set.lendBooks(set, title, borrower);
                SerialKiller.serialize(set,"SetOfBooks.txt");
                JOptionPane.showMessageDialog(null, "Book has been Given For Loan");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Each Member can have only THREE Books");
            }
        }
        
        DefaultTableModel table2 = (DefaultTableModel) BookLoanTable.getModel();
        while(table2.getRowCount() > 0)
        {
            for(int a =0;a<table2.getRowCount();a++)
            {
                table2.removeRow(a);
            }
        }
        
        try {
            set = (SetOfBooks) SerialKiller.Deserialize("SetOfBooks.txt");
        } catch (IOException ex) {
            Logger.getLogger(BooksOnLoan.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BooksOnLoan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        set.booksBorrowredAlready(set, BookLoanTable);
        
    }//GEN-LAST:event_loanBookButtonMouseClicked

    private void clearButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearButtonMouseClicked
        memberNameText.setText(null);
    }//GEN-LAST:event_clearButtonMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        new LibraryGUI().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonMouseClicked

    private void BookLoanTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookLoanTableMouseClicked
        DefaultTableModel table2 = (DefaultTableModel) BookLoanTable.getModel();
        int selectRow = BookLoanTable.getSelectedRow();
        String titleRow = table2.getValueAt(selectRow, 1).toString();
        
        vectortitle.add(titleRow);
    }//GEN-LAST:event_BookLoanTableMouseClicked

    private void BookLoanTableMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookLoanTableMouseExited
        DefaultListModel table3 = new DefaultListModel();
        Vector titleRow = vectortitle;
        Iterator i = titleRow.iterator();
        while(i.hasNext())
        {
            table3.addElement(i.next());
        }
        //scrollPane.setModel(table3);
    }//GEN-LAST:event_BookLoanTableMouseExited

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
            java.util.logging.Logger.getLogger(BooksOnLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BooksOnLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BooksOnLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BooksOnLoan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BooksOnLoan().setVisible(true);
            }
        });
    }
    
    private void loadingTable()
{
    DefaultTableModel tbl = (DefaultTableModel) BookLoanTable.getModel();
    
    while(tbl.getRowCount() > 0)
    {
        for(int i = 0;i<tbl.getRowCount();i++)
        {
            tbl.removeRow(i);
        }
    }
    
        try {
            set = (SetOfBooks) SerialKiller.Deserialize("SetOfBooks.txt");
        } catch (IOException ex) {
            Logger.getLogger(BookListGUI.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(BookListGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    set.bookDetails(set,BookLoanTable);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable BookLoanTable;
    private javax.swing.JButton backButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loanBookButton;
    private javax.swing.JTextField memberNameText;
    private java.awt.ScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
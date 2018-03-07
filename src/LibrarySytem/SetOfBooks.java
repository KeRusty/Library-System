
package LibrarySytem;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chathu Abeywickrama
 */
public class SetOfBooks extends Vector<Books>{
    
    public SetOfBooks()
    {
        super();
    }
    
    public void addBook(Books aBook)
    {
        super.add(aBook);
    }
    
    public void removeBook(Books aBook)
    {
        super.remove(aBook);
    }
    
    public void bookDetails(SetOfBooks set, JTable BooklistTable)
    {
        for(Books aBook : set)
        {
            Vector row = new Vector();
            DefaultTableModel table = (DefaultTableModel)BooklistTable.getModel();
            row.add(aBook.getISBN());
            row.add(aBook.getTitle());
            row.add(aBook.getAuthor());
            row.add(aBook.getAccessionNumber());
            row.add(aBook.getBorrower());

            table.addRow((row));
            BooklistTable.setModel(table);;
        }
    }
    
    public Books getISBN(String isbn, SetOfBooks set2)
    {
        Books bBook = null;
        for(Books aBook : set2)
        {
            if(aBook.getISBN().equalsIgnoreCase(isbn))
            {
              bBook = aBook;  
            }
        }
        return bBook;
    }
    
    public int maxBook(SetOfBooks set, String members)
    {
        int i = 0;
        for(Books aBook : set)
        {
            if(aBook.getBorrower().equalsIgnoreCase(members))
            {
               i++; 
            }
        }
        return i;
    }
    
    public void lendBooks(SetOfBooks set, String name, String memberName)
    {
        for(Books aBook:set)
        {
            if(aBook.getTitle().equalsIgnoreCase(name))
            {
               aBook.setBorrower(memberName);
               aBook.setStatus("Book Already Borrowed");
            }
        }
    }
    
    public void booksBorrowredAlready(SetOfBooks set,JTable table)
    {
        for(Books aBook:set)
        {
            if(aBook.getStatus().equalsIgnoreCase("Available"))
            {
                Vector row = new Vector();
                DefaultTableModel table2 = (DefaultTableModel) table.getModel();
                row.add(aBook.getISBN());
                row.add(aBook.getTitle());
                row.add(aBook.getAuthor());
                //row.add(aBook.getISBN());
                row.add(aBook.getStatus());
                row.add(aBook.getBorrower());
                
                table2.addRow(row);
                table.setModel(table2);
            }
        }
    }
}


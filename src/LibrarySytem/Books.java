package LibrarySytem;

import java.io.Serializable;

/**
 *
 * @author Chathu Abeywickrama
 */
public class Books implements Serializable {
    private String ISBN;
    private String title;
    private String author;
    private String borrower;
    private int accessionNumber;
    private static int bookCount = 0;
    private String status;
    
    public Books(String isbn, String name, String writer, int accNo,String stat, String borrow)
    {
        ISBN = isbn;
        title = name;
        author = writer;        
        accessionNumber = bookCount++;
        status = stat;
        borrower = borrow;
    }
    
    public void setBorrower(String theBorrower)
    {
        borrower = theBorrower;
    }
    
    public String getBorrower()
    {
        return borrower;
    }
    
       
    public String getISBN()
    {
        return ISBN;
    }
    
    public void setISBN(String isbn)
    {
        this.ISBN = isbn;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public void setTitle(String name)
    {
        this.title = name;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public void setAuthor(String writer)
    {
        this.author = writer;
    }
    
    
    public int getAccessionNumber()
    {
        return accessionNumber;
    }
    
    public void setAccessionNumber(int accNo)
    {
        this.accessionNumber = accNo;
    }
    
    public static int getBookCount()
    {
        return bookCount;
    }
    
    public static void setBookCount(int bookcount)
    {
        Books.bookCount = bookcount;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public void setStatus(String stat)
    {
        this.status = stat;
    }
}

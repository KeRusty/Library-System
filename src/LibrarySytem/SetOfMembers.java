package LibrarySytem;

import java.util.ArrayList;
import java.util.Vector;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chathu Abeywickrama
 */
public class SetOfMembers extends Vector<Members>{
    
    public SetOfMembers()
    {
        super();
    }
    
    public void addMember(Members aMember)
    {
        super.add(aMember);
    }
    
    public void remMember(Members aMember)
    {
        super.remove(aMember);
    }
    
    public void memberDetails(SetOfMembers set, JTable mTable)
    {
        for(Members aMember: set)
        {
            Vector row = new Vector();
            DefaultTableModel table = (DefaultTableModel) mTable.getModel();
            row.add(aMember.getMemberNumber());
            row.add(aMember.getName());
            
            table.addRow(row);
            mTable.setModel(table);
        }
    }
    
    public Members getMemberID(SetOfMembers set, String memID)
    {
        Members aMember =null;
        for(Members bMember:set)
        {
            if(bMember.getMemberNumber().equalsIgnoreCase(memID))
            {
                aMember = bMember;
            }
        }
        return aMember;
    }
}

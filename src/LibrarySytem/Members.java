/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibrarySytem;

import java.io.Serializable;

/**
 *
 * @author Chathu Abeywickrama
 */
public class Members implements Serializable {
    private String name;
    private String memberNo;    
    private SetOfBooks currentLoans = new SetOfBooks();
    private static int memberCount = 0;
    
    public Members(String mNum, String aName){
     name = aName;
     memberNo = mNum;
     currentLoans = new SetOfBooks();
    }
    
    public String getMemberNumber()
    {
        return memberNo;
    }
    
    public void setMemberNumber(String memberNo)
    {
        this.memberNo = memberNo;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String memberName)
    {
        this.name = memberName;
    }
    
    public static int getMemberCount()
    {
        return memberCount;
    }
    
    public static void setMemberCount(int memberCount)
    {
        Members.memberCount = memberCount;
    }

//    public String toString(){
//        return Integer.toString(memberNo) + " " + name;
//        
//    }

    
}

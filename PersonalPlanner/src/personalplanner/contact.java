/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personalplanner;
import java.util.Calendar;

/**
 *
 * @author Shane
 */
public class contact {
    
    private int id;                 // id num
    private String name = null;            // contact's name
    private Calendar birthday = null;      // contact's birthdate
    private Calendar anniversary = null;   // contact's anniversary date
    private String type = null;            // contact's relation to the contactbook owner
    private String phoneNum = null;
    private String address = null;
    
    
    public contact(int ID, String n)
    {
        id = ID;
        name = n;
    }
    
    public contact(int ID, String n, String t)
    {
        id = ID;
        name = n;
        type = t;
    }
    
     public contact(int ID, String n, Calendar bday)
    {
        id = ID;
        name = n;
        birthday = bday;
    }
    
    public contact(int ID, String n, Calendar bday, String t)
    {
        id = ID;
        name = n;
        birthday = bday;
        type = t;
    }
    
    public contact(int ID, String n, Calendar bday, Calendar anniv, String t)
    {
        id = ID;
        name = n;
        birthday = bday;
        anniversary = anniv;
        type = t;
    }
    
    public contact(int ID, String n, Calendar bday, Calendar anniv, String t, String phone)
    {
        id = ID;
        name = n;
        birthday = bday;
        anniversary = anniv;
        type = t;
        phoneNum = phone;
    }
    
    public contact(int ID, String n, Calendar bday, Calendar anniv, String t, String phone, String addr)
    {
        id = ID;
        name = n;
        birthday = bday;
        anniversary = anniv;
        type = t;
        phoneNum = phone;
        address = addr;
    }
    
    
    
    public int getID(){return id;}
    public String getName(){return name;}
    public Calendar getBirthday(){return birthday;}
    public Calendar getAnniversary(){return anniversary;}
    public String getPhone(){return phoneNum;}
    public String getAddress(){return address;}
    public String getType(){return type;}
    
    
    
}


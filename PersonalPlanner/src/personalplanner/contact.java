/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personalplanner;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Shane
 */
public class contact {
    
    private int id;                 // id num
    private String name;            // contact's name
    private Calendar birthday;      // contact's birthdate
    private Calendar anniversary;   // contact's anniversary date
    private String type;            // contact's relation to the contactbook owner
    
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
    
    
    
    public int getID(){return id;}
    public String getName(){return name;}
    public Calendar getBirthday(){return birthday;}
    public Calendar getAnniversary(){return anniversary;}
    public String getType(){return type;}
    
    
    
}


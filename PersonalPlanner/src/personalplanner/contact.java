/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personalplanner;
import java.util.Date;

/**
 *
 * @author Shane
 */
public class contact {
    
    private int id;
    private String name;
    private Date birthday;
    private Date anniversary;
    private String type;
    private int lastID = 0;
    
    public contact(String n, Date bday, Date anniv, String t)
    {
        id = lastID;
        name = n;
        birthday = bday;
        anniversary = anniv;
        type = t;
        lastID += 1;
    }
    
    public int getID(){return id;}
    public String getName(){return name;}
    public Date getBirthday(){return birthday;}
    public Date getAnniversary(){return anniversary;}
    public String getType(){return type;}
    
    public static void main(String[] args) {
        // TODO code application logic here
        Sysetemsjfgjbigfkbhubhudhbkdfbh
        
}
    
}


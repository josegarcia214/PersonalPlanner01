/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personalplanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Shane
 */
public class PersonalPlanner {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("contactPage.txt")).useDelimiter(",|/|\n");
        
                
        int currentID = 0;
        //contact[] list;
        List<contact> contacts = new ArrayList<>();
        
        
        while (in.hasNext())
        {
            int id;                 // id num
            String name;            // contact's name
            Calendar birthday = new GregorianCalendar();      // contact's birthdate
            Calendar anniversary = new GregorianCalendar();   // contact's anniversary date
            String type = null;            // contact's relation to the contactbook owner
            String reader;
            int month;
            int day;
            int year;
            
            id = currentID;
            name = in.next();
            reader = in.next();
            if(reader.startsWith("!b")){
                month = Integer.parseInt(reader.substring(2));
                day = Integer.parseInt(in.next());
                year = Integer.parseInt(in.next());
                birthday.set(Calendar.MONTH, month - 1);            //months range from 0 to 11
                birthday.set(Calendar.DAY_OF_MONTH, day); 
                birthday.set(Calendar.YEAR, year); 
                }
            reader = in.next();
            if(reader.startsWith("!a")){
                month = Integer.parseInt(reader.substring(2));
                day = Integer.parseInt(in.next());
                year = Integer.parseInt(in.next());
                //System.out.println("Anniv year: " + year);
                anniversary.set(Calendar.MONTH, month - 1);         //months range from 0 to 11
                anniversary.set(Calendar.DAY_OF_MONTH, day); 
                anniversary.set(Calendar.YEAR, year); 
                reader = in.next();
            }
            else
            {
                anniversary.set(Calendar.MONTH, 1);                 //ignore the date if it is 1/1/1
                anniversary.set(Calendar.DAY_OF_MONTH, 1); 
                anniversary.set(Calendar.YEAR, 1); 
            }
            //reader = in.next();
            //System.out.println(reader.indexOf("\\n"));
            type = reader.substring(0,reader.length()-1);
            //type  = reader;
            //System.out.println(in.next());
                
            //type = in.next();
            in.nextLine();
            contact c = new contact(id, name, birthday, anniversary, type);
            
            
                
            //list[currentID] = new contact(id, name, birthday, anniversary, type);
            contacts.add(c);
            /////////////////////////////
            currentID +=1;
            //in.nextLine();
        }
        
        // TODO code application logic here
        System.out.println("Hello Personal Planner");
        
        ContactBook book = new ContactBook(contacts);
        //ContactBook book = new ContactBook(in);
        
        book.printContactsList();
        /*
        Calendar birth = new GregorianCalendar();        
        birth.set(Calendar.MONTH, 11); 
        birth.set(Calendar.DAY_OF_MONTH, 15); 
        birth.set(Calendar.YEAR, 1992); 
        Calendar anniv = new GregorianCalendar();        
        anniv.set(Calendar.MONTH, 11); 
        anniv.set(Calendar.DAY_OF_MONTH, 3); 
        anniv.set(Calendar.YEAR, 2009); 
        contact shane = new contact(0,"Shane Hausler", birth, anniv, "friend");
        
        Calendar birth2 = new GregorianCalendar();        
        birth.set(Calendar.MONTH, 3);  
        birth.set(Calendar.DAY_OF_MONTH, 23); 
        birth.set(Calendar.YEAR, 1990); 
        Calendar anniv2 = new GregorianCalendar();        
        anniv.set(Calendar.MONTH, 12);  
        anniv.set(Calendar.DAY_OF_MONTH, 31); 
        anniv.set(Calendar.YEAR, 2007); 
        contact gil = new contact(1,"Gilbert Garcia", birth2, anniv2, "baby-daddy");
        
        contact list[] = {shane,gil};
        
        ContactBook cbook = new ContactBook(list);
        cbook.printContacts();
        */

        
        /*Calendar birth = new GregorianCalendar();        birth.set(Calendar.YEAR, 1992); birth.set(Calendar.MONTH, 11); birth.set(Calendar.DAY_OF_MONTH, 15); 
        Calendar anniv = new GregorianCalendar();        anniv.set(Calendar.YEAR, 2009); anniv.set(Calendar.MONTH, 11); anniv.set(Calendar.DAY_OF_MONTH, 31); 
        contact shane = new contact(0,"Shane Hausler", birth, anniv, "friend");
        
         Calendar birth2 = new GregorianCalendar();         birth.set(Calendar.YEAR, 1990); birth.set(Calendar.MONTH, 3);  birth.set(Calendar.DAY_OF_MONTH, 23); 
        Calendar anniv2 = new GregorianCalendar();        anniv.set(Calendar.YEAR, 2007); anniv.set(Calendar.MONTH, 12);  anniv.set(Calendar.DAY_OF_MONTH, 31); 
        contact gil = new contact(1,"Gilbert Garcia", birth2, anniv2, "baby-daddy");
        
        System.out.println("Contact started.");
        
        System.out.println("This is a contact:\n" + shane.getName() + " " + 
                shane.getBirthday().get(Calendar.MONTH) + " " + 
                shane.getBirthday().get(Calendar.DATE) + " " + 
                shane.getBirthday().get(Calendar.YEAR) + " " + 
                shane.getAnniversary().get(Calendar.MONTH) + " " + 
                shane.getAnniversary().get(Calendar.DATE) + " " + 
                shane.getAnniversary().get(Calendar.YEAR) + " " + 
                shane.getType() + " " + shane.getID());
        System.out.println("This is a contact:\n" + gil.getName() + " " + 
                gil.getBirthday().get(Calendar.MONTH) + " " + 
                gil.getBirthday().get(Calendar.DATE) + " " + 
                gil.getBirthday().get(Calendar.YEAR) + " " + 
                gil.getAnniversary().get(Calendar.MONTH) + " " + 
                gil.getAnniversary().get(Calendar.DATE) + " " + 
                gil.getAnniversary().get(Calendar.YEAR) + " " + 
                gil.getType() + " " + gil.getID());
        */
        
        in.close();
    }
}

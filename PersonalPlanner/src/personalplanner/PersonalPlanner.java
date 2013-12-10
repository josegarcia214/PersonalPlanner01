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
        String catches = ",|/|" + System.getProperty("line.separator");
        
        Scanner in = new Scanner(new File("contactPage.txt")).useDelimiter(catches);
        
        
        
        
        
        // TODO code application logic here
        System.out.println("Hello Personal Planner");
        
        ContactBook book = new ContactBook(in);
        //ContactBook book = new ContactBook(in);
        
        book.printContacts();
        book.remove(1);
        book.printContacts();
        
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

package personalplanner;

import java.util.Calendar;

/**
 *
 * @author Shane
 */
public class ContactBook {
    /*
     * The purpose of the notebook is to organize and query the contacts stored in the database.
     * The types that we will use are going to be user-defined.
     * Users will enter their contact information and relation type.
     * The entry ID will be automatically assigned.
     * 
     * It will have a function to print out the important dates of the contacts 
     * to send to the datebook when requested.
     * 
     * 
     */
    
    private contact[] book;
    
    
    public ContactBook(contact[] c)
    {
        for(int count = 0; count <= c.length-1; count++){
            System.out.println(count);
            book[count] = c[count];
        
        }
    }
    
    public void printContacts()
    {
        for(int count = 0; count <= book.length-1; count++){
           
            System.out.println("This is a contact:\n" + book[count].getName() + " " + 
                book[count].getBirthday().get(Calendar.MONTH) + " " + 
                book[count].getBirthday().get(Calendar.DATE) + " " + 
                book[count].getBirthday().get(Calendar.YEAR) + " " + 
                book[count].getAnniversary().get(Calendar.MONTH) + " " + 
                book[count].getAnniversary().get(Calendar.DATE) + " " + 
                book[count].getAnniversary().get(Calendar.YEAR) + " " + 
                book[count].getType() + " " + book[count].getID());
        }
    }
    
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
    
}

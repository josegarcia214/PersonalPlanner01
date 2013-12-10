package personalplanner;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

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
     */
    
    //private contact[] book;
    private List<contact> book1 = new ArrayList<>();
    
    /*public ContactBook(contact[] c)
    {
        book = new contact[c.length];
        
        for(int count = 0; count <= c.length-1; count++){
            //System.out.println(count);
            book[count] = c[count];
        }
    }
    */
    
    public ContactBook(List<contact> c)
    {
        //book = new contact[c.size()];
        
        for(int count = 0; count <= c.size()-1; count++){
            //System.out.println(count);
            book1.add(c.get(count));
        }
    }
    
    public ContactBook(Scanner in){
        int currentID = 0;
        //contact[] list;
        List<contact> contacts = new ArrayList<>();
        
        while (in.hasNext()){
            int id;                 // id num
            String name = null;            // contact's name
            Calendar birthday = new GregorianCalendar();      // contact's birthdate
            Calendar anniversary = new GregorianCalendar();   // contact's anniversary date
            int month;
            int day;
            int year;
            String type = null;            // contact's relation to the contactbook owner
            String phone = null;
            String addr = null;
            String reader = null;
            
            id = currentID;
            if(in.hasNext()) name = in.next();
            if(in.hasNext()) reader = in.next();
            
            if(in.hasNext()) if(reader.startsWith("!b")){
                month = Integer.parseInt(reader.substring(2));
                day = Integer.parseInt(in.next());
                year = Integer.parseInt(in.next());
                birthday.set(Calendar.MONTH, month - 1);            //months range from 0 to 11
                birthday.set(Calendar.DAY_OF_MONTH, day); 
                birthday.set(Calendar.YEAR, year); 
                if(in.hasNext()) reader = in.next();
                }
            else{
                birthday.set(Calendar.MONTH, 1);                 //ignore the date if it is 1/1/1
                birthday.set(Calendar.DAY_OF_MONTH, 1); 
                birthday.set(Calendar.YEAR, 1); 
            }
            
            if(in.hasNext()) if(reader.startsWith("!a")){
                month = Integer.parseInt(reader.substring(2));
                day = Integer.parseInt(in.next());
                year = Integer.parseInt(in.next());
                //System.out.println("Anniv year: " + year);
                anniversary.set(Calendar.MONTH, month - 1);         //months range from 0 to 11
                anniversary.set(Calendar.DAY_OF_MONTH, day); 
                anniversary.set(Calendar.YEAR, year); 
                if(in.hasNext()) reader = in.next();
            }
            else{
                anniversary.set(Calendar.MONTH, 1);                 //ignore the date if it is 1/1/1
                anniversary.set(Calendar.DAY_OF_MONTH, 1); 
                anniversary.set(Calendar.YEAR, 1); 
            }
            
            if(in.hasNext()) if(reader.startsWith("!p")){
                phone = reader.substring(2);
                if(phone.substring(phone.length()-1).equals("\n")){
                    phone = phone.substring(0,phone.length()-1);
                    System.out.println("Changed: " + phone);
                }
                if(in.hasNext()) reader = in.next();
            }
            else phone = "null";
            
            if(in.hasNext()) if(reader.startsWith("!t")){
                type = reader.substring(2);
                //reader = in.next();
            }
            else type = "null";
            contact c = new contact(id, name, birthday, anniversary, type, phone, addr);
            
            //System.out.println(id + ", " + name + ", " + birthday.get(Calendar.MONTH) + "/" + birthday.get(Calendar.DAY_OF_MONTH) + "/" + birthday.get(Calendar.YEAR) + ", " + anniversary.get(Calendar.MONTH) + "/" + anniversary.get(Calendar.DAY_OF_MONTH) + "/" + anniversary.get(Calendar.YEAR) + ", " + type);
               
            //list[currentID] = new contact(id, name, birthday, anniversary, type);
            contacts.add(c);
            /////////////////////////////
            currentID +=1;
            if(in.hasNext()) in.nextLine();
        }
        book1 = contacts;
    }
    
    public void remove(int id){
        if(!book1.isEmpty())
            book1.remove(id);
    }
    
    public void printContacts(){
        //System.out.println("Book length of: " + book.length);
        for(int count = 0; count <= book1.size()-1; count++){
            //System.out.println(count);
            System.out.println(book1.get(count).getID() + ", " + book1.get(count).getName() + ", " + 
                book1.get(count).getBirthday().get(Calendar.MONTH) + "/" + 
                book1.get(count).getBirthday().get(Calendar.DAY_OF_MONTH) + "/" + 
                book1.get(count).getBirthday().get(Calendar.YEAR) + ", " + 
                book1.get(count).getAnniversary().get(Calendar.MONTH) + "/" + 
                book1.get(count).getAnniversary().get(Calendar.DAY_OF_MONTH) + "/" + 
                book1.get(count).getAnniversary().get(Calendar.YEAR) + ", " + 
                book1.get(count).getPhone() + ", " +
                //book1.get(count).getAddress() + ", " +    
                book1.get(count).getType());
            //System.out.println("End of Cycle: " + count);
        }
        //System.out.println("done with contacts");
    }
    
    public String[][] getContactDates(){
        String[][] dateAndPerson = null;
        for(int count = 0; count <= book1.size()-1; count++){
            
            if (book1.get(count).getBirthday().get(Calendar.YEAR)!=1){
                dateAndPerson[count][0] = book1.get(count).getBirthday().get(Calendar.MONTH) + "/" + 
                book1.get(count).getBirthday().get(Calendar.DAY_OF_MONTH) + "/" + 
                book1.get(count).getBirthday().get(Calendar.YEAR) + ", " + book1.get(count).getName();
            }
            if (book1.get(count).getAnniversary().get(Calendar.YEAR)!=1){
                dateAndPerson[count][1] = book1.get(count).getAnniversary().get(Calendar.MONTH) + "/" + 
                book1.get(count).getAnniversary().get(Calendar.DAY_OF_MONTH) + "/" + 
                book1.get(count).getAnniversary().get(Calendar.YEAR) + ", " + book1.get(count).getName();
            } 
        }
        return dateAndPerson;
    }
    
    /*public void printContacts()
    {
        //System.out.println("Book length of: " + book.length);
        for(int count = 0; count <= book.length-1; count++){
            //System.out.println(count);
            System.out.println(book[count].getID() + ", " + book[count].getName() + ", " + 
                book[count].getBirthday().get(Calendar.MONTH) + "/" + 
                book[count].getBirthday().get(Calendar.DAY_OF_MONTH) + "/" + 
                book[count].getBirthday().get(Calendar.YEAR) + ", " + 
                book[count].getAnniversary().get(Calendar.MONTH) + "/" + 
                book[count].getAnniversary().get(Calendar.DAY_OF_MONTH) + "/" + 
                book[count].getAnniversary().get(Calendar.YEAR) + ", " + 
                book[count].getType());
            //System.out.println("End of Cycle: " + count);
        }
        //System.out.println("done with contacts");
    }
    */
    
    /*public String[][] getContactDates()
    {
        String[][] dateAndPerson = null;
        for(int count = 0; count <= book.length-1; count++){
            
            if (book[count].getBirthday() != null){
                dateAndPerson[count][0] = book[count].getBirthday().get(Calendar.MONTH) + "/" + 
                book[count].getBirthday().get(Calendar.DAY_OF_MONTH) + "/" + 
                book[count].getBirthday().get(Calendar.YEAR) + ", " + book[count].getName();
            }
            if (book[count].getAnniversary() != null){
                dateAndPerson[count][1] = book[count].getAnniversary().get(Calendar.MONTH) + "/" + 
                book[count].getAnniversary().get(Calendar.DAY_OF_MONTH) + "/" + 
                book[count].getAnniversary().get(Calendar.YEAR) + ", " + book[count].getName();
            } 
        }
        return dateAndPerson;
    }
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
    
}

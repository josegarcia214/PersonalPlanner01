/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personalplanner;


/**
 *
 * @author Jose
 */
public class Note {
    
    private String data;
    
    public Note(String DATA)
    {
        data = DATA;
    }
    public Note()
    {
        data = null;
    }
    
    public String getNote(){return data;}
    public void setNote(String DATA){data = DATA;}
    
}

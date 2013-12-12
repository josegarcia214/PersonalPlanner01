/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package personalplanner;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose
 */
public class Notebook {
    
   private List<Note> noteArray = new ArrayList<>();
   private int i = 0;
   
   public Notebook()
   {
         
   }
   
   public void addNote(Note N)
   {
       noteArray.add(N);
   }
   public int noteSize()
   {
       return noteArray.size();
   }
   public void deleteNote(Note N)
   {
       for(i = 0; i < noteArray.size(); i++)
       {
           if(noteArray.get(i) == N)
           {
               noteArray.remove(i);
           }
       }
   }
   
   
    
}

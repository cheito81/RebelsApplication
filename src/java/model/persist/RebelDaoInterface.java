
package model.persist;

import java.util.List;
import model.Rebel;

/**
 *
 * @author alumne
 */
public interface RebelDaoInterface {
 
    /**
    * retrieves all rebelds from persistence media
    * @return all rebelds objects
    */
    public List<Rebel> findAll();
   /**
    * adds a new rebeld to persistence media.
    * @param rebeld to add
    * @return true if succesfull, false otherwise
    */
    public boolean insert(Rebel rebeld);
}

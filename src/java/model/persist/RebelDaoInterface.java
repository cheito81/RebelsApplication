/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

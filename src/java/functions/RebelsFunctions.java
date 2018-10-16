/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

import controller.RebelController;
import exceptions.CustomException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import model.Rebel;

/**
 *
 * @author jgc_
 */
public class RebelsFunctions {
    
     /**
   * Validate a simple integer number
   *
   * @param value
   * @return true or false
   */
  public static Boolean existRebeld(Rebel newRebeld, Rebel rebldRegistered ){
    boolean flag = true;
    
        if(newRebeld.getPlanet().equalsIgnoreCase(rebldRegistered.getPlanet()) && newRebeld.getName().equalsIgnoreCase(rebldRegistered.getName())){
            flag = true;
        }else{
            flag = false;
        }
    
    return flag;
  }
  
  public static Boolean rebelsNotNull(String planet, String name) throws CustomException{
      boolean flag = true;
      
      try{
            if(!name.equals(null) && !planet.equals(null)){
               flag = true;
            }
      }catch(NullPointerException e){
          throw new CustomException("field null");
      }
     
      return flag;
  }
  
  public static Boolean rebelsNotEmpty(String planet, String name){
      boolean flag = true;
      
      if(!name.isEmpty() && !planet.isEmpty()){
         flag = true;
      }else{
          flag = false;
          }
      
      return flag;
  }
  
  public static Boolean planetNotEarth(String planet){
      boolean flag = true;
      
      if(!planet.equalsIgnoreCase("tierra") && !planet.equalsIgnoreCase("earth")){
         flag = true;
      }else{
          flag = false;
          }
      
      return flag;
  }
 public static String getRuta(Class clas){
      
   String webInfPath;
      File myClass = new File(clas.getProtectionDomain().getCodeSource().getLocation().getFile());
 
        int index =  myClass.getAbsolutePath().indexOf("WEB-INF");
        webInfPath = myClass.getAbsolutePath().replaceAll("%20", " ").substring(0,index);
       return webInfPath;
      
  }  
}

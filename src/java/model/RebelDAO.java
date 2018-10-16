/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import exceptions.CustomException;
import functions.RebelsFunctions;
import java.io.File;
import java.util.List;
import model.persist.RebelArrayDao;
import model.persist.RebelDaoInterface;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 *
 * @author jgc_
 */
public class RebelDAO {
    private RebelDaoInterface rebeldDao;
    private static final Logger log =Logger.getLogger(RebelDAO.class);
    public RebelDAO(){
    rebeldDao = new RebelArrayDao();
       PropertyConfigurator.configure(RebelsFunctions.getRuta(this.getClass())+"WEB-INF"+ File.separator+"config"+ File.separator +"log4j.properties");
    }
    
    public List<Rebel> findAllRebelds(){

        return rebeldDao.findAll();
    }
    
    public synchronized boolean insert(Rebel rebeldObj){
        String result ="";

        if (rebeldDao.insert(rebeldObj)) return true;
        else return false;
       
        //return friendDao.insert(entity);
    }
    
    public boolean insertRebel (String name,String planet){
    boolean result = false;
        try{    
                if (RebelsFunctions.rebelsNotNull(planet, name) && RebelsFunctions.rebelsNotEmpty(planet, name)){
                    
                    if(RebelsFunctions.planetNotEarth(planet)){
                        RebelThread runnableObj = new RebelThread(new Rebel(name,planet),this);
                        Thread threadObj = new Thread(runnableObj);
                        threadObj.start();
                        threadObj.join();
             
                         if(runnableObj.getResult()) {
                         log.info("msg: Registry inserted correctly");
                         result = true;
                     } else {
                         log.info("Warn: registry not inserted rebel already exist!");
                     }
                        
                    }else{
                        log.info("Info: registry not inserted rebel of planet earth!");
                    }
                }else{
                    log.warn("Warn: registry not inserted fields empty!");
                }
        }catch(CustomException | InterruptedException e){
            log.error("Error "+ e.getMessage());
        }
        return result;
    }

}

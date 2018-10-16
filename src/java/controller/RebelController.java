
package controller;

import com.google.gson.Gson;
import exceptions.CustomException;
import functions.RebelsFunctions;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.FileSystems;
import java.util.List;
import java.util.logging.Level;
import javax.ws.rs.FormParam;
import javax.ws.rs.Path;
import model.RebelDAO;
import model.Rebel;
import model.RebelThread;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.helpers.Loader;

/**
 *
 * @author jgc_
 */
public class RebelController {
    
    RebelDAO rebelDaoObj;
    private static final Logger log =Logger.getLogger(RebelController.class);
    public RebelController(){
         rebelDaoObj = new RebelDAO();
         String ruta = RebelsFunctions.getRuta(this.getClass());
         PropertyConfigurator.configure(ruta+"WEB-INF"+ File.separator+"config"+ File.separator +"log4j.properties");
         log.debug("Debug, message controller");
    }
    
    public boolean insertRebel(@FormParam("name") String name, @FormParam("planet") String planet){
        log.info("Starting to insert rebel");
        boolean result = false;
        result = rebelDaoObj.insertRebel(name,planet);
        log.info("insert rebel finished");
        return result;
    }
    
    public String getRebels() {
        
         List<Rebel> rebeldList = rebelDaoObj.findAllRebelds();
        return new Gson().toJson(rebeldList);
    }
   

}

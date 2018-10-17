
package rebels.services;

import com.google.gson.Gson;
import controller.RebelController;
import exceptions.CustomException;
import functions.RebelsFunctions;
import java.util.List;
import javax.servlet.ServletContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import controller.RebelController;
import model.Rebel;

/**
 * RebelsService
 *
 * @author jgc_
 */
@Path("rebels")
public class RebelsService {
     
    RebelController controller;
    /**
     * Creates a new instance of Rebelds
     */
    public RebelsService(@Context ServletContext context) {
        
         if(context.getAttribute("rebelController") != null)
             controller = (RebelController) context.getAttribute("rebelController");
         else{
             controller = new RebelController();
             context.setAttribute("rebelController", controller);
         }
    }

    public RebelsService() { //para el test
        controller = new RebelController();
    }

    @GET
    @Path("/searchAll")
    public String getRebels() {
        
        String rebeldList = controller.getRebels();
        return rebeldList;
    }
    
    @POST
    @Path("/insert")
    public boolean insertRebel(@FormParam("name") String name, @FormParam("planet") String planet){
        boolean response = false;
  
        response = controller.insertRebel(name,planet);
           
        return response;
    }
   
}

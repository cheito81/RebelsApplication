
package integration.test;


import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletContext;
import javax.ws.rs.core.Context;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runners.Parameterized;
import rebels.services.RebelsService;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServlet;
import org.junit.runner.RunWith;

/**
 *
 * @author jgc_
 */
@RunWith(value = Parameterized.class)
public class RebelsApplicationTest extends HttpServlet{
    private RebelsService rebelsService;
    private String name ="";
    private String planet ="";
    private Boolean exp;
    
  public RebelsApplicationTest(String name,String planet,Boolean exp){
        this.name = name;
        this.planet = planet;
        this.exp = exp;
    }
    @Before 
    public void instantiate(){
         rebelsService = new RebelsService();
    }
       
    
    
    @Parameterized.Parameters
    public static List<Object[]> getAllData() {
        return Arrays.asList(new Object[][] {     
                {"John","tierra", false}, {"Jose","earth", false}, {"Peter","pluton", true}
           });
        
    }
    
    @Test
     public void rebelsTest() {
         Boolean res = rebelsService.insertRebel(this.name, this.planet);
          assertEquals(this.exp, res);  
     }
}
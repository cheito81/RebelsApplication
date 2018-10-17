
package JUnitTest;

import functions.RebelsFunctions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import model.*;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author jgc_
 */
@RunWith(value = Parameterized.class)
public class planetTest {
    
    private String planet ="";
    private Boolean exp;
    private RebelsFunctions functions;
    public planetTest(String planet,Boolean exp){
        this.planet = planet;
        this.exp = exp;
    }
    
    @Before
    public void instantiate(){
        functions = new RebelsFunctions();
    }
    
    @Parameters
    public static List<Object[]> getAllData() {
        return Arrays.asList(new Object[][] {     
                {"tierra", false}, {"earth", false}, {"pluton", true}
           });
        
    }
    
    @Test
     public void planetNotEarthTest() {
         Boolean res = functions.planetNotEarth(this.planet);
          assertEquals(this.exp, res);  
     }
}

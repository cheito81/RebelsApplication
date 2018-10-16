/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTest;

import functions.RebelsFunctions;
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

/**
 *
 * @author jgc_
 */
@RunWith(value = Parameterized.class)
public class EmptyTest {
    
    private String planet ="";
    private String name ="";
    private Boolean exp;
    private RebelsFunctions functions;
    
    public EmptyTest(String planet,String name,Boolean exp){
        this.planet = planet;
        this.name = name;
        this.exp = exp;
    }
    
    @Before
    public void instantiate(){
        functions = new RebelsFunctions();
    }
    
    @Parameterized.Parameters
    public static List<Object[]> getAllData() {
        return Arrays.asList(new Object[][] {     
                {"tierra","kjnn", true}, {"jupiter","", false}, {"","pere", false}
           });
        
    }
    
    @Test
     public void rebelsNotEmptyTest() {
         Boolean res = functions.rebelsNotEmpty(this.planet,this.name);
          assertEquals(this.exp, res);  
     }
}

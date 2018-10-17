
package model;

import org.apache.log4j.Logger;

/**
 *
 * @author jgc_
 */
public class RebelThread implements Runnable{
    
    private Rebel rebelObj;
    private RebelDAO model;
    private boolean result = false;
    public RebelThread(Rebel rebelObj, RebelDAO model) {
        this.rebelObj = rebelObj;
        this.model = model;
    }
    
     public boolean getResult() {
        return result;
    }
    

    @Override
    public void run() {
                
            this.result = model.insert(rebelObj);
    }

   
}

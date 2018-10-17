
package model.persist;

import functions.RebelsFunctions;
import java.util.ArrayList;
import java.util.List;
import model.Rebel;

/**
 *
 * @author jgc_
 */
public class RebelArrayDao implements RebelDaoInterface{
     private List<Rebel> dataSource;

    public RebelArrayDao() {
         dataSource = new ArrayList<>();
         dataSource.add(new Rebel("pluton","Peter"));  
    }
    @Override
    public List<Rebel> findAll() {
        return dataSource;
    }
    @Override
    public boolean insert(Rebel reldObj) {
      
        boolean flag = false;
        for(Rebel rebldRegistered: dataSource){
            if(RebelsFunctions.existRebeld(reldObj, rebldRegistered)) flag = true;
        }
        if(reldObj == null) flag = true;
        
        if(!flag) dataSource.add(reldObj);
        
        return !flag;
    }
     
}

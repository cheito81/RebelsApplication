
package exceptions;

/**
 *
 * @author jgc_
 */
public class CustomException extends Exception{
    String tipusError;
    public CustomException(String message){
        super(message);
        this.tipusError = tipusError;
    }
}

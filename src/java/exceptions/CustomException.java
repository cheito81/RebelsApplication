/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CIT260.Group5ot.exceptions;

/**
 *
 * @author ken
 */
public class MeatShareException extends Exception {

    public MeatShareException() {
    }

    public MeatShareException(String message) {
        super(message);
    }

    public MeatShareException(String message, Throwable cause) {
        super(message, cause);
    }

    public MeatShareException(Throwable cause) {
        super(cause);
    }

    public MeatShareException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}

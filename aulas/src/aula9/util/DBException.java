package aula9.util;

import java.util.Date;

/**
 * @author gabriela.zanetti
 */
public class DBException extends Exception{   

    public DBException() {
    }

    public DBException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "ERRO DO DB: "+super.getMessage(); 
    } 
}

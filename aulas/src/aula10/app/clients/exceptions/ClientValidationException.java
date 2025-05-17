package aula10.app.clients.exceptions;

import java.util.Date;

/**
 *
 * @author gabriela.zanetti
 */
// Criar uma exception
public class ClientValidationException extends Exception {
    Date date;
    
    public ClientValidationException(Exception ex) {
        super(ex);
        date = new Date();
    }
    
    public ClientValidationException(String ex) {
        super(ex);
        date = new Date();
    }
    
    @Override
    public String getMessage() {
        return date.toString() + " " + super.getMessage();
    }
}

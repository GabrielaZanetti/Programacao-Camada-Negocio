package app.utils.db;

import java.util.Date;

/**
 *
 * @author gabriela.zanetti
 */
public class DBException extends Exception {
    Date date;

    public DBException() {
        super();
        date = new Date();
    }

    public DBException(String message) {
        super(message);
    }

    public DBException(String message, Throwable cause) {
        super(message, cause);
    }

    public DBException(Throwable cause) {
        super(cause);
        date = new Date();
    }
    
    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

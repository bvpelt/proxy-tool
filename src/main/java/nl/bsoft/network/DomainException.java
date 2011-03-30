package nl.bsoft.network;


/**
 * General Domain Exception.
 * 
 * @author andelm
 * @version 1.0
 */
public class DomainException extends Exception {

    private static final long serialVersionUID = 1L;

    /**
     * Default constructor voor nieuwe excepties.
     * 
     * @param message
     */
    public DomainException(final String message) {
        super(message);
    }

    /**
     * Constructor voor excepties voor onderliggende exceptions.
     * 
     * @param message
     * @param cause
     */
    public DomainException(final String message, final Throwable cause) {
        super(message, cause);
    }

}

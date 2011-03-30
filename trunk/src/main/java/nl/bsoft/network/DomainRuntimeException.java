package nl.bsoft.network;

/**
 * General Domain Runtime Exception.
 * 
 * @author andelm
 * @since 1.0
 */
public class DomainRuntimeException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     * 
     * @param message
     */
    public DomainRuntimeException(final String message) {
        super(message);
    }

    /**
     * Default constructor.
     * 
     * @param message
     * @param cause
     */
    public DomainRuntimeException(final String message, final Throwable cause) {
        super(message, cause);
    }

}

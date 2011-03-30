package nl.bsoft.network;

import org.apache.log4j.Logger;


/**
 * Abstract class which creates (and holds) the actual SLF4J {@link Logger}.
 * 
 * @author andelm
 * @since 1.3.0
 */
public abstract class AbstractLoggingDelegate {

	private static Logger logger = null;

	/**
	 * Default constructor.
	 * 
	 * @param loggingComposite
	 */
	public AbstractLoggingDelegate(final LoggingComposite loggingComposite) {
		this(loggingComposite, null);
	}

	/**
	 * Default constructor.
	 * 
	 * @param loggingComposite
	 * @param logAppenderPrefix
	 *            prefix added to the logger to define a specific appender
	 */
	public AbstractLoggingDelegate(final LoggingComposite loggingComposite,
			final String logAppenderPrefix) {
		super();
		String category = null;
		if (logAppenderPrefix == null) {
			category = loggingComposite.getClass().getName();
		} else {
			category = logAppenderPrefix
					+ loggingComposite.getClass().getName();
		}
		logger = Logger.getLogger(category);
	}

}

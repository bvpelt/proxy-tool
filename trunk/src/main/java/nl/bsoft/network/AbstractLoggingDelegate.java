package nl.bsoft.network;
/*
   Copyright 2011 BSoft

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.

   Purpose:
   The AbstractLoggingDelegate is an abstract class. 
   It is used as a template for all derived classes to instantiate a logger.
 */

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

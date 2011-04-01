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
The Configuration class is used to get configuration settings
*/

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.ConfigurationFactory;
import org.apache.log4j.Logger;

/**
 * Configuration class based on commons-configuration.
 * 
 * @author andelm
 * @since 1.0
 */
//public class Configuration extends LoggingObject {
public class Configuration  { 
	private static Logger logger = Logger.getLogger(Configuration.class);

    private static final String DEFAULT_CONFIG_FILE = "commons-config.xml";
    // config file
    private String configFile;
    // commons-configuration field
    private org.apache.commons.configuration.Configuration config = null;

    /**
     * Default constructor.
     */
    public Configuration() {
        super();
    }

    /**
     * (Re)loads the configuration.
     * 
     * @throws DomainRuntimeException
     *             if configuration could not be (re)loaded
     */
    public void reload() {
        if (configFile == null) {
            configFile = DEFAULT_CONFIG_FILE;
        }
        try {
            ConfigurationFactory factory = new ConfigurationFactory(configFile);
            config = factory.getConfiguration();
        }
        catch (ConfigurationException e) {
            throw new DomainRuntimeException("Error loading configuration", e);
        }
    }

    /**
     * Get String value for this key.
     * 
     * @param key
     * @return String value
     * @throws DomainRuntimeException
     *             if key is not found in configuration
     */
    public String getString(final String key) {
        String value = null;
        if (getConfig() != null) {
            try {
                value = getConfig().getString(key);
            }
            catch (NullPointerException e) {
                logger.info("Configuratie niet gevonden voor: " + key);
            }
        }
        if (value == null || key.equals(value)) {
            throw new DomainRuntimeException("Configuratie niet gevonden voor: " + key);
        }
        return value;
    }

    /**
     * Get int value for this key.
     * 
     * @param key
     * @return int value
     * @throws DomainRuntimeException
     *             if key is not found in configuration
     */
    public int getInt(final String key) {
        int value = -1;
        if (getConfig() != null) {
            value = getConfig().getInt(key);
        }
        if (value == -1) {
            throw new DomainRuntimeException("Configuratie niet gevonden voor: " + key);
        }
        return value;
    }

    /**
     * Get double value for this key.
     * 
     * @param key
     * @return double value
     * @throws DomainRuntimeException
     *             if key is not found in configuration
     */
    public double getDouble(final String key) {
    	double value = -1;
        if (getConfig() != null) {
            value = getConfig().getDouble(key);
        }
        if (value == -1) {
            throw new DomainRuntimeException("Configuratie niet gevonden voor: " + key);
        }
        return value;
    }

    /**
     * Get String array value for this key.
     * 
     * @param key
     * @return String[] value
     * @throws DomainRuntimeException
     *             if key is not found in configuration
     */
    public String[] getStringArray(final String key) {
        String[] value = null;
        if (getConfig() != null) {
            try {
                value = getConfig().getStringArray(key);
            }
            catch (NullPointerException e) {
                logger.info("Configuratie niet gevonden voor: " + key);
            }
        }
        if (value == null || key.equals(value)) {
            throw new DomainRuntimeException("Configuratie niet gevonden voor: " + key);
        }
        return value;
    }

    /**
     * Sets the configFile (defaults to <code>commons-config.xml</code>) and reloads the
     * configuration.
     * 
     * @param configFile
     */
    public void setConfigFile(final String configFile) {
        this.configFile = configFile;
        reload();
    }

    /**
     * @return commons-configuration config object; if null it is initialized/reloaded
     */
    private org.apache.commons.configuration.Configuration getConfig() {
        if (config == null) {
            reload();
        }
        return config;
    }

}


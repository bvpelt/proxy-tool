package nl.bsoft.network;

/**
 * Hello world!
 *
 */
public class App 
{
	private String outputdir = null;
	private boolean loggingSwitch = true;
	private boolean outputSwitch = true;
	private boolean switchToSecure = false;
	private boolean verifyHostName = false;
	private int timeout = 0;
	
	public void testConfig() {
		Configuration configuration = null;
	
		if (configuration == null) {
			configuration = new Configuration();
			configuration.setConfigFile("klic-proxy-config.xml");
		}
	
		outputdir = configuration.getString("klic-proxy.outputdir");
		
		loggingSwitch = new Boolean(
				configuration.getString("klic-proxy.loggingswitch"))
				.booleanValue();
		outputSwitch = new Boolean(
				configuration.getString("klic-proxy.outputswitch"))
				.booleanValue();
		switchToSecure = new Boolean(
				configuration.getString("klic-proxy.switchtosecure"))
				.booleanValue();
		verifyHostName = new Boolean(
				configuration.getString("klic-proxy.verifyhostname"))
				.booleanValue();

		timeout = configuration.getInt("klic-proxy.timeout");
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.testConfig();
    }
}

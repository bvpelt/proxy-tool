package nl.bsoft.network;

import javax.net.ssl.SSLSession;
import javax.net.ssl.HostnameVerifier;

public class MyVerifier implements HostnameVerifier {

	public boolean verify(String arg0, SSLSession arg1) {

		return true;
	}
}

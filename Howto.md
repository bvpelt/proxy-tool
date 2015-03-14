# Introduction #

This page shows you how to achieve things like building the maven project, documentation and deployment of the proxy tool


# Details #


## Howto build the project ##
  * First checkout the project: `# svn checkout http://proxy-tool.googlecode.com/svn/trunk/ proxy-tool-read-only`
  * Goto directory where project is checkedout
  * Build with maven: `# mvn package`

## Howto build documentation ##
  * First checkout the project: `# svn checkout http://proxy-tool.googlecode.com/svn/trunk/ proxy-tool-read-only`
  * Goto directory where project is checkedout
  * Build with maven: `# mvn site`

## Howto use certificates ##
I tested this on unix (fedora core 12) with java 1.6.0\_18-b07)
Trusted certificates are found on:
`$JAVA_HOME/jre/lib/security/cacerts`

You can view the content of this keystore.
The output looks like:
```
keytool -list --keystore $JAVA_HOME/jre/lib/security/cacerts 
Enter keystore password:  

*****************  WARNING WARNING WARNING  *****************
* The integrity of the information stored in your keystore  *
* has NOT been verified!  In order to verify its integrity, *
* you must provide your keystore password.                  *
*****************  WARNING WARNING WARNING  *****************

Keystore type: JKS
Keystore provider: SUN

Your keystore contains 72 entries

digicertassuredidrootca, Jan 7, 2008, trustedCertEntry,
Certificate fingerprint (MD5): 87:CE:0B:7B:2A:0E:49:00:E1:58:71:9B:37:A8:93:72
trustcenterclass2caii, Jan 7, 2008, trustedCertEntry,
Certificate fingerprint (MD5): CE:78:33:5C:59:78:01:6E:18:EA:B9:36:A0:B9:2E:23
thawtepremiumserverca, Feb 12, 1999, trustedCertEntry,
Certificate fingerprint (MD5): 06:9F:69:79:16:66:90:02:1B:8C:8C:A2:C3:07:6F:3A
swisssignsilverg2ca, Aug 13, 2008, trustedCertEntry,
Certificate fingerprint (MD5): E0:06:A1:C9:7D:CF:C9:FC:0D:C0:56:75:96:D8:62:13
swisssignplatinumg2ca, Aug 13, 2008, trustedCertEntry,
Certificate fingerprint (MD5): C9:98:27:77:28:1E:3D:0E:15:3C:84:00:B8:85:03:E6
equifaxsecureebusinessca2, Jul 18, 2003, trustedCertEntry,
Certificate fingerprint (MD5): AA:BF:BF:64:97:DA:98:1D:6F:C6:08:3A:95:70:33:CA
equifaxsecureebusinessca1, Jul 18, 2003, trustedCertEntry,
Certificate fingerprint (MD5): 64:9C:EF:2E:44:FC:C6:8F:52:07:D0:51:73:8F:CB:3D
thawteserverca, Feb 12, 1999, trustedCertEntry,
Certificate fingerprint (MD5): C5:70:C4:A2:ED:53:78:0C:C8:10:53:81:64:CB:D0:1D
utnuserfirstclientauthemailca, May 2, 2006, trustedCertEntry,
Certificate fingerprint (MD5): D7:34:3D:EF:1D:27:09:28:E1:31:02:5B:13:2B:DD:F7
thawtepersonalfreemailca, Feb 12, 1999, trustedCertEntry,
Certificate fingerprint (MD5): 1E:74:C3:86:3C:0C:35:C5:3E:C2:7F:EF:3C:AA:3C:D9
utnuserfirsthardwareca, May 2, 2006, trustedCertEntry,
Certificate fingerprint (MD5): 4C:56:41:E5:0D:BB:2B:E8:CA:A3:ED:18:08:AD:43:39
entrustevca, Apr 28, 2009, trustedCertEntry,
Certificate fingerprint (MD5): D6:A5:C3:ED:5D:DD:3E:00:C1:3D:87:92:1F:1D:3F:E4
certumca, Feb 10, 2009, trustedCertEntry,
Certificate fingerprint (MD5): 2C:8F:9F:66:1D:18:90:B1:47:26:9D:8E:86:82:8C:A9
addtrustclass1ca, May 2, 2006, trustedCertEntry,
Certificate fingerprint (MD5): 1E:42:95:02:33:92:6B:B9:5F:C0:7F:DA:D6:B2:4B:FC
equifaxsecureca, Jul 18, 2003, trustedCertEntry,
Certificate fingerprint (MD5): 67:CB:9D:C0:13:24:8A:82:9B:B2:17:1E:D1:1B:EC:D4
quovadisrootca3, Jun 9, 2009, trustedCertEntry,
Certificate fingerprint (MD5): 31:85:3C:62:94:97:63:B9:AA:FD:89:4E:AF:6F:E0:CF
quovadisrootca2, Jun 9, 2009, trustedCertEntry,
Certificate fingerprint (MD5): 5E:39:7B:DD:F8:BA:EC:82:E9:AC:62:BA:0C:54:00:2B
digicerthighassuranceevrootca, Jan 7, 2008, trustedCertEntry,
Certificate fingerprint (MD5): D4:74:DE:57:5C:39:B2:D3:9C:85:83:C5:C0:65:49:8A
secomvalicertclass1ca, May 1, 2008, trustedCertEntry,
Certificate fingerprint (MD5): 65:58:AB:15:AD:57:6C:1E:A8:A7:B5:69:AC:BF:FF:EB
equifaxsecureglobalebusinessca1, Jul 18, 2003, trustedCertEntry,
Certificate fingerprint (MD5): 8F:5D:77:06:27:C4:98:3C:5B:93:78:E7:D7:7D:9B:CC
verisignclass3ca, Oct 27, 2003, trustedCertEntry,
Certificate fingerprint (MD5): 10:FC:63:5D:F6:26:3E:0D:F3:25:BE:5F:79:CD:67:67
deutschetelekomrootca2, Nov 6, 2008, trustedCertEntry,
Certificate fingerprint (MD5): 74:01:4A:91:B1:08:C4:58:CE:47:CD:F0:DD:11:53:08
verisignclass2ca, Oct 27, 2003, trustedCertEntry,
Certificate fingerprint (MD5): B3:9C:25:B1:C3:2E:32:53:80:15:30:9D:4D:02:77:3E
utnuserfirstobjectca, May 2, 2006, trustedCertEntry,
Certificate fingerprint (MD5): A7:F2:E4:16:06:41:11:50:30:6B:9C:E3:B4:9C:B0:C9
thawtepersonalpremiumca, Feb 12, 1999, trustedCertEntry,
Certificate fingerprint (MD5): 3A:B2:DE:22:9A:20:93:49:F9:ED:C8:D2:8A:E7:68:0D
verisignclass1ca, Mar 25, 2004, trustedCertEntry,
Certificate fingerprint (MD5): 97:60:E8:57:5F:D3:50:47:E5:43:0C:94:36:8A:B0:62
baltimorecodesigningca, May 10, 2002, trustedCertEntry,
Certificate fingerprint (MD5): 90:F5:28:49:56:D1:5D:2C:B0:53:D4:4B:EF:6F:90:22
baltimorecybertrustca, May 10, 2002, trustedCertEntry,
Certificate fingerprint (MD5): AC:B6:94:A5:9C:17:E0:D7:91:52:9B:B1:97:06:A6:E4
starfieldclass2ca, Jan 20, 2005, trustedCertEntry,
Certificate fingerprint (MD5): 32:4A:4B:BB:C8:63:69:9B:BE:74:9A:C6:DD:1D:46:24
camerfirmachamberscommerceca, Oct 10, 2008, trustedCertEntry,
Certificate fingerprint (MD5): B0:01:EE:14:D9:AF:29:18:94:76:8E:F1:69:33:2A:84
ttelesecglobalrootclass3ca, Feb 10, 2009, trustedCertEntry,
Certificate fingerprint (MD5): CA:FB:40:A8:4E:39:92:8A:1D:FE:8E:2F:C4:27:EA:EF
trustcenteruniversalcai, Jan 7, 2008, trustedCertEntry,
Certificate fingerprint (MD5): 45:E1:A5:72:C5:A9:36:64:40:9E:F5:E4:58:84:67:8C
ttelesecglobalrootclass2ca, Feb 10, 2009, trustedCertEntry,
Certificate fingerprint (MD5): 2B:9B:9E:E4:7B:6C:1F:00:72:1A:CC:C1:77:79:DF:6A
verisignclass3g3ca, Mar 25, 2004, trustedCertEntry,
Certificate fingerprint (MD5): CD:68:B6:A7:C7:C4:CE:75:E0:1D:4F:57:44:61:92:09
certumtrustednetworkca, Feb 10, 2009, trustedCertEntry,
Certificate fingerprint (MD5): D5:E9:81:40:C5:18:69:FC:46:2C:89:75:62:0F:AA:78
certplusclass3pprimaryca, May 27, 2009, trustedCertEntry,
Certificate fingerprint (MD5): E1:4B:52:73:D7:1B:DB:93:30:E5:BD:E4:09:6E:BE:FB
verisignclass3g2ca, Mar 25, 2004, trustedCertEntry,
Certificate fingerprint (MD5): A2:33:9B:4C:74:78:73:D4:6C:E7:C1:F3:8D:CB:5C:E9
globalsignr3ca, Aug 17, 2009, trustedCertEntry,
Certificate fingerprint (MD5): C5:DF:B8:49:CA:05:13:55:EE:2D:BA:1A:C3:3E:B0:28
utndatacorpsgcca, May 2, 2006, trustedCertEntry,
Certificate fingerprint (MD5): B3:A5:3E:77:21:6D:AC:4A:C0:C9:FB:D5:41:3D:CA:06
secomscrootca2, Aug 17, 2009, trustedCertEntry,
Certificate fingerprint (MD5): 6C:39:7D:A4:0E:55:59:B2:3F:D6:41:B1:12:50:DE:43
secomscrootca1, May 1, 2008, trustedCertEntry,
Certificate fingerprint (MD5): F1:BC:63:6A:54:E0:B5:27:F5:CD:E7:1A:E3:4D:6E:4A
gtecybertrustglobalca, May 10, 2002, trustedCertEntry,
Certificate fingerprint (MD5): CA:3D:D3:68:F1:03:5C:D0:32:FA:B8:2B:59:E8:5A:DB
trustcenterclass4caii, Jan 7, 2008, trustedCertEntry,
Certificate fingerprint (MD5): 9D:FB:F9:AC:ED:89:33:22:F4:28:48:83:25:23:5B:E0
globalsignr2ca, Aug 1, 2007, trustedCertEntry,
Certificate fingerprint (MD5): 94:14:77:7E:3E:5E:FD:8F:30:BD:41:B0:CF:E7:D0:30
certplusclass2primaryca, May 27, 2009, trustedCertEntry,
Certificate fingerprint (MD5): 88:2C:8C:52:B8:A2:3C:F3:F7:BB:03:EA:AE:AC:42:0B
digicertglobalrootca, Jan 7, 2008, trustedCertEntry,
Certificate fingerprint (MD5): 79:E4:A9:84:0D:7D:3A:96:D7:C0:4F:E2:43:4C:89:2E
globalsignca, Mar 26, 2008, trustedCertEntry,
Certificate fingerprint (MD5): 3E:45:52:15:09:51:92:E1:B7:5D:37:9F:B1:87:29:8A
geotrustglobalca, Jul 18, 2003, trustedCertEntry,
Certificate fingerprint (MD5): F7:75:AB:29:FB:51:4E:B7:77:5E:FF:05:3C:99:8E:F5
soneraclass2ca, Mar 28, 2006, trustedCertEntry,
Certificate fingerprint (MD5): A3:EC:75:0F:2E:88:DF:FA:48:01:4E:0B:5C:48:6F:FB
verisigntsaca, Aug 13, 2008, trustedCertEntry,
Certificate fingerprint (MD5): 7F:66:7A:71:D3:EB:69:78:20:9A:51:14:9D:83:DA:20
quovadisrootca, Jun 9, 2009, trustedCertEntry,
Certificate fingerprint (MD5): 27:DE:36:FE:72:B7:00:03:00:9D:F4:F0:1E:6C:04:24
soneraclass1ca, Mar 28, 2006, trustedCertEntry,
Certificate fingerprint (MD5): 33:B7:84:F5:5F:27:D7:68:27:DE:14:DE:12:2A:ED:6F
valicertclass2ca, Jan 20, 2005, trustedCertEntry,
Certificate fingerprint (MD5): A9:23:75:9B:BA:49:36:6E:31:C2:DB:F2:E7:66:BA:87
comodoaaaca, May 2, 2006, trustedCertEntry,
Certificate fingerprint (MD5): 49:79:04:B0:EB:87:19:AC:47:B0:BC:11:51:9B:74:D0
aolrootca2, Mar 26, 2008, trustedCertEntry,
Certificate fingerprint (MD5): D6:ED:3C:CA:E2:66:0F:AF:10:43:0D:77:9B:04:09:BF
keynectisrootca, Jun 8, 2009, trustedCertEntry,
Certificate fingerprint (MD5): CC:4D:AE:FB:30:6B:D8:38:FE:50:EB:86:61:4B:D2:26
addtrustqualifiedca, May 2, 2006, trustedCertEntry,
Certificate fingerprint (MD5): 27:EC:39:47:CD:DA:5A:AF:E2:9A:01:65:21:A9:4C:BB
aolrootca1, Jan 17, 2008, trustedCertEntry,
Certificate fingerprint (MD5): 14:F1:08:AD:9D:FA:64:E2:89:E7:1C:CF:A8:AD:7D:5E
verisignclass2g3ca, Mar 25, 2004, trustedCertEntry,
Certificate fingerprint (MD5): F8:BE:C4:63:22:C9:A8:46:74:8B:B8:1D:1E:4A:2B:F6
addtrustexternalca, May 2, 2006, trustedCertEntry,
Certificate fingerprint (MD5): 1D:35:54:04:85:78:B0:3F:42:42:4D:BF:20:73:0A:3F
verisignclass2g2ca, Mar 25, 2004, trustedCertEntry,
Certificate fingerprint (MD5): 2D:BB:E5:25:D3:D1:65:82:3A:B7:0E:FA:E6:EB:E2:E1
swisssigngoldg2ca, Aug 13, 2008, trustedCertEntry,
Certificate fingerprint (MD5): 24:77:D9:A8:91:D1:3B:FA:88:2D:C2:FF:F8:CD:33:93
entrust2048ca, Jan 9, 2003, trustedCertEntry,
Certificate fingerprint (MD5): BA:21:EA:20:D6:DD:DB:8F:C1:57:8B:40:AD:A1:FC:FC
gtecybertrust5ca, May 10, 2002, trustedCertEntry,
Certificate fingerprint (MD5): 7D:6C:86:E4:FC:4D:D1:0B:00:BA:22:BB:4E:7C:6A:8E
camerfirmachambersignca, Oct 10, 2008, trustedCertEntry,
Certificate fingerprint (MD5): 9E:80:FF:78:01:0C:2E:C1:36:BD:FE:96:90:6E:08:F3
camerfirmachambersca, Oct 10, 2008, trustedCertEntry,
Certificate fingerprint (MD5): 5E:80:9E:84:5A:0E:65:0B:17:02:F3:55:18:2A:3E:D7
entrustsslca, Jan 9, 2003, trustedCertEntry,
Certificate fingerprint (MD5): DF:F2:80:73:CC:F1:E6:61:73:FC:F5:42:E9:C5:7C:EE
godaddyclass2ca, Jan 20, 2005, trustedCertEntry,
Certificate fingerprint (MD5): 91:DE:06:25:AB:DA:FD:32:17:0C:BB:25:17:2A:84:67
verisignclass1g3ca, Mar 25, 2004, trustedCertEntry,
Certificate fingerprint (MD5): B1:47:BC:18:57:D1:18:A0:78:2D:EC:71:E8:2A:95:73
secomevrootca1, May 1, 2008, trustedCertEntry,
Certificate fingerprint (MD5): 22:2D:A6:01:EA:7C:0A:F7:F0:6C:56:43:3F:77:76:D3
thawtepersonalbasicca, Feb 12, 1999, trustedCertEntry,
Certificate fingerprint (MD5): E6:0B:D2:C9:CA:2D:88:DB:1A:71:0E:4B:78:EB:02:41
verisignclass1g2ca, Mar 25, 2004, trustedCertEntry,
Certificate fingerprint (MD5): DB:23:3D:F9:69:FA:4B:B9:95:80:44:73:5E:7D:41:83
```

I copied the truststore so the keystore is inside the proxy kit.
Starting jboss and passing the truststore can be achieved with:

```
(JAVA_OPTS="-Djavax.net.ssl.trustStore=/home/bvpelt/workspace-helios/proxy-tool/src/main/resources/trusted-cacerts" $JBOSS_HOME/bin/run.sh )
=========================================================================

  JBoss Bootstrap Environment

  JBOSS_HOME: /home/bvpelt/Installation/jboss-5.1.0.GA

  JAVA: /opt/jdk1.6.0_18/bin/java

  JAVA_OPTS: -Dprogram.name=run.sh -server -Djavax.net.ssl.trustStore=/home/bvpelt/workspace-helios/proxy-tool/src/main/resources/trusted-cacerts -Djava.net.preferIPv4Stack=true

  CLASSPATH: /home/bvpelt/Installation/jboss-5.1.0.GA/bin/run.jar:/opt/jdk1.6.0_18/lib/tools.jar

=========================================================================
.
.
.
```
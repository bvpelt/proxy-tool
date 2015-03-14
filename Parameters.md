# Introduction #

This page explains the parameters used in the proxy tool and their purpose


# Parameters #

The following parameters are used:
  * web-proxy.outputdir default value: /tmp/cache
> > This parameter defines the directory where the logged request and response files are stored

  * web-proxy.loggingswitch default value: true
> > This parameters switches detailed logging on/off. Default is on.

  * web-proxy.outputswitch default value: true
> > This parameter defines if output of the received request and response should be written tot the output directory. Default on.

  * web-proxy.switchtosecure default value: false
> > This parameter defines if incoming http request should be transferred to https requests. This requires special configuration concerning ssl connections, certificates, truststores.

  * web-proxy.verifyhostname default value: false
> > This parameter defines if the hostname of a https connection should be verified. The default is off.

  * web-proxy.timeout default value: 0
> > This parameter defines the connection timeout of the proxy request. 0 means use the servlet default. The default is 0.
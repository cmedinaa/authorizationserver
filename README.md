# Authorization server

Simple example to show how to deal with a client app that makes use of oauth protocol for authentication and authorization topics

##Scope

It just shows how to set up a spring client to make it work with a single resource server and the corresponding client
backend as well. It's not meant to deal with the low level details of Oauth2 protocol, this means, do
not expect in this example to find Oauth2 flow implementations, it is provided by third parties included in the pom.xml

##Requirements

* You need along this backed two more which represent the resource and client servers.
* It's designed so that you can run it in your local PC ( no docker containerization so far ). This requires some local domain
  names defined in the local environment, namely "_domicilio_" and "_kubernetes.docker.internal_". Make sure you have them before running the backends.

##Use
Access to URL http://domicilio:8080/permissions/all in a web browser

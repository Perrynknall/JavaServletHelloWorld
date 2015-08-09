# JavaServletHelloWorld
A simple example on how to use and configure a basic java servlet with a "side-by-side" jsp file that performs the same function.

# Notes
A cheatsheet for Markdown can be found at [PacketLife.net](http://packetlife.net/media/library/16/Markdown.pdf).

# Milestones
Before a servlet can be developed on your machine, several set-up steps must be accomplished first:
* Install the latest (or appropriate) version of Java Software Development Kit (SDK) on your machine.
* Along with the Java SDK the same version of the Java Runtime Environment (JRE) should also install.
* Set JAVA_HOME in the Environment Variables.
* Install IntelliJ IDEA version 14 (or higher).
* Tomcat 6.0 (or higher) must be installed and configured.

# HelloWorldServletJSP.jsp
A simple JSP file that prints "Hello, world!" to the browser.  In this version the text "Hello, world!" is printed 
using a "println" contained in "<%" and "%>".

# HelloWorldServlet.java
A simple Java class used to print "Hello, world!" to the browser.  In this version the "doGet" method is overriden and
"Hello, world!" is written to the browser.  The "web.xml" file in the WEB-INF directory must be configured to tell
Tomcat how the user will access the Servlet.

# Manually Deploying the Java Servlet on the Tomcat 7 Server
Create the following directory structure under the Project directory
* WEB-INF
* WEB-INF/classes - all the classes you create should be found here
* WEB-INF/lib - any classes that are included in the project should be placed here

When creating the Servlet classes make sure to first create a PACKAGE that will contain them.  The PACKAGE namespace
will be used as the path in which the classes will be stored under in the "WEB-INF/classes" directory.

Create a file called "WEB-INF/web.xml".  Amoung other settings, this file will also contain configuration information
that tells Tomcat how the user will access this servlet.

- - -
# Using GITHUB to FORK, SYNC, and use PULL reqeusts.
*

######References
######Turner, Davis, & Chae, Jinseok, 2008.  Java Web Programming with Eclipse.
######Vukontic, Aleska, & Goodwill, James, 2011.  Apache Tomcat 7.  New York: Springer Science + Business Media.
 - - -
# JavaServletHelloWorld
A simple example on how to use and configure a basic java servlet with a "side-by-side" jsp file that performs the same function.

# Notes
A cheetsheet for Markdown can be found at [here](http://packetlife.net/media/library/16/Markdown.pdf).

# Milestones
Before a servlet can be developed on your machine, several set-up steps must be accomplished first:
* Install the latest (or appropriate) version of Java Software Development Kit (SDK) on your machine.
* Along with the Java SDK, the latest (or appropriate) version of the Java Runtime Environment (JRE) must be installed.
* IntelliJ IDEA version 14 (or higher) must be installed.
* Tomcat 6.0 (or higher) must be installed and configured.

# HelloWorldServletJSP.jsp
A simple JSP file that prints "Hello, world!" to the browser.  In this version the text "Hello, world!" is printed 
using a "println" contained in <%" and "%>".

# HelloWorldServlet.java
A simple Java class used to print "Hello, world!" to the browser.  In this version the "doGet" method is overriden and
"Hello, world!" is written to the browser.  In this example, the "web.xml" file in the WEB-INF directory must be 
configured.

######References
######Turner, Davis, & Chae, Jinseok, 2008.  Java Web Programming with Eclipse.
######Vukontic, Aleska, & Goodwill, James, 2011.  Apache Tomcat 7.  New York: Springer Science + Business Media.
 - - -
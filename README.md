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
# Using GITHUB to FORK, BRANCH, SYNC, and use PULL reqeusts.
This section uses the Windows Desktop interface.  This process may also be accomplished using the command line.
A typical application development cycle consists of creating a FORK of the original application in your account.  Then,
a BRANCH is created to preserve the original copy of the application where changes can be made and tested.  During the
development and testing phase, changes will applied to the local branch copy using "Commit To Master" with bulk changes
being commited to GITHUB using the SYNC command.  Changes can be rolled back using the "revert" process.  Once the
changes are complete, they may be submitted to the owner of the original application using a "Pull Request".  "Bug
Reports" may also be made.

* FORK
 * On the project page in GITHUB, use the FORK button to create a copy of the project in your GITHUB account.
 * Use the "CLONE IN DESKTOP" feature to make a copy of the project on your local machine.
* BRANCH
 * On the project page in your GITHUB account open the BRANCH dropdown and create a descriptive name for the new branch.
* SYNC
 * As changes are made to the application, use the desktop interface to COMMIT TO MASTER.
 * When the changes are ready to synch with GITHUB, use the SYNC button in the upper-righthand corner of the GUI
* PULL
 * Use the "Pull Request" link to request that the owner view and consider your changes.  
 * If approved, the changes will be MERGED with the master project.

######References
######Turner, Davis, & Chae, Jinseok, 2008.  Java Web Programming with Eclipse.
######Vukontic, Aleska, & Goodwill, James, 2011.  Apache Tomcat 7.  New York: Springer Science + Business Media.
 - - -
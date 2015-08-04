package com.helloworldapplications;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Peter on 8/4/2015.
 */
public class HelloWorldServlet extends HttpServlet{

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("    <head>");
        writer.println("        <title>Servlet Hello World</title>");
        writer.println("    </head>");
        writer.println("    <body>");
        writer.println("Hello, world!");
        writer.println("    </body>");
        writer.println("</html>");
    }

}
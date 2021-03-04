package demo;
 

import jakarta.servlet.SessionCookieConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class guru_register
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
        @Override
     protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String username = request.getParameter("username");
		
		//String password = request.getParameter("password");
                String html_1 = "<html> <head> <meta charset=\"UTF-8\"> <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> </head> <body> <div>";
                String html_2 = "</div></body></html>";
               // String invalid ;       
                        
                PrintWriter out = response.getWriter( );     
                        
                out.println(html_1);
                out.println("Hello Moto");
                out.println(html_2);
                
                
                
	}
       // out.println("<br />");

    }//while
  
                
		 
 
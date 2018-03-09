package main.java;
 
import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;//for using annotations instead of web.xml  

@WebServlet("/servlet2")   
public class ShowCookieData extends HttpServlet {  
   
public void doGet(HttpServletRequest request, HttpServletResponse response){  
    try{  
   
    response.setContentType("text/html");  
    PrintWriter out = response.getWriter();  
       
    Cookie ck[]=request.getCookies();  
    out.print("Hello "+ck[1].getValue());  
   
    out.close();  
   
         }catch(Exception e){System.out.println(e);}  
    }  
       
   
}
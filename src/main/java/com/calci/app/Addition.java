package com.calci.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class Addition extends HttpServlet  {
             @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            	 System.out.println("calculation Start");
            	PrintWriter pw=resp.getWriter();
            	resp.setContentType("text/html");
            	 String num1=req.getParameter("num1");
         		
         		String num2=req.getParameter("num2");
        		
        		double result=0;
        	if(num1!="" && num2!="") {
        		double number1=Integer.parseInt(num1);
        		double number2=Integer.parseInt(num2);
        		String cap=req.getParameter("s1");
        		if(cap.equalsIgnoreCase("Addition")) {
        			result=number1+number2;
        		}else if(cap.equalsIgnoreCase("Subtraction")) {
        			result=number1-number2;
        		}else if(cap.equalsIgnoreCase("Divide")) {
        			result=number1/number2;
        		}else if(cap.equalsIgnoreCase("Multiplication")) {
        			result=number1*number2;
        		}
        		
        		pw.println("<html><head>\r\n"
        				+ "<meta charset=\"ISO-8859-1\">\r\n"
        				+ "<title>Calculator</title>\r\n"
        				+ "<link rel=\"stylesheet\" href=\"./bootstrap-5.2.0-beta1-dist/css/bootstrap.css\">\r\n"
        				+ "</head><body align='center'> <div align=\"center\">\r\n"
        				+ "       <form action=\"add\" method=\"get\">\r\n"
        				+ "         <h1 class=\"list-group-item bg bg-primary\">CALCULATOR</h1>\r\n"
        				+ "         <br>\r\n"
        				+ "         <br>\r\n"
        				+ "		  Number 1:<input type=\"number\" name=\"num1\">\r\n"
        				+ "		  <br>\r\n"
        				+ "		  <br>\r\n"
        				+ "		\r\n"
        				+ "		  \r\n"
        				+ "		  Number 2: <input type=\"number\" name=\"num2\">\r\n"
        				+ "		  <br>\r\n"
        				+ "		  <br>\r\n"
        				+"       <h1 class=\"list-group-item bg-warning\"><font color='white'>Result: "+result+" </h1>"
        				+ "		  \r\n"
        				+ "		  <input class=\"btn btn-primary\" type=\"submit\" value=\"Addition\" name=\"s1\">\r\n"
        				+ "		  <input class=\"btn btn-danger\" type=\"submit\" value=\"Subtraction\" name=\"s1\">\r\n"
        				+ "		  <input class=\"btn btn-dark\" type=\"submit\" value=\"Divide\" name=\"s1\">\r\n"
        				+ "		  <input class=\"btn btn-secondary\" type=\"submit\" value=\"Multiplication\" name=\"s1\">\r\n"
        				+ "       </form>\r\n"
        				+ "     </div></body></html>");
        		//RequestDispatcher rd=req.getRequestDispatcher("index.html");
        		//rd.include(req, resp);
        	}else {
        		pw.println("<html><head>"
        				+ "<meta charset=\"ISO-8859-1\">"
        				+ "<title>Calculator</title>"
        				+ "<link rel=\"stylesheet\" href=\"./bootstrap-5.2.0-beta1-dist/css/bootstrap.css\">"
        				+ "</head><body align='center'> <div align=\"center\">"
        				+ "            <form action=\"add\" method=\"get\">"
        				+ "                <h1 class=\"list-group-item bg bg-primary\">CALCULATOR</h1>"
        				+ "        	        <br>"
        				+ "        		    <br>"
        				+ "        			Number 1:<input type=\"number\" name=\"num1\">"
        				+ "        			  <br>"
        				+ "        			  <br>"
        				+ "       	  Number 2: <input type=\"number\" name=\"num2\">"
        				+ "       		  <br>"
        				+ "        				  <br>"
        				+ "        		    <div align=center><font color=red><h1>Please Enter Values!!</h1></div>"
        				+ "        					  <input class=\"btn btn-primary\" type=\"submit\" value=\"Addition\" name=\"s1\">"
        				+ "        					  <input class=\"btn btn-danger\" type=\"submit\" value=\"Subtraction\" name=\"s1\">"
        				+ "        						  <input class=\"btn btn-dark\" type=\"submit\" value=\"Divide\" name=\"s1\">"
        				+ "        						  <input class=\"btn btn-secondary\" type=\"submit\" value=\"Multiplication\" name=\"s1\">"
        				+ "        		       </form>"
        				+ "       <hr> </div></body></html>");
        		//RequestDispatcher rd=req.getRequestDispatcher("index.html");
        		//rd.include(req, resp);
        	}
        }
}

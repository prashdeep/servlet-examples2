import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse response) throws IOException {
		//PrintWriter out = response.getWriter();
		//out.write("<h1 style='color: red; background-color:yellow;padding:10px'>  You are not  a valid User.."
		//		+ "</h1>");
		//out.flush();
		//out.close();
		response.sendRedirect("http://www.facebook.com");
	
	}

}


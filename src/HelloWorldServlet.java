import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse response) throws IOException, ServletException {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		if (username.equalsIgnoreCase("pradeep") && password.equalsIgnoreCase("hello")) {
			RequestDispatcher rd = req.getRequestDispatcher("/success");
			
			rd.forward(req, response);
		} else {
			RequestDispatcher rd = req.getRequestDispatcher("/error");
			rd.forward(req, response);
		}
	}

}

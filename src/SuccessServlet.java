import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SuccessServlet extends HttpServlet {

	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse response) throws IOException {

		PrintWriter out = response.getWriter();
		out.write("<h1 style='color: red; background-color:yellow;padding:10px'>Hello User : "
				+ req.getParameter("username")+  " Welcome to my first web application....</h1>");
		out.flush();
		out.close();

	}

}

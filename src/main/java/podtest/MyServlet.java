package podtest;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();
		out.println("<html><body>");
		out.println("req.getLocalAddr()="+req.getLocalAddr()+"<br/>");
		out.println("req.getLocalPort()="+req.getLocalPort()+"<br/>");
		out.println("req.getRemoteAddr()="+req.getRemoteAddr()+"<br/>");
		out.println("req.getRemoteHost()="+req.getRemoteHost()+"<br/>");
		out.println("req.getRemotePort()="+req.getRemotePort()+"<br/>");
		out.println("ip="+InetAddress.getLocalHost().getHostAddress()+"<br/>");
				out.println("</body></html>");
	}
}

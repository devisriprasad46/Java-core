

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/dogetdopostServlet")
public class DogetDopost extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public DogetDopost() 
    {
        System.out.println("Instance created");
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String umail=request.getParameter("Email");
		String upass=request.getParameter("Password");
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		if(umail.equals("dsp@gmail.com") && upass.equals("Dsp@2004"))
		{
			out.println("<h3>Welcome Devi Sri Prasad </h3>");
		}
		else {
			out.println("<h3>Check the credentials and enter correct details.</h3>");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}

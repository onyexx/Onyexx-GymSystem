package za.co.onyexx_gymsystem.person.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.onyexx_gymsystem.persons.entities.Employee;
@WebServlet(urlPatterns = "EmployeeServlet")
public class EmployeeServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest req, HttpServletResponse rep) {
		Employee.login();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

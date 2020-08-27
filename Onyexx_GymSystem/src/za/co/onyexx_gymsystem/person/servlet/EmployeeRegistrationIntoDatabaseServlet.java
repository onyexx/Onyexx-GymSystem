package za.co.onyexx_gymsystem.person.servlet;

import java.io.IOException;
import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.co.onyexx_gymsystem.persons.entities.Employee;
import za.co.onyexx_gymsystem.persons.entities.session.SessionManagement;
@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/EmpRegistration.jsp")
public class EmployeeRegistrationIntoDatabaseServlet extends HttpServlet{
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse rep) {
		
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse rep) {
		EntityManager em = SessionManagement.getEntityManager();
		em.getTransaction().begin();
		
		String firstname = req.getParameter("first_name");
		String lastname = req.getParameter("last_name");
		String gender = req.getParameter("gender");
		long phonenumber = Long.parseLong("phone_number");
		String city = req.getParameter("city");
		 String province = req.getParameter("province");
		 String country = req.getParameter("country");
		 int postalCode =Integer.parseInt(req.getParameter("postal_code")); 
		 String suburb = req.getParameter("suburb");
		 String street = req.getParameter("street");
		 String year = req.getParameter("year");
		 String day = req.getParameter("day");
		 String month = req.getParameter("month");
		 String dateOfBirth = year + "/" + month + "/" + day ;
		 String idNumber = req.getParameter("id_number");
		 String emailAddress = req.getParameter("email_address");
		 String nationality = req.getParameter("nationality");
		 String position = req.getParameter("position");
		 String username = req.getParameter("username");
		 String password = req.getParameter("password");
		 Employee emp = new Employee(firstname, lastname, gender, phonenumber, city, province, country, postalCode,
					suburb, street, dateOfBirth, idNumber, emailAddress, nationality, position, username, password);
    
		 em.persist(emp);
		 em.getTransaction().commit();
		 
		 
		 try {
			 req.getRequestDispatcher("EmployeeRegistration.js").forward(req, rep);
			 
		 }catch(ServletException e) {
			 e.printStackTrace();
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
		//Employee.login();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}

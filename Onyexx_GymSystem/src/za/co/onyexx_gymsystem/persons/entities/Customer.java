package za.co.onyexx_gymsystem.persons.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private int id;
	
	@Column(name = "first_name")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "gender" )
	private char gender;
	
	@Column(name = "phone_number")
	private long phoneNumber;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "province")
	private String province;
	
	@Column(name = "country")
	private String country;
	
	@Column(name = "postal_code")
	private int postalCode;
	
	@Column(name = "suburb")
	private String suburb;
	
	@Column(name = "street")
	private String street;
	
	@Column(name = "date_of_birth")
	private LocalDate dateOfBirth;
	
	@Column(name = "id_number")
	private String idNumber;
	
	@Column(name = "email_address")
	private String emailAddress;
	
	@Column(name = "nationality")
	private String nationality;
	

}

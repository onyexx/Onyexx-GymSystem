package za.co.onyexx_gymsystem.persons.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name ="employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "employee_id")
	private long id;
	
	@Column(name = "first_name")
	private String firstname;
	
	@Column(name = "lastname")
	private String lastname;
	
	@Column(name = "gender" )
	private String gender;
	
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
	
	@Column(name = "position")
	private String position;
	
	@Column(name = "password")
	private static String password;
	
	@Column(name = "username")
	private static String username;
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public long getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}


	public String getSuburb() {
		return suburb;
	}


	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	public String getIdNumber() {
		return idNumber;
	}


	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}


	public String getEmailAddress() {
		return emailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}


	public String getNationality() {
		return nationality;
	}


	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getPosition() {
		return position;
	}


	public void setPosition(String position) {
		this.position = position;
	}


	public static String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		Employee.password = password;
	}


	public static String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		Employee.username = username;
	}


	public Employee(long id, String firstname, String lastname, String gender, long phoneNumber, String city,
			String province, String country, int postalCode, String suburb, String street, LocalDate dateOfBirth,
			String idNumber, String emailAddress, String nationality, String position, String password,
			String username) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.province = province;
		this.country = country;
		this.postalCode = postalCode;
		this.suburb = suburb;
		this.street = street;
		this.dateOfBirth = dateOfBirth;
		this.idNumber = idNumber;
		this.emailAddress = emailAddress;
		this.nationality = nationality;
		this.position = position;
		Employee.password = password;
		Employee.username = username;
	}


	public Employee(String firstname2, String lastname2, String gender2, long phonenumber2, String city2, String province2, String country2, int postalCode2, String suburb2, String street2, String dateOfBirth2, String idNumber2, String emailAddress2, String nationality2, String position2, String username2, String password2) {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "EmployeeServlet [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", gender="
				+ gender + ", phoneNumber=" + phoneNumber + ", city=" + city + ", province=" + province + ", country="
				+ country + ", postalCode=" + postalCode + ", suburb=" + suburb + ", street=" + street
				+ ", dateOfBirth=" + dateOfBirth + ", idNumber=" + idNumber + ", emailAddress=" + emailAddress
				+ ", nationality=" + nationality + ", position=" + position + ", password=" + password + ", username="
				+ username + "]";
	}





@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((dateOfBirth == null) ? 0 : dateOfBirth.hashCode());
		result = prime * result + ((emailAddress == null) ? 0 : emailAddress.hashCode());
		result = prime * result + ((firstname == null) ? 0 : firstname.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + (int) (id ^ (id >>> 32));
		result = prime * result + ((idNumber == null) ? 0 : idNumber.hashCode());
		result = prime * result + ((lastname == null) ? 0 : lastname.hashCode());
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		result = prime * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + postalCode;
		result = prime * result + ((province == null) ? 0 : province.hashCode());
		result = prime * result + ((street == null) ? 0 : street.hashCode());
		result = prime * result + ((suburb == null) ? 0 : suburb.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (country == null) {
			if (other.country != null)
				return false;
		} else if (!country.equals(other.country))
			return false;
		if (dateOfBirth == null) {
			if (other.dateOfBirth != null)
				return false;
		} else if (!dateOfBirth.equals(other.dateOfBirth))
			return false;
		if (emailAddress == null) {
			if (other.emailAddress != null)
				return false;
		} else if (!emailAddress.equals(other.emailAddress))
			return false;
		if (firstname == null) {
			if (other.firstname != null)
				return false;
		} else if (!firstname.equals(other.firstname))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id != other.id)
			return false;
		if (idNumber == null) {
			if (other.idNumber != null)
				return false;
		} else if (!idNumber.equals(other.idNumber))
			return false;
		if (lastname == null) {
			if (other.lastname != null)
				return false;
		} else if (!lastname.equals(other.lastname))
			return false;
		if (nationality == null) {
			if (other.nationality != null)
				return false;
		} else if (!nationality.equals(other.nationality))
			return false;
		if (phoneNumber != other.phoneNumber)
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (postalCode != other.postalCode)
			return false;
		if (province == null) {
			if (other.province != null)
				return false;
		} else if (!province.equals(other.province))
			return false;
		if (street == null) {
			if (other.street != null)
				return false;
		} else if (!street.equals(other.street))
			return false;
		if (suburb == null) {
			if (other.suburb != null)
				return false;
		} else if (!suburb.equals(other.suburb))
			return false;
		return true;
	}


public static void login() {

	//String username;
	//String password;
	int attempt = 0;
	int count = 0;
	
	for( attempt= 0; attempt < 3; ++attempt) {
         
		
		if(username.equalsIgnoreCase(getUsername()) && password.equals(getPassword())) {
			System.out.println("YOU HAVE SUCCESSFULLY LOGIN:");
			break;
		}
	
		else if(count == 3){
			System.out.println("MAXIMMUM ATTEMPT REACHED YOUR ACCOUNT IS BLOCKED CONTACT MANAGEMENT FOR HELP");
		
				
		}else {
			System.out.println("INVALID USERNAME OR PASSWORD PLEASE TRY AGAIN");
			System.out.println("you have "+ " "+ count +" /3 attempt left");
		
			
		}
		
		}

	
}

}




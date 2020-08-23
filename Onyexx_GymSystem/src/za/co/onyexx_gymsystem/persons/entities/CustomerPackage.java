package za.co.onyexx_gymsystem.persons.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_package")
public class CustomerPackage {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name = "package_id")
	private int packageid;
	
	@Column(name = "package_name")
	private String packagename;
	
	@Column(name = "package_price")
	private double packageprice;

}

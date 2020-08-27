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

	
	public int getPackageid() {
		return packageid;
	}

	public void setPackageid(int packageid) {
		this.packageid = packageid;
	}

	public String getPackagename() {
		return packagename;
	}

	public void setPackagename(String packagename) {
		this.packagename = packagename;
	}

	public double getPackageprice() {
		return packageprice;
	}

	public void setPackageprice(double packageprice) {
		this.packageprice = packageprice;
	}

	@Override
	public String toString() {
		return "CustomerPackage [packageid=" + packageid + ", packagename=" + packagename + ", packageprice="
				+ packageprice + "]";
	}

	public CustomerPackage(int packageid, String packagename, double packageprice) {
		super();
		this.packageid = packageid;
		this.packagename = packagename;
		this.packageprice = packageprice;
	}

	public CustomerPackage() {
		super();
		// TODO Auto-generated constructor stub
	}

}

package text.Hibernateassingment;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Embeddable   //Entity uses a compound key
public class Address {
	
	

	

	public Address() {
		
		// TODO Auto-generated constructor stub
	}
	
	//genrate getter and setter method of each variabl
	public String getEhname() {
		return ehname;
	}
	public void setEhname(String ehname) {
		this.ehname = ehname;
	}
	public String getEarea() {
		return earea;
	}
	public void setEarea(String earea) {
		this.earea = earea;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	public int getEpincode() {
		return epincode;
	}
	public void setEpincode(int epincode) {
		this.epincode = epincode;
	}
	//this is private variable of Address class
	@Id
	 
	private String ehname;
	private String earea;
	private String ecity;
	private  int epincode;
	

}

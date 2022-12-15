package text.Hibernateassingment;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity    //this annotation marks this class as an entity


//@Table annotation specifies the table name where data of this entity is to be persisted.
@Table(name="Employeeinfo1")


public class Employeeinfo {
	
	//generate getter and setter method of Address  
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Employeeinfo() {
		
		// TODO Auto-generated constructor stub
	}

	
	//generate getter and setter method of Employeeinfo class variable
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdept() {
		return edept;
	}
	public void setEdept(String edept) {
		this.edept = edept;
	}
	public int getEsalary() {
		return esalary;
	}
	public void setEsalary(int esalary) {
		this.esalary = esalary;
	}
	@Id    //this  annotation marks the identifier for this entity.
	
	//private variable of Employeeinfo class
	private int eid;
	private String ename;
	private String edept;
	private int esalary;
	private Address address;

}

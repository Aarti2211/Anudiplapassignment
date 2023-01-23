package com.example.Model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity       //used to consider class as table
@Table(name="CarShowroominfo")
//pojo class
public class CarShowroom {
	
	//withoutparametrised constructor
	public CarShowroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	//parametrised constructor
	public CarShowroom(int showroomid,
			@NotNull(message = "showroomname is not null") @NotBlank(message = "showroomname is not blank") String showroomname,
			@NotNull(message = "contactno is not null") String contactno,
			@NotEmpty(message = "Email is not empty") @Email(message = "Valid email is required") String email,
			@NotNull(message = "Address not null") String address, List<Customer> customerlist) {
		super();
		this.showroomid = showroomid;
		this.showroomname = showroomname;
		this.contactno = contactno;
		this.email = email;
		this.address = address;
		this.customerlist = customerlist;
	}

	//Generate getter and setter method of all private variables of CarShowroom class
	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public int getShowroomid() {
		return showroomid;
	}

	public void setShowroomid(int showroomid) {
		this.showroomid = showroomid;
	}

	public String getShowroomname() {
		return showroomname;
	}

	public void setShowroomname(String showroomname) {
		this.showroomname = showroomname;
	}

	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Customer> getCustomerlist() {
		return customerlist;
	}

	public void setCustomerlist(List<Customer> customerlist) {
		this.customerlist = customerlist;
	}

	@Id   //used to set primary key to showroomid
	@GeneratedValue(strategy=GenerationType.AUTO)//auto increament
	private int showroomid;
	
	@NotBlank(message="showroomname is not blank")   //used to add not blank validation 
	private String showroomname;
	
	@NotNull(message="contactno is not null")
	private String contactno;
	
	@NotEmpty(message="Email is not empty")
	@Email(message="Valid email is required")    //used to valid email
	private String email;
	
	@NotNull(message="Address not null")
	private String address;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)     //this annotation used to make onetomany relationship
	List<Customer> customerlist;								//mapping another table

}

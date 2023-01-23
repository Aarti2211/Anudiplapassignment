package com.example.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Entity  //used to consider class as table
@Table(name="Customerinfo")

//pojo class
public class Customer {
	
	//without parameterized constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	//parameterized constructor
	public Customer(int customerid, @Positive(message = "value must be positive") String adarcardno,
			@NotNull(message = "Name is Manditory") String customername,
			@Email(message = "Enter valid Email") @NotBlank(message = "Email is required") String email,
			String contactno,
			@NotBlank(message = "Address is required") @NotNull(message = "Address is not null") String address,
			@NotBlank(message = "Gender is required") @NotNull(message = "Gender is not null") String gender,
			@Positive(message = "value must be positive") @Min(value = 18, message = "Age should not be less than 18") int age,
			@NotBlank(message = "purchesescar is required") @NotNull(message = "purchesescar is not null") String purchesescar) {
		super();
		this.customerid = customerid;
		this.adarcardno = adarcardno;
		this.customername = customername;
		this.email = email;
		this.contactno = contactno;
		this.address = address;
		this.gender = gender;
		this.age = age;
		this.purchesescar = purchesescar;
	}
	
	
		//generate getter and setter method of all private variables of Customer class
	public String getAdarcardno() {
		return adarcardno;
	}

	public void setAdarcardno(String adarcardno) {
		this.adarcardno = adarcardno;
	}

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPurchesescar() {
		return purchesescar;
	}

	public void setPurchesescar(String purchesescar) {
		this.purchesescar = purchesescar;
	}
	
	//Define private variables of Customer class
	
	
	@Id      //this annotation used to set primary key to customerid
	@GeneratedValue(strategy=GenerationType.AUTO)  //used to auto increament
	private  int customerid;
	
	private String adarcardno;
	
	@NotNull(message ="Name is Manditory") //used to add validation is not null value
	private String customername;
	
	@Email(message="Enter valid Email")//for valid email
	@NotBlank(message="Email is required")
	private String email;
	
	@NotBlank(message="Contactno is required")
	private String contactno;
	
	@NotBlank(message="Address is required")
	@NotNull(message="Address is not null")
	private String address;
	
	@NotBlank(message="Gender is required")
	@NotNull(message="Gender is not null")
	private String gender;
	
	@Positive(message = "value must be positive")   //for positive age value
	 @Min(value = 18, message = "Age should not be less than 18")
	private int age;
	
	@NotBlank(message="purchesescar is required")
	@NotNull(message="purchesescar is not null")
	private String purchesescar;

	
	

}

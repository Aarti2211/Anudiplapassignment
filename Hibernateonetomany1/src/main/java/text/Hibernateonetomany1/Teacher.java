package text.Hibernateonetomany1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

//this annotation used to say this class has table
@Entity
public class Teacher {
	
	//constructor
	public Teacher() {
		
		// TODO Auto-generated constructor stub
	}
	
	//getter and setter method for all private variable of Teacher class
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeachername() {
		return teachername;
	}
	public void setTeachername(String teachername) {
		this.teachername = teachername;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}

//All are private varible of Teacher class	
	//this annotation used to say this variable has primary key in table
	@Id
	private int teacherid;
	private String teachername;
	private String department;
	
	//This annotation used to create onetomany relation between Teacher and Course class or table
	@OneToMany
	List<Course>course;
	

}

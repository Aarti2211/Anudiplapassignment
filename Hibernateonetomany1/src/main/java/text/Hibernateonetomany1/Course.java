package text.Hibernateonetomany1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//this annotation used to say this class has table
@Entity
public class Course {
	
	//getter and setter method oif Course class
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	//this annotation used to say this varible has primary key of table
	@Id
	private int courseid;
	private String course;
	//make many to one realtion between course and teacher
	@ManyToOne
	@JoinColumn(name="teacherid")
	private Teacher teacher;

}

package studentreg;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.joda.time.DateTime;


public class Student {
	private String name;
	private int age;
	private DateTime dateOfBirth;
	private UUID id;
	
	private ArrayList<Course> courses;
	private ArrayList<Module> modules;
	
	public Student() {
		this.id = UUID.randomUUID();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public DateTime getDateOfBirth() {
		return dateOfBirth;
	}
	
	public void setDateOfBirth(DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	
	public UUID getId() {
		return id;
	}
	
	public String getUsername() {
		return name.replace(" ", ".") + age;
	}
	
	public ArrayList<Course> getCourses() {
		return courses;
	}
	
	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	public ArrayList<Module> getModules() {
		return modules;
	}
	
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
}

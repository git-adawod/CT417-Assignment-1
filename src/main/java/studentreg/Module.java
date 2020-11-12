package studentreg;

import java.util.ArrayList;
import java.util.List;

public class Module {
	private String name;
	private String code;
	private ArrayList<Student> registeredStudents;
	private ArrayList<Course> associatedCourses;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public ArrayList<Student> getRegisteredStudents() {
		return registeredStudents;
	}
	
	public void setRegisteredStudents(ArrayList<Student> registeredStudents) {
		this.registeredStudents = registeredStudents;
	}
	
	public ArrayList<Course> getAssociatedCourses() {
		return associatedCourses;
	}
	
	public void setAssociatedCourses(ArrayList<Course> associatedCourses) {
		this.associatedCourses = associatedCourses;
	}
} 

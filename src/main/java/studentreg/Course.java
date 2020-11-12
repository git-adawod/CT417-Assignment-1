package studentreg;

import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

public class Course {
	private String name;
	private String code;
	private ArrayList<Student> registeredStudents;
	private ArrayList<Module> modules;
	private DateTime startDate;
	private DateTime endDate;
	
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
	
	public ArrayList<Module> getModules() {
		return modules;
	}
	
	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	
	public DateTime getStartDate() {
		return startDate;
	}
	
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	
	public DateTime getEndDate() {
		return endDate;
	}
	
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
}

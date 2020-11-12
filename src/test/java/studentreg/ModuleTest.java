package studentreg;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ModuleTest {

	@Test
	public void test() {
		String code = "CT413";
		String name = "information technology";
		Student student = new Student();
		Course course = new Course();
		
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Course> courses = new ArrayList<Course>();
		
		students.add(student);
		courses.add(course);
		
		Module module = new Module();
		
		module.setCode(code);
		module.setName(name);
		module.setAssociatedCourses(courses);
		module.setRegisteredStudents(students);
		
		assert module.getCode() == code;
		assert module.getName() == name;
		assert module.getAssociatedCourses().get(0) == course;
		assert module.getRegisteredStudents().get(0) == student;
	}	

}

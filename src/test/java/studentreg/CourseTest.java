package studentreg;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.joda.time.DateTime;

public class CourseTest {

	@Test
	public void test() {
		Course course = new Course();
		Module module = new Module();
		Student student = new Student();
		
		ArrayList<Student> students = new ArrayList<Student>();
		ArrayList<Module> modules = new ArrayList<Module>();
		students.add(student);
		modules.add(module);
		
		String code = "GY350";
		String name = "CompSci & IT";
		DateTime start = new DateTime(2020, 9, 1, 8, 0, 0);
		DateTime end = new DateTime(2021, 6, 15, 20, 0, 0);
		
		course.setCode(code);
		course.setEndDate(end);
		course.setModules(modules);
		course.setName(name);
		course.setRegisteredStudents(students);
		course.setStartDate(start);
		
		assert course.getCode()  == code;
		assert course.getEndDate() == end;
		assert course.getStartDate() == start;
		assert course.getModules() == modules;
		assert course.getName() == name;
		assert course.getRegisteredStudents() == students;
	}

}

package studentreg;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.joda.time.DateTime;

public class StudentTest {
	
	private Student studentFixture;
	private String studentName = "John Doe";
	private int studentAge = 21;
	private DateTime studentDoB = new DateTime(1998, 11, 14, 0, 0, 0);
	
	@Before
	public void createStudent() {
		//init student test fixture
		
		studentFixture = new Student();
		studentFixture.setAge(studentAge);
		studentFixture.setName(studentName);
		studentFixture.setDateOfBirth(studentDoB);
	}

	@Test
	public void test_can_get_student_values() {
		//test to ensure we can retrieve student values
		
		int age = studentFixture.getAge();
		String name = studentFixture.getName();
		DateTime dob = studentFixture.getDateOfBirth();
		
		assert age == studentAge;
		assert name == studentName;
		assert dob == studentDoB;
	}
	
	@Test
	public void test_can_set_student_values() {
		//test to ensure we can set the student values
		
		DateTime newDoB = new DateTime(1988, 11, 14, 0, 0, 0);
		int newAge = 31;
		String newName = "Michael Braum";
		
		studentFixture.setAge(newAge);
		studentFixture.setName(newName);
		studentFixture.setDateOfBirth(newDoB);
		
		assert studentFixture.getAge() == newAge;
		assert studentFixture.getName() == newName;
		assert studentFixture.getDateOfBirth() == newDoB;
	}
	
	@Test
	public void test_get_username_concatenates_name_and_age() {
		//test to ensure the auto functionality of get username
		
		assert studentFixture.getUsername().equals(studentFixture.getName().replace(" ", ".") + studentFixture.getAge());
	}
	
	@Test
	public void test_student_id_is_randomly_generated() {
		//test to ensure that students are assigned a unique random UUID
		
		Student newStudent = new Student();
		
		assert newStudent.getId() != studentFixture.getId();
	}
}

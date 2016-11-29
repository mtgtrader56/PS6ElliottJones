package base;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import domain.StudentDomainModel;

public class Student_Test {
	private static StudentDomainModel student1;
	private static UUID student1UUID = UUID.randomUUID();	


	@BeforeClass
	public static void studentinstance() throws Exception {
		Date student1Birth = null;


		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		 student1 = new StudentDomainModel(student1);
		 
		try {
			student1Birth = dateFormat.parse("1994-11-27");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		student1.setFirstName("Mingkun");
		student1.setMiddleName("a");
		student1.setLastName("Chen");
		student1.setDOB(student1Birth);
	}


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


	@Before
	public void setUp() throws Exception {
	}


	@After
	public void tearDown() throws Exception {
	}
	@Test 
	public void testaddstudent() {
		StudentDAL.addStudent(student1);
	}
	@Test
	public void testupdatestudent() {
		StudentDAL.updateStudent(student1);
	}
	@Test
	public void testdeletestudent() {
		StudentDAL.deleteStudent(student1UUID);
	}






}


/**
 * Class: B.Sc. Cloud and Green IT in Computing
 * Instructor: Maria Boyle
 * Description: Employyee class
 * Date: 1/12/2019
 * @author Damien Duffy
 * @version 1.0
**/
//GitHUB URL: https://github.com/L00092054/Assignment-Solution.git
package ie.lyit.testers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ie.lyit.bank.*;

public class EmployeeTest {
	Employee emp = new Employee(new Name("Mr", "Damien", "Duffy"), new Date(5, 10, 1971), new Date(29, 11, 2019),
			14000.00);

	private Date day;
	private Date d2;

	@Before
	public void setUp() throws Exception {
		day = new Date();
		// Constructor test
		testEmployeeNameDateDateDouble();
		testToString();
		testCalculateWage();
		testSetStartDate();
		testSetDay();
		testSetMonth();
		testSetYear();
		testSetSalary();
		testNumber();
	}

	@Test
	public void testToString() {
		Employee testobj = new Employee(new Name("Mr", "Damien", "Duffy"), new Date(5, 10, 1971),
				new Date(29, 11, 2019), 14000.00);

		String toS = testobj.toString();
		// assertTrue(toS.contains("title=" + title));
		assertEquals(true, toS.equals(testobj.toString()));
	}

	@Test
	public void testEmployeeNameDateDateDouble() {
		// constructor test
		Employee inside = new Employee(new Name("Mr", "Damien", "Duffy"), new Date(5, 10, 1971), new Date(29, 11, 2019),
				14000.00);

		assertEquals(true, inside.equals(emp));
	}

	@Test
	public void testCalculateWage() {

		double wage = emp.calculateWage(5);
		//
		assertEquals(wage, 0, 4750);
	}

//	@Test
//	public void testIncrementSalary() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testSetStartDate() {
		// Check d1�s day is 0
		// d1=new Date();
		assertEquals(day.getDay(), 1);
		// Check d1�s month is 0, if it is not display appropriate message
		assertEquals("Month should be 0", day.getMonth(), 1);
		// Check d1�s year is 5, if it is not display appropriate message
		assertEquals("Year should be 0", day.getYear(), 1900);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testDateIntIntInt() {
		d2 = new Date(34, 15, 1999);
	}

	@Test
	public void testSetDay() {
		day.setDay(1);
		// Check d1�s day is 1
		assertEquals(day.getDay(), 1);
	}

	@Test
	public void testSetMonth() {
		day.setMonth(1);
		// Check d1�s month is 1
		assertEquals(day.getMonth(), 1);
	}

	@Test
	public void testSetYear() {
		day.setYear(1900);
		// Check d1�s year is 2017
		assertTrue(day.getYear() == 1900);
	}

	@Test
	public void testSetSalary() {
		Employee inside2 = new Employee(new Name("Mr", "Damien", "Duffy"), new Date(5, 10, 1971),
				new Date(29, 11, 2019), 14000.00);

		inside2.setSalary(160000);
	}

	@Test
	public void testNumber() {
		Employee inside2 = new Employee(new Name("Mr", "Damien", "Duffy"), new Date(5, 10, 1971),
				new Date(29, 11, 2019), 14000.00);

		assertEquals(0, inside2.getNumber());

	}

}

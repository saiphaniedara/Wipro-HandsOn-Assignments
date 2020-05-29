package junit.tests;
import java.util.ArrayList;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testFindName() {
		
		ArrayList<String> employees=new ArrayList<String>();
		employees.add("Phani");
		employees.add("Surya");
		employees.add("Sai");
		employees.add("Pavan");
		employees.add("Bhargav");
		Employee e=new Employee();
		assertEquals("FOUND",e.findName(employees,"Surya"));
		assertEquals("NOT FOUND",e.findName(employees,"Teja"));
		
	}

}

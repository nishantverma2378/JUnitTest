package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddNumbers {

	@Test
	public void test() {
		JUnitFunction junit= new JUnitFunction();
		int result =junit.addNumbers(101, 200);
		assertEquals(301,result);
		
	}

}

package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddStrings {

	@Test
	public void test() {
		
		JUnitFunction  junitstring=new JUnitFunction();
		String result= junitstring.addStrings("software", "Engineering");
		assertEquals("softwareEngineering",result);
	}

}

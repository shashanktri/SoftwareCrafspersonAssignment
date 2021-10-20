package JUnitTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import exceptions.NegativeNumberException;
import sumCalculate.TwoSumCalulator;

class TestSumCalculate {

	TwoSumCalulator obj=new TwoSumCalulator();
	@Test
	void testSumCalcuate() {
		
		//Positive Test
		assertEquals(20,obj.sumTwoCalulate("15,5"));
	}
	@Test
	   public void testException() {	
		try {
			obj.sumTwoCalulate("-15,5");
		}catch(Exception e) {
			assertEquals("negatives not allowed",e.getMessage());
		}
	   }
}

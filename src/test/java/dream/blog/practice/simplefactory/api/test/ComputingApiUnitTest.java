package dream.blog.practice.simplefactory.api.test;

import java.math.BigDecimal;

import org.junit.Test;
import static org.junit.Assert.*;

import dream.blog.practice.simplefactory.api.ComputingApi;
import dream.blog.practice.sipmlefactory.impl.SimpleCalculator;

public class ComputingApiUnitTest {
	@Test
	public void testAddition() {
		//Arrange
		ComputingApi api = new SimpleCalculator();
		BigDecimal operand1 = new BigDecimal(53.2);
		BigDecimal operand2 = new BigDecimal(48.7);
		BigDecimal expected = new BigDecimal(101.9);
		
		//Act
		BigDecimal result = api.compute(operand1, operand2, "+");
		
		//Assert
		assertTrue(expected.compareTo(result) == 0);
	}
	
	@Test
	public void testSubtraction() {
		//Arrange
		ComputingApi api = new SimpleCalculator();
		BigDecimal operand1 = new BigDecimal(53.2);
		BigDecimal operand2 = new BigDecimal(48.7);
		BigDecimal expected = new BigDecimal(4.5);
		
		//Act
		BigDecimal result = api.compute(operand1, operand2, "-");
		
		//Assert
		assertTrue(expected.compareTo(result) == 0);
	}
}

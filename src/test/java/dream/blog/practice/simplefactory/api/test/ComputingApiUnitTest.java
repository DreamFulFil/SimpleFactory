package dream.blog.practice.simplefactory.api.test;

import static org.junit.Assert.assertTrue;

import java.math.BigInteger;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import dream.blog.practice.simplefactory.api.ComputingApi;
import dream.blog.practice.sipmlefactory.impl.SimpleCalculator;

public class ComputingApiUnitTest {
	
	private ComputingApi api;
	private BigInteger operand1; 
	private BigInteger operand2;
	
	@Before
	public void before() {
		api = new SimpleCalculator();
		operand1 = BigInteger.valueOf(15);
		operand2 = BigInteger.valueOf(8);
	}
	
	@Test
	public void testAddition() {
		//Arrange
		BigInteger expected = BigInteger.valueOf(23);
		
		//Act
		BigInteger result = api.compute(operand1, operand2, "+");
		
		//Assert
		assertTrue(expected.compareTo(result) == 0);
	}
	
	@Test
	public void testSubtraction() {
		//Arrange
		BigInteger expected = BigInteger.valueOf(7);
		
		//Act
		BigInteger result = api.compute(operand1, operand2, "-");
		
		//Assert
		assertTrue(expected.compareTo(result) == 0);
	}
	
	@Test
	public void testMultiplication(){
		//Arrange
		BigInteger expected = BigInteger.valueOf(120);
		
		//Act
		BigInteger result = api.compute(operand1, operand2, "*");
		//Assert
		assertTrue(expected.compareTo(result) == 0);
	}
	
	@Test
	public void testDivision() {
		//Arrange
		BigInteger expected = BigInteger.valueOf(1);
		
		//Act
		BigInteger result = api.compute(operand1, operand2, "/");
		//Assert
		assertTrue(expected.compareTo(result) == 0);
	}
	
	@After
	public void after() {
		operand1 = null;
		operand2 = null;
		api = null;
	}
}

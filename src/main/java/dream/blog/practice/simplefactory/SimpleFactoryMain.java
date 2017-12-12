package dream.blog.practice.simplefactory;

import java.math.BigDecimal;

import dream.blog.practice.simplefactory.api.ComputingApi;
import dream.blog.practice.sipmlefactory.impl.SimpleCalculator;

public class SimpleFactoryMain{
	public static void main(String[] args) {
		ComputingApi api = new SimpleCalculator();
		BigDecimal result = api.compute(new BigDecimal(1), new BigDecimal(2),"+");
		System.err.println(result);
	}
}
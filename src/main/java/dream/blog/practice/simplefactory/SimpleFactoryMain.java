package dream.blog.practice.simplefactory;

import java.math.BigInteger;

import dream.blog.practice.simplefactory.api.ComputingApi;
import dream.blog.practice.sipmlefactory.impl.SimpleCalculator;

public class SimpleFactoryMain{
	public static void main(String[] args) {
		ComputingApi api = new SimpleCalculator();
		BigInteger result = api.compute(BigInteger.valueOf(1), BigInteger.valueOf(2),"+");
		System.err.println(result);
	}
}
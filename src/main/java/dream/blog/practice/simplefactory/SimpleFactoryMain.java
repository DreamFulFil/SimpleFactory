package dream.blog.practice.simplefactory;

import java.math.BigInteger;

import dream.blog.practice.simplefactory.api.ComputingApi;
import dream.blog.practice.simplefactory.factory.ComputingApiFactory;

public class SimpleFactoryMain{
	public static void main(String[] args) {
		ComputingApi api = ComputingApiFactory.getComputingApi(1);
		BigInteger result = api.compute(BigInteger.valueOf(1), BigInteger.valueOf(2),"+");
		System.err.println(result);
		
		api = ComputingApiFactory.getComputingApi(2);
		BigInteger result2 = api.compute(BigInteger.valueOf(2), BigInteger.valueOf(8), "^");
		System.err.println(result2);
	}
}
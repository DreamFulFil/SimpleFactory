package dream.blog.practice.simplefactory.impl;

import java.math.BigInteger;

import dream.blog.practice.simplefactory.api.ComputingApi;

public class SimpleCalculator implements ComputingApi {

	@Override
	public BigInteger compute(BigInteger operand1, BigInteger operand2, String operator) {
		switch(operator) {
			case "+":
				return operand1.add(operand2);
			case "-":
				return operand1.subtract(operand2);
			case "*":
				return operand1.multiply(operand2);
			case "/":
				return operand1.divide(operand2);
		}
		return null;
	}

}

package dream.blog.practice.sipmlefactory.impl;

import java.math.BigDecimal;

import dream.blog.practice.simplefactory.api.ComputingApi;

public class SimpleCalculator implements ComputingApi {

	@Override
	public BigDecimal compute(BigDecimal operand1, BigDecimal operand2, String operator) {
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

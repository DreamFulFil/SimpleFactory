package dream.blog.practice.sipmlefactory.impl;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.text.NumberFormat;

import dream.blog.practice.simplefactory.api.ComputingApi;

public class EngineeringCalculator implements ComputingApi {

	@Override
	public BigInteger compute(BigInteger operand1, BigInteger operand2, String operator) {
		switch (operator) {
			case "^":
				double tempResult = Math.pow(operand1.doubleValue(), operand2.doubleValue());
				NumberFormat decimalFormat = new DecimalFormat("#");
		        decimalFormat.setMaximumFractionDigits(15);
				String strResult = decimalFormat.format(tempResult);
				Long intResult = Long.parseLong(strResult);
				return BigInteger.valueOf(intResult);
		}
		return null;
	}

}

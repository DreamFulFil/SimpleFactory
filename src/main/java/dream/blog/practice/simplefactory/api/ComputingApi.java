package dream.blog.practice.simplefactory.api;

import java.math.BigDecimal;

public interface ComputingApi {

	BigDecimal compute(BigDecimal operand1, BigDecimal operand2, String operator);
	
}

package dream.blog.practice.sipmlefactory.factory;

import dream.blog.practice.simplefactory.api.ComputingApi;
import dream.blog.practice.sipmlefactory.impl.SimpleCalculator;

public class ComputingApiFactory {
	public static ComputingApi getComputingApi() {
		return new SimpleCalculator();
	}
}

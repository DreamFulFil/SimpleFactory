package dream.blog.practice.simplefactory.factory;

import dream.blog.practice.simplefactory.api.ComputingApi;
import dream.blog.practice.sipmlefactory.impl.EngineeringCalculator;
import dream.blog.practice.sipmlefactory.impl.SimpleCalculator;

public class ComputingApiFactory {
	public static ComputingApi getComputingApi(int type) {
		switch(type) {
		case 1:
			return new SimpleCalculator();
		case 2:
			return new EngineeringCalculator();
		}
		return null;
	}
}

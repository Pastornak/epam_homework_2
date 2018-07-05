package com.epam.lab.homework2.task5;

import java.lang.reflect.Field;

public class Main {

	public static void main(String[] args) 
			throws NoSuchFieldException, SecurityException, IllegalArgumentException
			, IllegalAccessException, ClassNotFoundException, InstantiationException {
		CustomClass cc = new CustomClass("Original data");
		System.out.println(cc.getData());
		@SuppressWarnings("rawtypes")
		Class ccClass = cc.getClass();
		Field dataField = ccClass.getDeclaredField("data");
		dataField.setAccessible(true);
		Object input = dataField.getType().newInstance();
		if(input instanceof String){
			input = (Object) "New data";
		}
		if(input instanceof Integer){
			input = (Object) 1;
		}
		//etc
		dataField.set(cc, input);
		System.out.println(cc.getData());
	}

}

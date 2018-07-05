package com.epam.lab.homework2.task6;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		CustomClass cc = new CustomClass();
		Class ccClass = cc.getClass();
		Method myMethod1 = ccClass.getMethod("myMethod", String.class, int[].class);
		Method myMethod2 = ccClass.getMethod("myMethod", String[].class);
		System.out.println("Calling method with string and ints");
		System.out.println(myMethod1.invoke(cc, "Call 1", new int[]{1, 2, 3, 4, 5}));
		System.out.println(myMethod1.invoke(cc, "Call 2", new int[]{10, 9, 8, 7, 6}));
		
		System.out.println("Calling method with strings");
		System.out.println(myMethod2.invoke(cc, new Object[]{new String[]{"Let's", "make", "this", "a", "sentence"}}));
		System.out.println(myMethod2.invoke(cc, new Object[]{new String[]{"One", "more", "sentence"}}));
	}

}

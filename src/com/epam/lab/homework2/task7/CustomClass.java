package com.epam.lab.homework2.task7;

import java.lang.reflect.Modifier;
import java.util.Arrays;

public class CustomClass {

	@SuppressWarnings("rawtypes")
	public static <T> String getInfoAboutObject(T object){
		StringBuilder result = new StringBuilder();
		Class objectClass = object.getClass();
		result.append(getHeader(objectClass));
		result.append("\n");
		result.append(getFields(objectClass));
		result.append("\n");
		result.append(getMethods(objectClass));
		return result.toString();
	}
	
	@SuppressWarnings("rawtypes")
	public static String getHeader(Class input){
		StringBuilder result = new StringBuilder();
		result.append(Modifier.toString(input.getModifiers()) + " ");
		result.append(input.getSimpleName() + "\n");
		return result.toString();
	}
	
	@SuppressWarnings("rawtypes")
	private static String getFields(Class input){
		StringBuilder result = new StringBuilder();
		Arrays.asList(input.getDeclaredFields()).forEach(f -> {
			result.append(Modifier.toString(f.getModifiers()) + " ");
			result.append(f.getName() + "\n");
		});
		return result.toString();
	}
	
	@SuppressWarnings("rawtypes")
	private static String getMethods(Class input){
		StringBuilder result = new StringBuilder();
		Arrays.asList(input.getDeclaredMethods()).forEach(m -> {
			result.append(Modifier.toString(m.getModifiers()) + " ");
			result.append(m.getReturnType().getSimpleName() + " ");
			result.append(m.getName() + "(");
			Arrays.asList(m.getParameterTypes()).forEach(t ->{
				result.append(t.getSimpleName() + ", ");
			});
			if(m.getParameterTypes().length == 0){
				result.append(")");
			} else{
				result.replace(result.length() - 2, result.length() - 1, ")");
			}
			result.append("\n");
		});
		return result.toString();
	}
}

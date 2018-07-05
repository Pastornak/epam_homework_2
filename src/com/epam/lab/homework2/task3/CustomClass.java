package com.epam.lab.homework2.task3;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomClass {

	@CustomAnnotation
	private String defaultData;
	
	@CustomAnnotation(description = "Description for modified data")
	private String modifiedData;
	
	public CustomClass(){
		defaultData = "Default data";
		modifiedData = "Modified data";
	}
	
	public List<String> getAnnotationWithValues(Class<? extends Annotation> annotation){
		@SuppressWarnings("rawtypes")
		Class thisClass = this.getClass();
		Field[] fields = thisClass.getDeclaredFields();
		return Arrays.asList(fields).stream()
				.map(a -> getStringForField(a))
				.collect(Collectors.toList());
	}
	
	private String getStringForField(Field field){
		StringBuilder result = new StringBuilder();
		result.append("Annotations for field ");
		result.append(field.getName());
		result.append("\n");
		Arrays.asList(field.getDeclaredAnnotations()).forEach(f -> result.append(f.toString() + "\n"));
		return result.toString();
	}
}

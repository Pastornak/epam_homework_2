package com.epam.lab.homework2.task2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CustomClass {

	private static long ID;
	
	@CustomAnnotation
	private long id;
	@CustomAnnotation
	private char customField;
	
	private String data;
	
	static{
		ID = 1;
	}
	
	public CustomClass(){
		this.id = ID;
	}
	
	public CustomClass(String data){
		this.id = ID;
		this.data = data;
	}
	
	public String getData(){
		return data;
	}
	
	public void setData(String data){
		this.data = data;
	}
	
	public List<String> getFieldsWithAnnotation(Class<? extends Annotation> annotation){
		@SuppressWarnings("rawtypes")
		Class thisClass = this.getClass();
		Field[] fields = thisClass.getDeclaredFields();
		return Arrays.asList(fields).stream()
				.filter(f -> f.isAnnotationPresent(annotation))
				.map(x -> x.toString())
				.collect(Collectors.toList());
	}
}
